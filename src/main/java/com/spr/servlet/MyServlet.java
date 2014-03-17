package com.spr.servlet;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Siba on 3/16/14.
 */
@WebServlet(name = "myServlet", urlPatterns = {"/async"}, asyncSupported = true)
public class MyServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        AsyncContext aCtx = request.startAsync(request, response);
        aCtx.setTimeout(0L);
        aCtx.addListener(new MyAsyncListener());
        new Thread(new PingThread(aCtx)).start();
    }
}
