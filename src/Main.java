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
        //scanner.close();


        int controle = 0;
        Scanner scanner2 = new Scanner(System.in);
        int[] vetor2 = new int[5];
        System.out.println("Digite 5 números: ");

        while (controle < 5) {
            System.out.println("Digite o número " + controle + ":");
            vetor2[controle] = scanner2.nextInt();
            controle++;
        }

        System.out.println("Vetor for: " + Arrays.toString(vetor));
        System.out.println("Vetor While: " + Arrays.toString(vetor2));
        scanner.close();
        scanner2.close();
    }

}