import java.util.Scanner;

public class ChamadaRecursiva {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N;
        N = scanner.nextInt();
        int soma = 0;
        for (int i = N; i >= 0; i--){
            soma = soma + i;
        }

        System.out.println(soma);
    }
}
