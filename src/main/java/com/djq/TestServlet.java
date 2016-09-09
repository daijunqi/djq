package com.djq;

import com.design.singleton.Singleton;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by dai on 16-8-16.
 */
public class TestServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getI());
        singleton.setI(3);

        PrintWriter out = resp.getWriter();
        out.print("ttt");
        out.flush();
        out.close();
    }
}
