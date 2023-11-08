import java.util.Scanner;

public class BuscaSequencial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        buscarElemento(num, elementos);

    }

    private static void buscarElemento(int num, int[] elementos) {

        if (num == elementos[0]) {
            System.out.println("Achei "+num +" na posição "+0);
        } else if (num == elementos[1]) {
            System.out.println("Achei " + num + " na posição " + 1);
        } else if (num == elementos[2]) {
            System.out.println("Achei " + num + " na posição " + 2);
        } else if (num == elementos[3]) {
            System.out.println("Achei " + num + " na posição " + 3);
        }else if (num == elementos[4]) {
            System.out.println("Achei " + num + " na posição " + 4);
        }else if (num == elementos[5]) {
            System.out.println("Achei " + num + " na posição " + 5);
        }else if (num == elementos[6]) {
            System.out.println("Achei " + num + " na posição " + 6);
        }else if (num == elementos[7]) {
            System.out.println("Achei " + num + " na posição " + 7);
        }else if (num == elementos[8]) {
            System.out.println("Achei " + num + " na posição " + 8);
        }else if (num == elementos[9]) {
            System.out.println("Achei " + num + " na posição " + 9);
        } else {
            System.out.println("Numero "+num+" não encontrado!");
        }

    }
}
