import java.util.Scanner;

public class Force1A {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        long n = s.nextInt();
        long m = s.nextInt();
        long a = s.nextInt();
        long sum = (long) (Math.ceil((double)n/a) * Math.ceil((double)m/a));

        System.out.println(sum);
}
}
