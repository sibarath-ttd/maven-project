package com.spr.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by Siba on 3/16/14.
 */
public class PingClient
{
    public static void main(String... args)
    {
        String line;
        try
        {
            URL url = new URL("http://localhost:8080/maven-project-1.0/async");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            line = in.readLine();

            System.out.println(line);

            in.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
