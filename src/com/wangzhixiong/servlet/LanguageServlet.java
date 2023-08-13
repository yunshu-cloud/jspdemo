package com.wangzhixiong.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 在Servlet中获取客户端浏览器所支持的语言，并通过JSP页面将客户端浏览器所支持的语言响应给客户端浏览器。
 */
@WebServlet("/language.do")
public class LanguageServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        String header = req.getHeader("Accept-Language");
        // 将数据存放到Request对象中
        req.setAttribute("jsp_header",header);
        //使用请求转发调转到jsp
        req.getRequestDispatcher("showMsg.jsp").forward(req,resp);
    }
}
