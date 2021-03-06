/**
 * Write a description of class PartialArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PartialArray
{
    /** description of instance variable x (add comment for each instance variable) */
    private int[] values;
    private int currentSize;

    /**
     * Default constructor for objects of class PartialArray
     */
    public PartialArray()
    {
        // initialise instance variables
        this.values = new int[100];
        
        for(this.currentSize = 0;
            this.currentSize<20;
            currentSize++)
        {
            this.values[this.currentSize] = this.currentSize*this.currentSize;
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void remove(int pos)
    {
        // put your code here
        for(int i = pos + 1;
            i < this.currentSize;
            i++)
        {
            this.values[i - 1] = this.values[ i ];
        }
        
        this.currentSize--;
    }
    
    public void insert(int pos, int newValue)
    {
        if(this.currentSize == this.values.length)
        {
            this.grow();
        }
    
        for(int i = currentSize;
            i > currentSize;
            i--)
        {
            this.values[i] = this.values[i-1];
        }
        
        this.values[pos] = newValue;
        currentSize++;
    }
    
    public void swap(int posA, int posB)
    {
        int temp = this.values[posA];
        this.values[posA] = this.values[posB];
        this.values[posB] = temp;
    }
    
    private void grow()
    {
        int[] newValues = new int[this.currentSize+2];
        
        for(int i = 0;
            i < this.currentSize;
            i++)
        {
            newValues[i] = this.values[i];
        }
        
        this.values = newValues;
    }
    
    public static void main(String[]args)
    {
        int[] numbers = new int[10];
    }
}