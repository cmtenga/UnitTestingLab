/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Cecilia Mtenga
 */
public class ProductTest {

    private Product instance;

    public ProductTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        instance = new Product();
    }

    @After
    public void tearDown() {
        instance = null;
    }

    @Test(expected = IllegalArgumentException.class)
    public void prodIdInformationShouldNotBeNull() {
        instance.setProdId(null);

    }

    @Test(expected = IllegalArgumentException.class)
    public void productDescriptionShouldNotBeNull() {
        instance.setDescription(null);
    }
    
}