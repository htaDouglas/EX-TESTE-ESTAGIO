import java.util.Scanner;

public class testeEstagio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se ele pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (pertenceAFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean pertenceAFibonacci(int numero) {
        int a = 0, b = 1;
        while (b < numero) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == numero || a == numero;
    }
}
