package GenricLibaray;

import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.Driver;

import java.sql.DriverManager;

public class DataBaseUtiles {
	
	Connection con;
	public void ConnectDatabase() throws SQLException
	{
		Driver driver = new Driver();
		//Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		con=DriverManager.getConnection(null, null, null);
		
		
	}
	public String excuteandUpdate(String query,int colData,String ExpData) throws SQLException
	{
		Statement state = con.createStatement();
		ResultSet result = state.executeQuery(query);
		 boolean flag = false;
		 while(result.next())
		 {
			 String actual = result.getString(colData);
			 if(actual.equalsIgnoreCase(ExpData))
			 {
				 flag = true;
				 break;
			 }
		 }
		 if (flag)
		 {
			 System.out.println("project creatted succuesfully");
			 return ExpData;
		 }
		 else
		 {
			 System.out.println("project is not creatted");
			 return "";
		 }
	}
	    public void disconnectDB() throws Throwable
	    {
	    	con.close();
	    }
	

}
