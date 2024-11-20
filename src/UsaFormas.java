import java.util.ArrayList;
import java.util.Scanner;

public class UsaFormas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Object> formas = new ArrayList<>();
        System.out.print("Quantas formas você deseja criar? ");
        int quantidadeFormas = scanner.nextInt();

        for (int i = 0; i < quantidadeFormas; i++) {
            System.out.println("Escolha o tipo de forma (1 - Circunferencia, 2 - Retangulo, 3 - Triangulo): ");
            int tipoForma = scanner.nextInt();

            try {
                switch (tipoForma) {
                    case 1:
                        System.out.print("Digite o valor do raio: ");
                        double raio = scanner.nextDouble();
                        formas.add(new Circunferencia(raio));
                        break;
                    case 2:
                        System.out.print("Digite o valor do lado 1: ");
                        double lado1 = scanner.nextDouble();
                        System.out.print("Digite o valor do lado 2: ");
                        double lado2 = scanner.nextDouble();
                        formas.add(new Retangulo(lado1, lado2));
                        break;
                    case 3:
                        System.out.print("Digite a base: ");
                        double base = scanner.nextDouble();
                        System.out.print("Digite a altura: ");
                        double altura = scanner.nextDouble();
                        formas.add(new Triangulo(base, altura));
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } catch (RuntimeException e) {
                System.out.println("Erro: " + e.getMessage());
            }

            System.out.print("Deseja adicionar mais formas? (S/N): ");
            String continuar = scanner.next();
            if (continuar.equalsIgnoreCase("N")) {
                break;
            }
        }

        System.out.println("\nÁreas das formas criadas:");
        for (Object forma : formas) {
            if (forma instanceof Circunferencia) {
                System.out.println("Circunferência: " + ((Circunferencia) forma).area());
            } else if (forma instanceof Retangulo) {
                System.out.println("Retângulo: " + ((Retangulo) forma).area());
            } else if (forma instanceof Triangulo) {
                System.out.println("Triângulo: " + ((Triangulo) forma).area());
            }
        }
    }
}