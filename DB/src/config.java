
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prachi
 */
public class config {
    static Connection con;
    public  static Connection db_connect(){
        try {
             con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeinfo","root","");
             System.out.println("Connected");
             return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
}
