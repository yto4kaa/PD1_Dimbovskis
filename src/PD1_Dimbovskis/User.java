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
    
    
    final String DB_URL = "jdbc:derby://localhost:1527/contact";
    final String Brawler = "Brawler";
    final String Pizda228 = "pizda228";

    public boolean validateUser(String login, String password) throws SQLException {
        try (Connection connection = DriverManager.getConnection(DB_URL, Brawler, Pizda228); Statement statement = connection.createStatement();) {
            PreparedStatement pst = connection.prepareStatement("SELECT * FROM APP.QUESTION WHERE NICKNAME=? AND password=?");
            pst.setString(1, login);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {

                
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return false;
        
    }
    
    
private static final String URL = "jdbc:mysql://localhost:1527/contact";
    private static final String USER = "Brawler";
    private static final String PASSWORD = "pizda228";
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public void changePassword(String username, String newPassword) throws SQLException {

        String DB_URL = "jdbc:derby://localhost:1527/contact";
        String Brawler = "Brawler";
        String pizda228 = "pizda228";

        String query = "UPDATE APP.QUESTION SET PASSWORD = ? WHERE NICKNAME = ?";

        try ( Connection connection = DriverManager.getConnection(DB_URL, Brawler, pizda228);  PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(2, username);
            preparedStatement.setString(1, newPassword);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                throw e;
            } catch (SQLException ex) {
                Logger.getLogger(MainTestFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }


    public boolean isAdmin(String nickname) {

        String url = "jdbc:derby://localhost:1527/contact";
        String username = "Brawler";
        String password = "pizda228";

        String sql = "SELECT ISADMIN FROM APP.QUESTION WHERE NICKNAME = ?";

        boolean isAdmin = false;

        try ( Connection conn = DriverManager.getConnection(url, username, password);  PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nickname);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                isAdmin = rs.getBoolean("ISADMIN");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Is admin: " + isAdmin);

        return isAdmin;
    }

    public boolean isBanned(String nickname) {

        String url = "jdbc:derby://localhost:1527/contact";
        String username = "Brawler";
        String password = "pizda228";

        String sql = "SELECT ISBANNED FROM APP.QUESTION WHERE NICKNAME = ?";

        boolean isBanned = false;

        try ( Connection conn = DriverManager.getConnection(url, username, password);  PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nickname);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                isBanned = rs.getBoolean("ISBANNED");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Is Banned: " + isBanned);

        return isBanned;
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
