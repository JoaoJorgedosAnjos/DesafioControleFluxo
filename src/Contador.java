import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametro1 = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametro2 = scanner.nextInt();

        try {
            ParametrosInvalidosException.contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
}
