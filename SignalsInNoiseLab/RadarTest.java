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
    @Test
    public void firstCoordinate()
    {
        Radar radar = new Radar(100, 100);
        radar.setMonsterLocation(50,50);
        
        for(int i = 0;
            i < 100;
            i++)
        {
            radar.scan();
        }
        
        int max = radar.getAccumulatedDetection(0,0);
        int row = 0;
        int col = 0;
        
        for(int i = 0;
            i < 100;
            i++)
        {
            for(int j = 0;
                j < 100;
                j++)
            {
                if(radar.getAccumulatedDetection(i,j)>max)
                {
                    row = i;
                    col = j;
                    max = radar.getAccumulatedDetection(i,j);
                }
            }
        }
        
        assertEquals(50,row);
        assertEquals(50,col);
    }
    
    @Test
    public void secondCoordinate()
    {
        Radar radar = new Radar(100, 100);
        radar.setMonsterLocation(25,25);
        
        for(int i = 0;
            i < 100;
            i++)
        {
            radar.scan();
        }
        
        int max = radar.getAccumulatedDetection(0,0);
        int row = 0;
        int col = 0;
        
        for(int i = 0;
            i < 100;
            i++)
        {
            for(int j = 0;
                j < 100;
                j++)
            {
                if(radar.getAccumulatedDetection(i,j)>max)
                {
                    row = i;
                    col = j;
                    max = radar.getAccumulatedDetection(i,j);
                }
            }
        }
        
        assertEquals(25,row);
        assertEquals(25,col);
    }
}
