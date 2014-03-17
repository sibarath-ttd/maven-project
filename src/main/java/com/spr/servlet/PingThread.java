package com.spr.servlet;

import javax.servlet.AsyncContext;
import java.io.PrintWriter;

/**
 * Created by Siba on 3/16/14.
 */
public class PingThread implements Runnable
{
    private final AsyncContext context;

    public PingThread(AsyncContext context)
    {
        this.context = context;
    }

    @Override
    public void run()
    {
        PrintWriter writer = null;
        try
        {
            writer = this.context.getResponse().getWriter();
            for (int i = 0; i < 100; i++)
            {
                Thread.sleep(1000L);
                writer.write(String.valueOf(i));
            }
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
        finally
        {
            this.context.complete();
        }
    }
}
