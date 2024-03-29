
package common;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *JUnit for all classes 
 * @author Cecilia Mtenga, cmtenga@my.wctc.edu
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({common.InvoiceTest.class, 
    common.CustomerTest.class, 
    common.ProductTest.class, 
    common.LineItemTest.class
})
public class UnitTestSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
