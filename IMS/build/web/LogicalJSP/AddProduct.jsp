<%@page import="DAO.Product_Dao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    try
    {
      String pname = request.getParameter("pname");
      int pprice = Integer.parseInt(request.getParameter("price"));
      String pimg = request.getParameter("pimg");
      int pquantity = Integer.parseInt(request.getParameter("pquantity"));
      
      if(pname!=null)
      {
          Product_Dao pd = new Product_Dao();
          int res = pd.add_product(pname, pprice, pimg, pquantity);
          
          if(res>0)
          {
              response.sendRedirect(" ");
          }
          else
          {
              out.print("Insertion failed...");
          }
        
      }
      
    }
    catch(Exception e)
    {
         out.print("Add product jsp exception : "+e.toString());
    }
%>