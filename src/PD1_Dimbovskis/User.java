package pd1_dimbovskis;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vadims Dimbovskis
 */
public class User {

    private String name;
    private String surname;
    private String login;
    private String password;
    
    
  
    public boolean validateUser(String login, String password) throws SQLException {
            
      
        return false;       
    }
    

    public boolean isAdmin(String nickname) {

       
        return false;

       
    }


    public boolean isBanned(String nickname) {

  
        return false;

  
    }
    
    
    
    public void User(String name, String surname, String login, String password) {

        
    }

    public void setName(String newName) {

    }

    public void setSurname(String newSurname) {

    }

    public void setLogin(String newLogin) {

    }

    public void setPassword(String newPassword) {

    }
}
