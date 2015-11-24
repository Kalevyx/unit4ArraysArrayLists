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
    }
}