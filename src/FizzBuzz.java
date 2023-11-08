import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int multiploDeTres = num % 3;

        int multiploDeCinco = num % 5;

        if (multiploDeTres == 0 && multiploDeCinco == 0){
            System.out.println("FizzBuzz");
        } else if (multiploDeTres == 0 && multiploDeCinco != 0) {
            System.out.println("Fizz");
        } else if (multiploDeTres != 0 && multiploDeCinco == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }


    }
}
