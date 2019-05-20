package newpackage;

import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.PageContext;

public class DAL 
{
    public Connection  connection()
    {
        Connection cn=null;
        try 
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        }
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(DAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String url="jdbc:derby://localhost:1527/bookmyshow";
        String usname="smit";
        String pwd="smit";
        try 
        {
            cn= DriverManager.getConnection(url, usname, pwd);
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(DAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cn;  
    } 
    
/*    String selectticket(String name,Date date,String time,String reserved)
    {
        String testreserved="";
        try 
        {
            Connection cn =connection();
            
            String query;
            query = "select reserved from SMIT.MOVIE set reserved=? where name=? and date=? and time=? ";
            
            PreparedStatement pst=cn.prepareStatement(query);
            
            pst.setString(1,reserved);
            pst.setString(2,name);
            pst.setDate(3,date);
            pst.setString(4,time);
            
            try (ResultSet rs = pst.executeQuery()) {
                while(rs.next())
                {
                    testreserved=rs.getString(1).toString();
                }
            }
            return testreserved;
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DAL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    void updateticket(String name,Date date,String time,String reserved)
    {
        try 
        {
            Connection cn =connection();
            
            String query;
            query = "update SMIT.MOVIE set reserved=? where name=? and date=? and time=? ";
            
            PreparedStatement pst=cn.prepareStatement(query);
            
            pst.setString(1,reserved);
            pst.setString(2,name);
            pst.setDate(3,date);
            pst.setString(4,time);
            
            pst.executeUpdate();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public String selectticket(String movie)
    {
        String testreserved="";
        try 
        {
            Connection cn =connection();
            
            String query;
            query = "select reservedtickets from SMIT.TICKET where movie=?";
            
            PreparedStatement pst=cn.prepareStatement(query);
            
            pst.setString(1,movie);
            
            try (ResultSet rs = pst.executeQuery()) {
                while(rs.next())
                {
                    testreserved=rs.getString(1).toString();
                }
            }
            return testreserved;
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DAL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public void updateticket(String movie,String reservedtickets)
    {
        try 
        {
            Connection cn =connection();
            
            String query;
            query = "update SMIT.TICKET set reservedtickets=? where movie=?";
            
            PreparedStatement pst=cn.prepareStatement(query);
            
            pst.setString(1,reservedtickets);
            pst.setString(2,movie);
            
            pst.executeUpdate();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  */  
    public void insertticket(String mail,String pname,String tickets,String date,int total)
    {
        try 
        {
            Connection cn =connection();
            
            String query;
            query = "insert into SMIT.BOOKEDTICKETs values(?,?,?,?,?)";
            
            PreparedStatement pst=cn.prepareStatement(query);
            
            pst.setString(1,mail);
            pst.setString(2,pname);
            pst.setString(3,tickets);
            pst.setString(4,date);
            pst.setInt(5, total);
            
            pst.executeUpdate();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void insert(String name,String mail,String pass,String username,String securituque,String answer)
    {
        try 
        {
            Connection cn =connection();
            
            String query;
            query = "insert into SMIT.DETAILS values(?,?,?,?,?,?)";
            
            PreparedStatement pst=cn.prepareStatement(query);
            
            pst.setString(1,name);
            pst.setString(2,mail);
            pst.setString(3,pass);
            pst.setString(4,username);
            pst.setString(5,securituque);
            pst.setString(6,answer);
            
            pst.executeUpdate();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    int search(String mail,String pass)
    {
        String tpass="1";
        try 
        {
            Connection cn= connection();
            
            PreparedStatement pst;
            String sql ="SELECT password FROM SMIT.DETAILS where email=?";
            pst = cn.prepareStatement(sql);
            pst.setString(1,mail);
            try (ResultSet rs = pst.executeQuery()) {
                while(rs.next())
                {
                    tpass=rs.getString(1).toString();
                }
            }
            
            if(tpass.equals(pass))
            {
                return 1;
            }
            else 
            {
                return 0;
            }
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(DAL.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    int forgot(String mail,String que,String ans)
    {
        String question="1";
        String answer="0";
        try 
        {
            Connection cn= connection();
            
            PreparedStatement pst;
            String sql ="SELECT answer FROM SMIT.DETAILS where email=?";
            pst = cn.prepareStatement(sql);
            pst.setString(1,mail);
            try (ResultSet rs = pst.executeQuery()) {
                while(rs.next())
                {
                    answer=rs.getString(1).toString();
                }
            }
            
            if(answer.equals(ans))
            {
                return 1;
            }
            else 
            {
                return 0;
            }
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(DAL.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    String searchname(String mail)
    {
        String name="";
        try 
        {
            Connection cn= connection();
            
            PreparedStatement pst;
            String sql ="SELECT name FROM SMIT.DETAILS where email=?";
            pst = cn.prepareStatement(sql);
            pst.setString(1,mail);
            try (ResultSet rs = pst.executeQuery()) {
                while(rs.next())
                {
                    name=rs.getString(1).toString();
                }
            }
            return name;
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(DAL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public void changepass(String mail,String pass)
    {
        try 
        {
            Connection cn =connection();
            
            String query;
            query = "update SMIT.DETAILS set password=? where email=?";
            
            PreparedStatement pst=cn.prepareStatement(query);
            
            pst.setString(1,pass);
            pst.setString(2,mail);
            
            pst.executeUpdate();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
