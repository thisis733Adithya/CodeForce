import java.util.Scanner;

public class Force158A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int k = s.nextInt();
        int []arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] =s.nextInt();
        }
        int count =0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] >= arr[k-1] && arr[i] > 0)
            {
                count++;
            }
        }


        System.out.println(count);
    }

    
}
