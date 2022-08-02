import java.util.Scanner;

public class harmonic {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.print("Enter the N number: ");
        int n = inp.nextInt();
        double result=0.0,i=1;
        while(i<=n) {
            result += (1/i);
            i++;
        }
        System.out.println("Harmonic Number is: "+result);
    }
}
