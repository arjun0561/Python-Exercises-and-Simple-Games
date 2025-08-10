import java.util.*;
public class hi 
{
    public static void main(String[]args)
    {
     Scanner console = new Scanner(System.in);
     System.out.print("Enter a number: ");
     int num = console.nextInt();
     console.nextLine();
     for(int i = 1; i<= 10; i++)
     {
       int result = num*i;
        System.out.println(num+ " * = " + result);
     }
    }
}


// multiplication table
// first ask the user to type the number