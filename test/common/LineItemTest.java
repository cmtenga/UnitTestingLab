package common;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Owner
 */
public class LineItemTest {
private LineItem instance;
    public LineItemTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        instance = new LineItem();
    }

    @After
    public void tearDown() {
        instance = null;
        /*
         * This method test quantity. Quantity should not be greater than 50 
         */
    }
     @Test(expected = NullPointerException.class)
    public void productQtyShouldNotBeGreaterThan50() {
     instance.setQty(51);
     /*
      * Quantity should not be negative
      */
    }
      @Test(expected = NullPointerException.class)
    public void productQtyShouldNotBeLessThan0() {
        instance.setQty(-1);
    }
}
