package DAO;

import Connection.GetConnection;
import DTO.Purchase_Dto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Purchase_Dao
{
    Connection con = null;
    
    public Purchase_Dao()
    {
        con = GetConnection.myConnection();
    }
    
    public int add_purchaseinfo(int purchaseid, int pcode, int scode, Date pdate, int purchase_quantity, int price)
    {
        int res = 0;
      if(con!=null)
      {
        try
        {
           String sql = "insert into purchase(purchaseid, pcode, scode, pdate, purchase_quantity,price) value(?,?,?,?,?,?)";
           PreparedStatement ps = con.prepareStatement(sql);
           
           ps.setInt(1, purchaseid);
           ps.setInt(2, pcode);
           ps.setInt(3, scode);
           ps.setDate(4, pdate);
           ps.setInt(5, purchase_quantity);
           ps.setInt(6, price);
           res= ps.executeUpdate();         
        }
        catch(Exception e)
        {
            System.out.println("Add purchase info exception : "+e.toString());
        }
      }
      else
      {
          System.out.println("Connection problem");
      }
     return res;
    }
    
    
    public ArrayList<Purchase_Dto> view_purchaseinfo(int purchaseid)
    {
        ArrayList<Purchase_Dto> aldt = new ArrayList<>();
      
      if(con!= null)
      {
          try
          {
              String sql = "slect * from purchase where purchaseid=?";
              PreparedStatement ps = con.prepareStatement(sql);
              ps.setInt(1, purchaseid);
              ResultSet res = ps.executeQuery();
              
              purchaseid = res.getInt("purchaseid");
              int pcode = res.getInt("pcode");
              int scode = res.getInt("scode");
              Date pdate = res.getDate("pdate");
              int purchase_quantity = res.getInt("purchase_quantity");
              int price = res.getInt("price");
              Purchase_Dto pd = new Purchase_Dto(purchaseid, scode, pcode, purchase_quantity,price, pdate);
              aldt.add(pd);
              
          }
          catch(Exception e)
          {
              System.out.println("View purchase info exception : "+e.toString());
          }
      }
      else
      {
          System.out.println("Connection problem");
      }
      return aldt;
    }
    
}
