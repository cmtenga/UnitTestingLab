
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
        instance.setMinQtyForDiscount(10);
    }

    @After
    public void tearDown() {
        instance = null;
    }

    @Test(expected = IllegalArgumentException.class)
    public void customerInformationShouldNotBeNull() {
        instance.setCustomer(null);

    }
     @Test(expected = IllegalArgumentException.class)
     public void minDiscountQuantityShouldBe10(){
         instance.setMinQtyForDiscount(7);
     }
}
