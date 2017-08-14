package cn.onearth.jfinal.common.controller;

import com.jfinal.core.Controller;

public class PhantomjsController extends Controller {

    public void testHtml(){
        render("test.html");
    }


    public void preNextHtml(){
        redirect("/phantomjs/nextHtml");
    }

    public void nextHtml(){
        render("next.html");
    }

}
