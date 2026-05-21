import java.util.*;
public class Force282A
{
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int X = 0;
        while(n-- > 0)
        {
            String line  = s.next();
            if(line.substring(0,3).equals("++X") 
             ||line.substring(0,3).equals("X++"))
            {
                X++;
            }
             if(line.substring(0,3).equals("--X") 
             ||line.substring(0,3).equals("X--"))
            {
                X--;
            }

        }

        System.out.println(X);
    }
}