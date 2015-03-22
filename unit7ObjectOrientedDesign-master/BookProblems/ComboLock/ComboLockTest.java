

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ComboLockTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ComboLockTest
{
    /**
     * Default constructor for test class ComboLockTest
     */
    public ComboLockTest()
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
    
    @Test
    public void test() {
        ComboLock lock1 = new ComboLock(5, 5, 5);
        //ComboLock lock2 = new ComboLock(5, 35, 12);
        lock1.turnRight(5);
        lock1.turnLeft(40);
        lock1.turnRight(39);
        assertEquals(lock1.open(), false);
        lock1.turnRight(1);
        assertEquals(lock1.open(), true);
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
}