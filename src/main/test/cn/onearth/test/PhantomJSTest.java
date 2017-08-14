package cn.onearth.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by wliu on 2017/8/13 0013.
 */
public class PhantomJSTest {

    public static String getAjaxContent(String url) throws Exception{

        Runtime runtime = Runtime.getRuntime();

        Process  process = runtime.exec("phantomjs E:\\gitHub\\jfinal\\src\\main\\test\\cn\\onearth\\test\\PhantomJSTestScript.js " + url);

        InputStream in = process.getInputStream();

        BufferedReader bf = new BufferedReader(new InputStreamReader(in));

        StringBuilder sb = new StringBuilder();
        String line = "";

        while ((line =  bf.readLine()) != null){
            sb.append(line);
        }
        bf.close();
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {


        String webpage = getAjaxContent("http://www.baidu.com");

        System.out.println(webpage);
    }



}
