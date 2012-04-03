/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author cmtenga
 */
public class CustomerTest {

    public CustomerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * This method tests the requirement that the address can not null
     */
    @Test(expected = IllegalArgumentException.class)
    public void addressShouldNotBeNull() {
        Customer customer = new Customer();
        customer.setAddress(null);
        
       // assertNotNull(customer.getAddress());
    }

    /**
     * This method tests the requirement that the address can not empty
     */
    @Test(expected = IllegalArgumentException.class)
    
    public void addressShouldNotBeEmptyl() {
         Customer customer = new Customer();
        customer.setAddress("");
    }
    /**
     * All valid address should pass
     */
    @Test
    public void validAddressShouldPass(){
        String[] validAddresses = {
            "",
            "1234 Anywhere St",
            "Street"
        };
        Customer customer = new Customer();
        customer.setAddress("1234 Anywhere St"); 
        //for((Sring address:validAddresses)
        //customer.getAddress());
    }
}