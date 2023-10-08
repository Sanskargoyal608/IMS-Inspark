package DAO;

import Connection.GetConnection;
import DTO.Sales_Dto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Sales_Dao 
{
    Connection con = null;

    public Sales_Dao() 
    {
            con = GetConnection.myConnection();
    }
    
    public int add_sales(int pcode, int ccode, int sales_quantity, Date sdate, int salescode, int revenue)
    {
      int res = 0;
      if(con!=null)
      {
          try
          {
            String sql = "insert into sales(pcode,ccode,sales_quantity,sdate,salescode,revenue) value(?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
           
            ps.setInt(1, pcode);
            ps.setInt(2, ccode);
            ps.setInt(3, sales_quantity);
            ps.setDate(4, sdate);
            ps.setInt(5, salescode);
            ps.setInt(6, revenue);
            res = ps.executeUpdate();
          }
          catch(Exception e)
          {
              System.out.println("Add sales exception : "+e.toString());
          }
      }
      else
      {
          System.out.println("Connection problem");
      }
      return res;
    }
   
    
    public void view_sales(int salescode)
    {
        ArrayList<Sales_Dto> aldt = new ArrayList<>();
        if(con!= null)
        {
           try
          {
              String sql = "select * from sales where salescode=?";
              PreparedStatement ps = con.prepareStatement(sql);
              ps.setInt(1, salescode);
              
              ResultSet res = ps.executeQuery();
              int pcode = res.getInt("pcode");
              int ccode = res.getInt("ccode");
              int sales_quantity = res.getInt("sales_quantity");
              Date sdate = res.getDate("sdate");
              salescode = res.getInt("salescode");
              int revenue = res.getInt("revenue");
              Sales_Dto sd = new Sales_Dto(salescode, pcode, ccode, sales_quantity,revenue, sdate);
              aldt.add(sd);
          }          
          catch(Exception e)
          {
              System.out.println("View sales exception : "+e.toString());
          }
        }
        else
        {
            System.out.println("Connection problem");
        }
      
    } 
}
