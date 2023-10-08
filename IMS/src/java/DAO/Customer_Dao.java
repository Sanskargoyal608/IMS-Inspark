package DAO;

import Connection.GetConnection;
import DTO.Customer_Dto;
import DTO.Product_Dto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Customer_Dao
{
   Connection con;

    public Customer_Dao() 
    {
        con = GetConnection.myConnection();
    }
    
   public int add_customer(String cname, String mobile, String email, String address, int ccode)
   {
     int res = 0;
     
     if (con!=null)
     {
       try
       {
         String sql = "insert into customer(cname, mobile, email, address, ccode) values(?,?,?,?,?)";
         PreparedStatement ps = con.prepareStatement(sql);
         ps.setString(1, cname);
         ps.setString(2, mobile);
         ps.setString(3, email);
         ps.setString(4, address);
         ps.setInt(5, ccode);
         
         res= ps.executeUpdate();
       
       }
       
       catch(Exception e)
       {
           System.out.println("Add customer exception"+e);
       }
     
     
     }
     
     else
     {
         System.out.println("Connection problem");
     }
     return res;
   }
  
   
   public ArrayList<Customer_Dto> viewAllCustomers()
   {
       
     ArrayList<Customer_Dto> aldt = new ArrayList<>();
     if(con!=null)
     {
       try
       {
          String sql = "selct * from customer";
          PreparedStatement ps = con.prepareStatement(sql);
          ResultSet res = ps.executeQuery();
          
          String cname =  res.getString("cname");
          int ccode = res.getInt("ccode");
          
          Customer_Dto cd = new Customer_Dto(cname,ccode);
          aldt.add(cd);
             
       }
       catch(Exception e)
       {
           System.out.println("View all customer problem : "+e);
       }
     }
     else
     {
         System.out.println("Connection problem");
     }
     return aldt;  
   }
   
   
   public ArrayList<Customer_Dto> view_customer(String cname)
   {
      ArrayList<Customer_Dto> aldt = new ArrayList<>();
      if(con!=null)
      {
        try
        {
           String sql = "select * from customer where cname=?";
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1, cname);
           ResultSet res = ps.executeQuery();
           
           cname = res.getString("cname");
           String mobile = res.getString("mobile");
           String email = res.getString("email");
           String address = res.getString("address");
           int ccode = res.getInt("ccode");
           
           Customer_Dto cd = new Customer_Dto(cname, mobile, email, address, ccode);
           aldt.add(cd);
          
        }
        
        catch(Exception e)
        {
            System.out.println("View customer exception : "+e);
        }
      }
      else
      {
          System.out.println("Connection problem");
      }
    return aldt;        
   }
  
   
   public int delete_customer(String cname)
   {
     int res = 0;   
     if(con!=null)
     {
       try
       {
          String sql = "delete from customer where cname = ?";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,cname);
          res = ps.executeUpdate();
       }
       catch(Exception e)
       {
           System.out.println("Delete customer exception : "+e);
       }
     }
      else
      {
          System.out.println("Connection problem");
      }
     return res;
    }
   
}
