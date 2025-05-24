import java.util.Scanner;

public class Calculadorasimples {
    public static void main(String[] args) {

        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite o primeiro número: ");

        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");

        double num2 = scanner.nextDouble();
        System.out.println("Escolha a operação (+,-,*,/): ");

        char operacao = scanner.next().charAt(0);
        double resultado = 0;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero.");
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }
        System.out.println("Resultado: " + resultado);
        scanner.close();
        // Fecha o scanner para evitar vazamento de recursos
    }
}
// Este código é uma calculadora simples que permite ao usuário realizar operações básicas de adição, subtração, multiplicação e divisão.
// O usuário insere dois números e escolhe a operação desejada. O resultado é exibido na tela.
// O código utiliza a classe Scanner para ler a entrada do usuário e um bloco switch para determinar qual operação realizar com base na escolha do usuário.