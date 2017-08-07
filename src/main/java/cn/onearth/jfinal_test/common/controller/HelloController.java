package cn.onearth.jfinal_test.common.controller;

import com.jfinal.core.Controller;

/**
 * Created by Liu on 2017/7/6.
 */
public class HelloController extends Controller {

    public void index(){

        render("index.jsp");
        //renderText("hello world!");
    }
}
