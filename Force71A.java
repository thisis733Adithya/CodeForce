import java.util.Scanner;

public class Force71A{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        // while(n-- > 0)
        // {
        //     String str = s.next();
        //     if(str.length() > 0 && str.length() <= 10)
        //     {
        //         System.out.println(str);
        //     }else
        //     {
        //         char first = str.charAt(0);
        //         char last  = str.charAt(str.length()-1);
        //         System.out.println(""+first+(str.length()-2)+last+"");
        //     }

        // }

        System.out.println(sum());


        s.close();
    }

    public static int sum()
    {
        return Math.abs('a'-'z') + 1;
    }

}
