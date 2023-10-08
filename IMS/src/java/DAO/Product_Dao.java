package DAO;

import Connection.GetConnection;
import DTO.Product_Dto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Product_Dao
{
     Connection con ;
    public Product_Dao()
    {
        con = GetConnection.myConnection(); 
    }
    public int add_product(String pname, int pprice, String pimg, int pquantity)
    {
      int res=0;
      if(con!=null)
      {
         try
         {
           String sql = "insert into product(pname, pprice, pimg, pquantity) values(?,?,?,?)";
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1,pname);
           ps.setInt(2, pprice);
           ps.setString(3, pimg);
           ps.setInt(4, pquantity);
           
           res= ps.executeUpdate();
         }
         catch(Exception e)
         {
              System.out.println("Product dao exception"+e.toString());
         }
      
      }
     else
      {
         System.out.println("Connection failed...");    
      }
    return res;
    }
    
    public ArrayList<Product_Dto> view_product(String pname)
    {
      ArrayList<Product_Dto> aldt = new ArrayList<>();
      if (con!=null)
      {
        try
        {
           String sql = "select * from product where pname = ?";
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1, pname);
           ResultSet res = ps.executeQuery();
          
           int pcode = res.getInt("pcode");
           pname = res.getString("pname");
           int pprice = res.getInt("pprice");
           String pimg = res.getString("pimg");
           int pquantity = res.getInt("pquantity");
           int kitcode = res.getInt("kitcode");
          
          Product_Dto pd = new Product_Dto(pcode, pprice, pquantity, kitcode, pname, pimg);
          aldt.add(pd);
           
        }
        catch(Exception e)
        {
            System.out.println("View product exception : "+e);
        }
      
      }
       else
      {
          System.out.println("Connection problem");
      }
      return aldt;
    }
    
    public ArrayList<Product_Dto> viewAllProducts()
    {
         ArrayList<Product_Dto> aldt = new ArrayList<>();
       if (con!=null)
        {
          try
           {
             String sql = "select * from product";
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet res = ps.executeQuery();
          
             String pname = res.getString("pname");
             int pcode = res.getInt("pcode");
             String pimg = res.getString("pimg");
             
             Product_Dto pd = new Product_Dto(pname, pcode, pimg);
            
             aldt.add(pd);
             
           }          
          catch(Exception e)
           {
          System.out.println("View all products exception : "+e);
           }
        }
    return aldt;
    }
    public int deleteProduct(String pname)
    {
     int res = 0;   
     if(con!=null)
     {
       try
       {
          String sql = "delete from product where pname = ?";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1, pname);
          res = ps.executeUpdate();
       }
       catch(Exception e)
       {
           System.out.println("Delete product exception : "+e);
       }
     }
      else
      {
          System.out.println("Connection problem");
      }
     return res;
    }
}
