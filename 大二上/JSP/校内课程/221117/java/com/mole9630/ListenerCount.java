package com.mole9630;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebListener
public class ListenerCount implements HttpSessionListener {
    private static int count = 0;

    public ListenerCount() {
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        ListenerCount.count = count;
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        /* Session is created. */
        count ++;
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        /* Session is destroyed. */
        if (count > 0) {
            count --;
        }
    }

}
