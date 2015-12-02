/**
 * Write a description of class MedalCount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MedalCount
{
    final int COUNTRIES = 7;
    final int MEDALS = 3;
    
    int[][] counts = 
        {
            {1,0,1},
            {1,1,0},
            {0,0,1},
            {1,0,0},
            {0,1,1},
            {0,1,1},
            {1,1,0},
        };
    
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class MedalCount
     */
    public MedalCount()
    {
        // alternate way to initialise 2D arra
        // counts = new int[COUNTRIES][MEDALS]       
    }

    public void printTable()
    {
        /*good:
         for(int i = 0;
            i < COUNTRIES;
            i++)*/
        //better:
        for(int i = 0;
            i < counts.length;
            i++)
        {
            /*good:
                 for(int j = 0;
                 j < MEDALS;
                 k++)*/
            /*best:for(int j = 0;
                 j < counts[0].length;
                 j++)*/
            //best:
            for(int j = 0;
               j < counts[i].length;
               j++)
            {
                System.out.print(counts[i][j] + "\t");
            }
            
            System.out.println();
        }
    }
    
    public int countMedals(int countryIndex)
    {
        int total = 0;
        
        for(int j = 0;
            j < counts[countryIndex].length;
            j++)
        {
            total += counts[countryIndex][j];
        }
        
        return total;
    }
    
    public int countPerMedal(int medalIndex)
    {
        int total = 0;
        
        for(int i = 0;
            i < counts.length;
            i++)
        {
            total += counts[i][medalIndex];
        }
        
        return total;
    }
}