package cn.onearth.jfinal_test.main;

import com.jfinal.core.JFinal;

/**
 * Created by Liu on 2017/7/6.
 */
public class StartMain {

    public static void main(String[] args) {
        JFinal.start("src/main/webapp", 80, "/");
    }
}
