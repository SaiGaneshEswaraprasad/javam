//5. Develop a program to demonstrate exception handling by using THROW, 
//MULTIPLE  CATCH & FINALLY statements.   

package question5;

public class Q5 
{
	
	    public static void main(String[] args) 
	    {
	        try 
	        {
	            int result = divide(10, 0);
	            System.out.println("Result of division: " + result);
	        } 
	        catch (ArithmeticException e)
	        {
	            System.out.println("ArithmeticException caught: " + e.getMessage());
	        } 
	        catch (NullPointerException e) 
	        {
	            System.out.println("NullPointerException caught: " + e.getMessage());
	        } 
	        finally 
	        {
	            System.out.println("Finally block executed.");
	        }
	    }

	    public static int divide(int num, int den) 
	    {
	        if (den == 0) 
	        {
	            throw new ArithmeticException("Division by zero is not allowed.");
	        }
	        return num / den;
	    }

}

