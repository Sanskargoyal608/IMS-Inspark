package DAO;

import Connection.GetConnection;
import DTO.Warehouse_Dto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Warehouse_Dao 
{
   Connection con ;

    public Warehouse_Dao()
    {
        con = GetConnection.myConnection();
    }
   
    public int add_warehouse(String wname, String location, int wcode)
    {
       int res = 0;
       if(con!=null)
       {
         try
         {
           String sql = "insert into warehouse(wname, location, wcode) values(?,?,?)";
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1, wname);
           ps.setString(2, location);
           ps.setInt(3, wcode);
           
           
           res= ps.executeUpdate();
         }
         catch(Exception e)
         {
             System.out.println("Add warehouse exception :"+e);
         }
       }
       else
       {
           System.out.println("Connection problem");
       }
       return res;
    }
    
    
    public ArrayList<Warehouse_Dto> viewAllWarehouse()
    {
      ArrayList<Warehouse_Dto> aldt = new ArrayList<Warehouse_Dto>();  
      if(con!=null)
      {
        try
        {
         String sql = "selct * from warehouse";
         PreparedStatement ps = con.prepareStatement(sql);
         ResultSet res = ps.executeQuery();
         
         String wname = res.getString("wname");
         String location = res.getString("location");
         int wcode = res.getInt("wcode");
         
         Warehouse_Dto wd = new Warehouse_Dto(wname, location, wcode);
         aldt.add(wd);
          
        }
        catch(Exception e)
        {
            System.out.println("View all warehouse exception :"+e);
        }
      }
      else
      {
          System.out.println("Connection problem");
      }
      return aldt;
    }
    
    public int delete_warehouse(String wname)
    {
      int res = 0;
      if(con!=null)
      {
        try
        {
          String sql = "delete from warehouse where wname=?";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1, wname);
          res = ps.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println("Delete warehouse exception :"+e);
        }
      }
      else
      {
          System.out.println("Connection problem");
      }
       return res;
    }
}
