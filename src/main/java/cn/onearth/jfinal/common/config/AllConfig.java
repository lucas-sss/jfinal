package cn.onearth.jfinal.common.config;

import cn.onearth.jfinal.common.controller.HelloController;
import cn.onearth.jfinal.common.controller.PhantomjsController;
import com.jfinal.config.*;
import com.jfinal.render.ViewType;
import com.jfinal.template.Engine;

/**
 * Created by Liu on 2017/7/6.
 */
public class AllConfig extends JFinalConfig {
    public void configConstant(Constants me) {
        me.setDevMode(true);
        me.setViewType(ViewType.JFINAL_TEMPLATE);
    }

    public void configRoute(Routes me) {
        //me.setBaseViewPath("/jfinal_test");
        //me.addInterceptor();
        me.add("/hello", HelloController.class, "/");
        me.add("/phantomjs", PhantomjsController.class, "/html");
    }

    public void configEngine(Engine me) {

    }

    public void configPlugin(Plugins me) {

    }

    public void configInterceptor(Interceptors me) {

    }

    public void configHandler(Handlers me) {

    }
}
