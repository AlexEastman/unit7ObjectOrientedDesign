

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BillFoldTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BillFoldTest
{
    /**
     * Default constructor for test class BillFoldTest
     */
    public BillFoldTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testing() {
        IDCard idCard = new IDCard("Dillon", "1212");
        DriverLicense driver = new DriverLicense("Dillon", 2020);
        BillFold billFold = new BillFold();
        billFold.addCards(idCard, driver);
        System.out.println(billFold.formatCards());
    }
}
