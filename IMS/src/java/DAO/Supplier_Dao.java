package DAO;

import Connection.GetConnection;
import DTO.Supplier_Dto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Supplier_Dao
{
    Connection con;

    public Supplier_Dao() 
    {
        con = GetConnection.myConnection();
    }
    
    public int add_supplier(String sname, String mobile, String email, String address, int scode)
   {
     int res = 0;
     
     if (con!=null)
     {
       try
       {
         String sql = "insert into supplier(sname, mobile, email, address, scode) values(?,?,?,?,?)";
         PreparedStatement ps = con.prepareStatement(sql);
         ps.setString(1, sname);
         ps.setString(2, mobile);
         ps.setString(3, email);
         ps.setString(4, address);
         ps.setInt(5, scode);
         
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
 
    
     public ArrayList<Supplier_Dto> viewAllSuppliers()
   {
       
     ArrayList<Supplier_Dto> aldt = new ArrayList<>();
     if(con!=null)
     {
       try
       {
          String sql = "selct * from supplier";
          PreparedStatement ps = con.prepareStatement(sql);
          ResultSet res = ps.executeQuery();
          
          String sname =  res.getString("sname");
          int scode = res.getInt("scode");
          
          Supplier_Dto sd = new Supplier_Dto(sname,scode);
          aldt.add(sd);
       }
       catch(Exception e)
       {
           System.out.println("View all supplier problem : "+e);
       }
     }
     else
     {
         System.out.println("Connection problem");
     }
     return aldt;  
   }
    
     
      public ArrayList<Supplier_Dto> view_supplier(String sname)
   {
      ArrayList<Supplier_Dto> aldt = new ArrayList<>();
      if(con!=null)
      {
        try
        {
           String sql = "select * from supplier where sname=?";
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1, sname);
           ResultSet res = ps.executeQuery();
           
           sname = res.getString("sname");
           String mobile = res.getString("mobile");
           String email = res.getString("email");
           String address = res.getString("address");
           int scode = res.getInt("scode");
           
           Supplier_Dto sd = new Supplier_Dto(sname, mobile, email, address, scode);
           aldt.add(sd);
        }
        catch(Exception e)
        {
            System.out.println("View supplier exception : "+e);
        }
      }
      else
      {
          System.out.println("Connection problem");
      }
    return aldt;        
   }

    
     public int delete_supplier(String sname)
   {
     int res = 0;   
     if(con!=null)
     {
       try
       {
          String sql = "delete from supplier where sname = ?";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1, sname);
          res = ps.executeUpdate();
       }
       catch(Exception e)
       {
           System.out.println("Delete supplier exception : "+e);
       }
     }
      else
      {
          System.out.println("Connection problem");
      }
     return res;
    }
   
}


