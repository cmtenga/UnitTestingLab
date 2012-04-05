package common;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Cecilia Mtenga, cmtenga@my.wctc.edu
 */
public class CustomerTest {

    private Customer instance;

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
        instance = new Customer();
    }

    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * This method tests the requirement that the address can not null
     */
    @Test(expected = IllegalArgumentException.class)
    public void addressShouldNotBeNull() {
        //Customer customer = new Customer();
        instance.setAddress(null);

        //assertNotNull(instance.getAddress());
    }

    /**
     * This method tests the requirement that the address can not empty
     */
    @Test(expected = IllegalArgumentException.class)
    public void addressShouldNotBeEmpty() {
        instance.setAddress("");
    }

    /**
     * All valid address should pass validation
     */
    @Test
    public void validAddressShouldPass() {
        instance.setAddress("1234 Anywhere St");
    }

    /**
     * Zip should not be null
     */
    @Test(expected = IllegalArgumentException.class)
    public void validZipCodeShouldNotBeNull() {
        instance.setZip(null);
    }

    @Test
    public void validZipCodeShouldPass() {
        instance.setZip("12345");
    }

    /**
     * City name should not be empty
     */
    @Test
    public void validCityNameShouldPass() {
        String[] validCity = {
            "a", "xxx", "xxxxxx"
        };
        try {
            for (String vc : validCity) {
                instance.setCity(vc);
            }
        } catch (Exception e) {
            fail("Throw exception");
        }
    }
}