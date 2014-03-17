package com.spr.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by Siba on 3/16/14.
 */
@WebListener
public class MyServletListener implements ServletContextListener
{
    @Override
    public void contextInitialized(ServletContextEvent sce)
    {

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce)
    {

    }
}
