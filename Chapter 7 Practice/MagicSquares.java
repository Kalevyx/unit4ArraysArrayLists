public class MagicSquares
{
    public int[] values;
    
    public MagicSquares(int size)
    {
        values = new int[size];
    }
    
    public void set(int i, int n)
    {
        values[i] = n;
    }
    
    public boolean equals(MagicSquares other)
    {
        return true;
    }
}