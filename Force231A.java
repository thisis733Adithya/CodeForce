import java.util.Scanner;

public class Force231A {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        while(n-- > 0){
            int n1 = s.nextInt();
            int n2 = s.nextInt();
            int n3 = s.nextInt();
            if((n1 == 1 && n2 == 1 )|| (n1 == 1 && n3 == 1 ) || (n2 == 1 && n3 == 1 ))
            {
                count++;

            }
        }   

        System.out.println(count);
    }
}
