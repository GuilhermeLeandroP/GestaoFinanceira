import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Ganho> ganhos = new ArrayList<Ganho>();
        ArrayList<Gasto> gastos = new ArrayList<Gasto>();
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n-----------------------");
            System.out.println("1 - Adicionar Gasto");
            System.out.println("2 - Adicionar Ganho");
            System.out.println("3 - Relatório de Gastos");
            System.out.println("4 - Relatório de Ganhos");
            System.out.println("5 - Relatório Mensal");
            System.out.println("6 - Sair\n");

            System.out.print("Selecione uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nAdicionar Gasto");
                    System.out.println("-----------------------");
                    System.out.println("1 - Habitação");
                    System.out.println("2 - Entretenimento");
                    System.out.println("3 - Alimentação");
                    System.out.println("4 - Transporte");
                    System.out.println("99 - Voltar\n");
                    System.out.print("Selecione o tipo de gasto: ");
                    int tipoGasto = scanner.nextInt();
                    if (tipoGasto == 99) {
                        break; // sai do switch e continua o loop do while
                    }
                    System.out.print("Informe a data: (dd/mm/yyyy)");
                    String data = scanner.next();
                    System.out.print("Informe o valor: ");
                    double valor = scanner.nextDouble();
                    System.out.println("1 - Cheque");
                    System.out.println("2 - Pix");
                    System.out.println("3 - Débito");
                    System.out.print("Selecione a forma de pagamento: ");
                    int formaDePagamentoInt = scanner.nextInt();
                    String formaDePagamento = "";
                    switch (formaDePagamentoInt) {
                        case 1:
                            formaDePagamento = "Cheque";
                            break;
                        case 2:
                            formaDePagamento = "Pix";
                            break;
                        case 3:
                            formaDePagamento = "Débito";
                            break;

                    }

                    scanner.nextLine();
                    String tipoGastoStr = "";
                    switch (tipoGasto) {
                        case 1:
                            tipoGastoStr = "Habitação";
                            break;
                        case 2:
                            tipoGastoStr = "Entretenimento";
                            break;
                        case 3:
                            tipoGastoStr = "Alimentação";
                            break;
                        case 4:
                            tipoGastoStr = "Transporte";
                            break;
                        default:
                            tipoGastoStr = scanner.nextLine();
                            break;
                    }
                    Gasto novoGasto = new Gasto(tipoGastoStr, data, valor, formaDePagamento);
                    gastos.add(novoGasto);
                    System.out.println("\nGasto adicionado com sucesso: " + novoGasto);
                    break;

                case 2:
                    System.out.println("Adicionar Ganho");
                    System.out.println("-----------------------");
                    System.out.println("Selecione o tipo de ganho:");
                    System.out.println("1 - Salário");
                    System.out.println("2 - Freelancer");
                    System.out.println("3 - Dividendos");
                    int opcaoGanho = scanner.nextInt();
                    String tipoGanho = "";
                    switch (opcaoGanho) {
                        case 1:
                            tipoGanho = "Salário";
                            break;
                        case 2:
                            tipoGanho = "Freelancer";
                            break;
                        case 3:
                            tipoGanho = "Dividendos";
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            continue;
                    }
                    System.out.println("Informe a data: (dd/mm/yyyy)");
                    String dataGanho = scanner.next();
                    System.out.println("Informe o valor:");
                    double valorGanho = scanner.nextDouble();
                    System.out.println("Selecione a forma de recebimento:");
                    System.out.println("1 - Cheque");
                    System.out.println("2 - Pix");
                    System.out.println("3 - Depósito");

                    Ganho novoGanho = new Ganho(tipoGanho, dataGanho, valorGanho);
                    ganhos.add(novoGanho);
                    System.out.println("\nGanho adicionado com sucesso: " + novoGanho);
                    break;

                case 3: // relatório de gastos
                    System.out.println("\nRELATÓRIO DE GASTOS");
                    System.out.println("=====================");
                    for (Gasto gasto : gastos) {
                        System.out.println(gasto);
                    }
                    break;

                case 4: // relatório de ganhos
                    System.out.println("\nRELATÓRIO DE GANHOS");
                    System.out.println("=====================");
                    for (Ganho ganho : ganhos) {
                        System.out.println(ganho);
                    }
                    break;

                case 5: // relatório mensal
                    System.out.println("\nRELATÓRIO MENSAL");
                    System.out.println("=====================");

                    // Pedir ao usuário o mês e o ano
                    System.out.print("Informe o mês (mm): ");
                    int mes = scanner.nextInt();
                    System.out.print("Informe o ano (yyyy): ");
                    int ano = scanner.nextInt();

                    Relatorio relatorio = new Relatorio();
                    relatorio.relatorioMensal(mes, ano, gastos, ganhos);
                    break;

                case 6:
                    System.out.println("Encerrando...");
                    rodando = false;
                    break;

                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
                    break;
            }
        }
    }
}