package cn.onearth.jfinal_test.common.config;

import cn.onearth.jfinal_test.common.controller.HelloController;
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
        me.add("/hello", HelloController.class);
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
