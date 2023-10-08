package DAO;

import Connection.GetConnection;
import DTO.User_Dto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class User_Dao
{
     Connection con ;

    public User_Dao() 
    {
        con = GetConnection.myConnection();
    }
    User_Dto u = null;
    
    
       //Login     
       public User_Dto login(String email)
   {      
      if (con!=null)
      {
        try
        {
            String sql = "select * from user where email = ?";
            PreparedStatement ps = con.prepareStatement(sql);
        
            ps.setString(1, email);
        
            ResultSet res = ps.executeQuery();
            if(res.next())
            {
               String uname = res.getString("uname"); 
               String img = res.getString("img"); 
               String pass = res.getString("pass"); 
               String mobileno = res.getString("mobile");
               String emailId = res.getString("email");
               String position = res.getString("position");
               String address = res.getString("address");
               int id = res.getInt("id");
               int type = res.getInt("type");
               
               
               u = new User_Dto(uname, img, pass, mobileno, emailId, position, address, id, type);
            }
        }
        catch(Exception ex)
        {
            System.out.println("login exception: "+ex.toString());
        }
     }
      else
      {
          System.out.println("Connection problem");
      }
       return u;
   }
       
   //Register
   public int register(String uname, String pass, String email)
   {
     
        int result = 0;
        if(con!=null)
        {
            try
            {
                String sql = "insert into user(uname, pass, email) value(?,?,?)";
                PreparedStatement ps = con.prepareStatement(sql);
              
                ps.setString(1, uname);
                ps.setString(2, pass);
                ps.setString(3, email);
              
                result = ps.executeUpdate();
            }
            catch(Exception ex)
            {
                System.out.println("Register Exception...");
            }
           
        }
         else
         {
             System.out.println("Connection Failed...");
         }
      return result;     
   
   }
   
   //Update user details
   public int updateUser(String uname, String img, String pass, String mobileno, String email, String position, String address)
   {
     int res = 0;
     if(con!=null)
     {
       try
       {
           String sql = "update user set img=? ,pass=?, mobileno=?, email=?, position=?, address=? where uname=? ";
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1, img);
           ps.setString(2, pass);
           ps.setString(3, mobileno);
           ps.setString(4, email);
           ps.setString(5, position);
           ps.setString(6, address);
           ps.setString(7, uname);
           
           res = ps.executeUpdate();
           
       }
       catch(Exception e)
       {
           System.out.println("Update user exception : "+e);
       }
     
     }
     return res;
   
   }
   
   
   //Delete user    
   public int deleteUser(String uname)
   {
    int res = 0; 
    if(con!=null)
    {
      try
      {
        String sql = "delete from user where uname = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, uname);
        res = ps.executeUpdate();
      }
      catch(Exception e)
      {
          System.out.println("Delete user exception..");
      }
    }
    else
    {
        System.out.println("Connection problem....");
    }
   return res;
   }
}
