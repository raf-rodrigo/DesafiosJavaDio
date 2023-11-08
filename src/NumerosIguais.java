import java.util.Scanner;

public class NumerosIguais {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        num1 = scan.nextInt();
        num2 = scan.nextInt();

        if (num2 == num1) {
            System.out.println("São iguais!");
        } else if (num1 != num2) {
            System.out.println("Não são iguais!");
        }
    }
}
