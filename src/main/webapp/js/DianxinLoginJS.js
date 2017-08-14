/**
 * Created by wliu on 2017/8/9 0009.
 */
var page = require('webpage').create();
var system = require('system')

page.onAlert = function(msg){
    console.log(msg)
}

/**
 * 记录发送的请求
 *
 * @param request
 */
page.onResourceRequested = function(request) {
    console.log("Request:" + request.url)
}

var telecomUrl = "http://login.189.cn/web/login"
var testUrl = "http://localhost:8088/phantomjs/testHtml"


page.open(telecomUrl, function (status){

    if (status == 'success'){

        //console.info(page.content)
        //获取手机号、密码和登录按钮元素以及坐标
        //var phonePoint = page.evaluate(getElementClickPoint("testblur"));
        var point = page.evaluate(function () {
            var phoneField = document.getElementById("txtAccount");
            var passwordField = document.getElementById("txtShowPwd");
            var logindField = document.getElementById("loginbtn");
            var phoneRec = phoneField.getBoundingClientRect();
            var passwordRec = passwordField.getBoundingClientRect();
            var loginRec = logindField.getBoundingClientRect();
            return {
                phonePoint: {
                    obj: phoneField,
                    x: phoneRec.left + Math.floor(phoneRec.width / 2),
                    y: phoneRec.top + (phoneRec.height / 2)
                },
                passwordPoint: {
                    obj: phoneField,
                    x: passwordRec.left + Math.floor(passwordRec.width / 2),
                    y: passwordRec.top + (passwordRec.height / 2)
                },
                loginPoint: {
                    obj: phoneField,
                    x: loginRec.left + Math.floor(loginRec.width / 2),
                    y: loginRec.top + (loginRec.height / 2)
                }
            }
        });
        //1、先点击手机号输入框，为离焦事件做准备
        page.sendEvent("click", point.phonePoint.x, point.phonePoint.y);

        //2、填写手机号信息
        page.evaluate(function(){
            document.getElementById("txtAccount").setAttribute("data-preval", "18183642663");
        });
        //3、点击密码输入框，同时触发号码输入框的离焦事件
        page.sendEvent("click", point.passwordPoint.x, point.passwordPoint.y);

        //4、填写密码
        page.evaluate(function(){
            document.getElementById("txtShowPwd").setAttribute("data-preval", "051910");
        });

        //5、点击密码输入框，同时触发号码输入框的离焦事件
        page.sendEvent("click", point.loginPoint.x, point.loginPoint.y);

        setTimeout(function() {
            console.log(page.content);
            console.log("is over");
            //phantom.exit()
        }, 500);
    }
});