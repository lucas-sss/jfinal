/**
 * Created by wliu on 2017/8/13 0013.
 */
var page = require('webpage').create();
var system = require('system')

var url = system.args[1]

page.open(url, function (status){

    if (status == 'success'){
        console.log(page.content)
    }
    phantom.exit();
});