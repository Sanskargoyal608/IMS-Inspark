package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import Utils.SystemConstants;

public class GetConnection 
{
  static Connection con = null; 
  
  public static Connection myConnection()
  {
    try
    {
       Class.forName(SystemConstants.DRIVER);
       con = DriverManager.getConnection(SystemConstants.URL,SystemConstants.DBUSERNAME,SystemConstants.DBPASSWORD); 
    }
    catch(Exception ex)
    {
       System.out.println("Connection Exception : "+ex.toString());
    }
      return con;
   }
}
