

public class ArrayOperations2
{
    private int[] values;
    
    public ArrayOperations2(int[] initialValues)
    {
        values = initialValues;
    }
    
    public void swapFirstAndLast()
    {
        int other = values[0];
        values[0] = values[values.length-1];
        values[values.length-1] = other;
    }
    
    public void shiftRight()
    {
        int other = values[values.length-1];
        
        for(int i = other;
            i > 0;
            i--)
        {
            values[i]=values[i-1];
        }
        
        values[0] = other;
    }
    
    public void replaceEvensWithZero()
    {
        for(int i = 0;
            i < values.length;
            i++)
        {
            if(values[i]%2==0)
            {
                values[i] = 0;
            }
        }
    }
    
    public void largestNeighbor()
    {
        int[] newArray = values;
        for(int i = 1;
            i < values.length-1;
            i++)
        {
            int lower = newArray[i-1];
            int upper = newArray[i+1];
            if(lower>upper)
            {
                values[i] = lower;
            }
            else if(upper>lower)
            {
                values[i] = upper;
            }
        }
    }
    
    public void oddOrEven()
    {
        
    }
}