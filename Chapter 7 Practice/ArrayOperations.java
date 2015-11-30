public class ArrayOperations
{
    public static void main(String[] args)
    {
        double[] x = { 8, 4, 5, 21, 7, 9, 18, 2, 100 }; 
        System.out.println("Length: " + x.length);
        System.out.println("First array item: " + x[0]);
        System.out.println("Last array item: " + x[8]);
        System.out.println("Same as above: "+ x[x.length-1]);
        System.out.println(); 

        for ( int i = 0; i < x.length; i++ )
        {
            System.out.println(x[i]);
        }
    
        System.out.println(); 
    
        for ( int i = 0; i < x.length; i++ )
        {
            System.out.println("Value #"+(i+1)+": "+x[i]);
        }
    
        System.out.println(); 
    
        for ( int i = 8; i >= 0; i--)
        {
            System.out.println("Value #"+(i+1)+": "+x[i]);
        }
    
        System.out.println(); 
    
        for (double value : x)
        {
            System.out.println(value);
        }
    }
}