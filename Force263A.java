
import java.util.Scanner;

public class Force263A {
    public static void main(String[] args) {
    int[][] matrix = new int[5][5];
    int row  =0, col =0;
    Scanner s = new Scanner(System.in);
    for(int i=0; i<5; i++)
    {
    for(int j=0; j<5; j++){
                matrix[i][j] = s.nextInt();
                if(matrix[i][j] ==  1)
                {
                    row = i;
                    col = j;
                }
    }
    
    } 
    int step = Math.abs(2 - row) + Math.abs(2 - col);
    System.out.println(step);
    s.close();
    }

}
