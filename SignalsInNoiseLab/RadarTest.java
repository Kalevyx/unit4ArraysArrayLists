import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author @crli 
 * @version @16 December 2015
 */
public class RadarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
        // initialise instance variables
        x = 0;
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
    public void firstCoordinate()
    {
        Radar radar = new Radar(100, 100, 50, 50);
        radar.scan();
        
        if(radar.getAccumulatedDetection(50,50) == radar.getNumScans())
        {
            assertNotNull("Monster at: (50, 50)");
        }
        else
        {
            assertNull("Monster expected at: (50, 50)");
        }
    }
    
    @Test
    public void secondCoordinate()
    {
        Radar radar = new Radar(100, 100, 25, 25);
        radar.scan();
        
        if(radar.getAccumulatedDetection(25,25) == radar.getNumScans())
        {
            assertNotNull("Monster at: (25, 25)");
        }
        else
        {
            assertNull("Monster expected at: (25, 25)");
        }
    }
}
