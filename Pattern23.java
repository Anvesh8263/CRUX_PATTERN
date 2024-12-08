import java.util.Scanner;
public class Pattern23 {

        public static void main(String[] args) {
            
            int n = 5;
            int row = 1;
            int space = n - 1;
            int star = 1;
            while (row <= n) {
                // space
                int i = 1;
                while (i <= space) {
                    System.out.print("  ");
                    i++;
                }
    
                // satr
                int j = 1;
                while (j <= star) {
                    System.out.print("1 ");
                    j++;
                }
    
                // next row prep
                System.out.println();
                row++;
                space--;
                star += 2;
            }
        }
    
}