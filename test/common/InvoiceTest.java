package common;

import java.util.Date;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Cecilia Mtenga, cmtenga@my.wctc.edu
 */
public class InvoiceTest {

    private Invoice instance;

    public InvoiceTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        instance = new Invoice();
    }

    @After
    public void tearDown() {
        instance = null;
    
    /**
     * customer information should not be null
     */
    }
    @Test(expected = IllegalArgumentException.class)
    public void customerInformationShouldNotBeNull() {
        instance.setCustomer(null);

    }
    /**
     * minimum quantity qualified for discount should be >= 10
     */

    @Test(expected = IllegalArgumentException.class)
    public void minDiscountQuantityShouldBe10() {
        instance.setMinQtyForDiscount(8);
    }
}