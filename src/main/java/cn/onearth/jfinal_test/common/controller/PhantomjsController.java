package cn.onearth.jfinal_test.common.controller;

import com.jfinal.core.Controller;

import javax.jws.WebMethod;

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
