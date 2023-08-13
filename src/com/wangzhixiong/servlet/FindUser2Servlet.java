package com.wangzhixiong.servlet;

import com.wangzhixiong.pojo.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/findUsers2.do")
public class FindUser2Servlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        Users users1 = new Users(1,"hang");
        Users users2 = new Users(2,"wang");

        Map<String,Users> map = new HashMap();
        map.put("user1",users1);
        map.put("user2",users2);

        req.setAttribute("map",map);

        req.getRequestDispatcher("showUsers2.jsp").forward(req,resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        this.doPost(req, resp);
    }
}
