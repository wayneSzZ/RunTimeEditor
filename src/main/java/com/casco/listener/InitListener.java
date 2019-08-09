package com.casco.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class InitListener implements ServletContextListener {




    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("我被激活啦");
       //WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContextEvent.getServletContext());
       //initConfig = (InitConfigImpl)context.getBean("initConfig");
        //System.out.println(context);
        //System.out.println(initConfig);
        //initConfig.readConfig();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("我挂啦");
    }
}
