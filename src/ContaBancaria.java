import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        // Projeto ContaBancaria para consolidar os conhecimentos aprendidos no curso até o momento

        // Declaração de variáveis
        String nome = "Edson Arantes do Nascimento";
        String tipoDaConta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("+---------------------------------------+");
        System.out.println("  Dados iniciais do cliente              ");
        System.out.println("                                         ");
        System.out.println("  Nome: " + nome);
        System.out.println("  Tipo da conta: " + tipoDaConta);
        System.out.printf ("  Saldo inicial: R$ %.2f\n", saldo);
        System.out.println("+---------------------------------------+");

        // Início do loop para exibir o menu até o usuário escolher sair
        while (opcao != 4) {
            System.out.println();
            System.out.println("  Operações:");
            System.out.println("  1 - Consultar saldo");
            System.out.println("  2 - Receber valor");
            System.out.println("  3 - Transferir valor");
            System.out.println("  4 - Sair");
            System.out.print("  Digite a opção desejada: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                System.out.println("Opção escolhida: " + opcao);

                switch (opcao) {
                    case 1:
                        System.out.printf("Saldo atual: R$ %.2f\n", saldo);
                        break;

                    case 2:
                        System.out.print("Informe o valor a receber: ");
                        double valorRecebido = scanner.nextDouble();
                        saldo += valorRecebido;
                        System.out.printf("Saldo atualizado: R$ %.2f\n", saldo);
                        break;

                    case 3:
                        System.out.print("Informe o valor que deseja transferir: ");
                        double valorTransferido = scanner.nextDouble();
                        if (valorTransferido > saldo) {
                            System.out.println("O valor que deseja transferir é maior que o saldo atual.");
                        } else {
                            saldo -= valorTransferido;
                            System.out.printf("Saldo atualizado: R$ %.2f\n", saldo);
                        }
                        break;

                    case 4:
                        System.out.println("Obrigado por utilizar nosso sistema. Volte logo!");
                        break;

                    default:
                        System.out.println("Opção inválida. Por favor, digite um número de 1 a 4.");
                        break;
                }

            } else {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro para a opção.");
                scanner.next(); // Limpa entrada inválida
            }
        }

        scanner.close(); // Boa prática: fechar o Scanner
    }
}
