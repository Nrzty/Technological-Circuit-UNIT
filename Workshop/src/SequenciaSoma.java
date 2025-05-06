import java.util.Scanner;

public class SequenciaSoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Insira o valor de M e N em sequência:");
            int m = scanner.nextInt();
            int n = scanner.nextInt();

            if (m <= 0 || n <= 0) {
                System.out.println("Ao menos um dos valores é menor ou igual " +
                        "a 0");
                break;
            }

            int menor = Math.min(m, n);
            int maior = Math.max(m, n);
            int soma = 0;

            StringBuilder sequencia = new StringBuilder();
            for (int i = menor; i <= maior; i++) {
                sequencia.append(i).append(" ");
                soma += i;
            }

            System.out.println(sequencia.toString() + "Sum=" + soma);
        }

        scanner.close();
    }
}
