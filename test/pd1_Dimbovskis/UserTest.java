/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pd1_Dimbovskis;

import pd1_dimbovskis.User;
import java.sql.Connection;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vadim Dimbovskis PR-21
 */
public class UserTest {
    
    public UserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of validateUser method, of class User.
     */
    @Test
    public void testValidateUser() throws Exception {
        
        System.out.println("validateUser");
        String login = "kot";
        String password = "12345";
        User instance = new User();
        boolean expResult = true;
        boolean result = instance.validateUser(login, password);
        assertEquals(expResult, result);
    }
    
    
}
