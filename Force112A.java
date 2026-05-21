import java.util.Scanner;

public class Force112A{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.next().toLowerCase();
        String str2 = s.next().toLowerCase();
        int val =  str1.compareTo(str2);
        if(val > 0)
        {
            System.out.println(1);
        }else if(val < 0)
        {
            System.out.println(-1);
        }
        else{
            System.out.println(0);
        }
    
        s.close();
    }

}