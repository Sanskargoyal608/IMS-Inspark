<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    PrintWriter pw = response.getWriter();
    try
    {
       int result = 0;
       String username = request.getParameter("uname");
       String password = request.getParameter("pass");
       String email = request.getParameter("email");
       
       
    }
    catch(Exception e)
    {
       pw.print("Register jsp exception : "+e.toString());
    }
%>