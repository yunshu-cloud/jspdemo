package com.wangzhixiong.servlet;

import com.wangzhixiong.pojo.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/findUsers.do")
public class FindUserServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        Users users1 = new Users(1,"hang");
        Users users2 = new Users(2,"wang");

        List<Users> list = new ArrayList<>();
        list.add(users1);
        list.add(users2);

        req.setAttribute("list",list);

        req.getRequestDispatcher("showUsers.jsp").forward(req,resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        this.doPost(req, resp);
    }
}
