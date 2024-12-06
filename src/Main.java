import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        System.out.println("Digite 5 números: ");

        for (int index = 0; index < 5; index++) {
            System.out.println("Digite o número " + index + ":");
            vetor[index] = scanner.nextInt();
        }

        int controle = 0;
        Scanner scanner2 = new Scanner(System.in);
        int[] vetor2 = new int[5];
        System.out.println("Digite 5 números: ");

        while (controle < 5) {
            System.out.println("Digite o número " + controle + ":");
            vetor2[controle] = scanner2.nextInt();
            controle++;
        }

        int controle2 = 0;
        Scanner scanner3 = new Scanner(System.in);
        int[] vetor3 = new int[5];

        do {
            System.out.println("Digite 5 números: ");
            System.out.println("Digite o número " + controle2 + ":");
            vetor3[controle2] = scanner3.nextInt();
            controle2++;
        }
        while (controle2 < 5); {


        }


        System.out.println("Vetor for: " + Arrays.toString(vetor));
        System.out.println("Vetor While: " + Arrays.toString(vetor2));
        System.out.println("Vetor Do While: " + Arrays.toString(vetor3));
        scanner.close();
        scanner2.close();
        scanner3.close();
    }

}