package org.explosiveworks.market.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DraftServlet", urlPatterns = "/draftServlet")
public class DraftServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter printWriter= response.getWriter();
        printWriter.print(getValue());
    }

    private String getValue() {
        return "value from db";
    }
}
