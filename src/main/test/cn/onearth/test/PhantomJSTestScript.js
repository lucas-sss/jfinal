/**
 * Created by wliu on 2017/8/13 0013.
 */
var page = require('webpage').create();
var system = require('system')

var url = system.args[1]

//地址栏url改变
page.onUrlChanged = function (url) {
    console.log("Change to" + url);
};

//普通弹框
page.onAlert = function (msg) {
    console.log(msg);
};

//简单的确认框,默认返回false
page.onConfirm = function (msg) {
    if ('确认删除吗？' == msg) {
        return true;
    }
};


//弹窗交互
page.onPrompt = function (message, defaultVal) {
    if (message == 'Confirm to delete') {
        return 'yes';
    }else {
        return defaultVal;
    }
};


page.open(url, function (status) {

    if (status == 'success') {
        console.log(page.content)
    }
    phantom.exit();
});