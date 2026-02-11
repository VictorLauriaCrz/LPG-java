import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("valor de n");
        n = sc.nextInt();

        while(true) {
            System.out.print( n + " ");

            if (n == 1 ) break;

            if (n % 2 == 1){
                n = 3 * n + 1;
            }
            else {
                n = n / 2;
            }
        }
    }
}