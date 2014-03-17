package com.spr.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import java.io.IOException;

/**
 * Created by Siba on 3/16/14.
 */
public class MyAsyncListener implements AsyncListener
{
    private static final Logger LOGGER = LoggerFactory.getLogger(MyAsyncListener.class);

    @Override
    public void onComplete(AsyncEvent event) throws IOException
    {
        LOGGER.info("Servlet request completed");
    }

    @Override
    public void onTimeout(AsyncEvent event) throws IOException
    {
        LOGGER.info("Servlet request timed out");
    }

    @Override
    public void onError(AsyncEvent event) throws IOException
    {
        LOGGER.info("Servlet request error");
    }

    @Override
    public void onStartAsync(AsyncEvent event) throws IOException
    {
        LOGGER.info(" Servlet request started");
    }
}
