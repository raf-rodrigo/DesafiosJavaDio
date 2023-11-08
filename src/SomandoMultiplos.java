import java.util.Scanner;

public class SomandoMultiplos {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int soma = a;
        int divisor =  b / a;
        for (int i = 2; i <= divisor; i++) {
            soma = soma + a*i;
        }

        System.out.println(soma);
    }

}
