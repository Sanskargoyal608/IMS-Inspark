package DAO;

import Connection.GetConnection;
import DTO.Kit_Dto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Kit_Dao 
{
    Connection con = null;

    public Kit_Dao()
    {
        con = GetConnection.myConnection();
    }
    
    public int add_kit(int kitcode, String kitname)
    {
        int res = 0;
        if(con!=null)
        {
            try
            {
                String sql = "insert into kit(kitcode, kitname) value(?,?)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, kitcode);
                ps.setString(2, kitname);
                
                res= ps.executeUpdate();
            }
            catch(Exception e)
            {
                System.out.println("Add kit exception");   
            }
        }
        else
        {
            System.out.println("Connection problem");
        }
        return res;
    }
    
    
    public ArrayList<Kit_Dto> view_kits(int kitcode)
    { 
       ArrayList<Kit_Dto> aldt = new ArrayList<Kit_Dto>();
       if(con!=null)
       {
           try
           {
               String sql = "select * from  kit where kitcode=?";
               PreparedStatement ps = con.prepareStatement(sql);
               ps.setInt(1, kitcode);
               ResultSet res = ps.executeQuery();
               
               kitcode = res.getInt("kitcode");
               String kitname = res.getString("kitname");
            
               Kit_Dto kd = new Kit_Dto(kitcode, kitname);
               aldt.add(kd);
           }
           catch(Exception e)
           {
               System.out.println("View kits exception : "+e.toString());
           }
       }
       else
       {
           System.out.println("Connection problem");
       }
       return aldt;
    }
}
