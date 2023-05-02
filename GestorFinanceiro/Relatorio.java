import java.util.ArrayList;

public class Relatorio {
    
    public void relatorioMensal(int mes, int ano,ArrayList< Gasto> gastos,ArrayList <Ganho> ganhos){

        double totalGastos = 0;
        double totalGanhos = 0;

        // Percorrer todos os gastos e ganhos
        for (Gasto gasto : gastos) {
            String[] dataSplit = gasto.getData().split("/");
            int gastoMes = Integer.parseInt(dataSplit[1]);
            int gastoAno = Integer.parseInt(dataSplit[2]);

            if (gastoMes == mes && gastoAno == ano) {
                totalGastos += gasto.getValor();
            }
        }

        for (Ganho ganho : ganhos) {
            String[] dataSplit = ganho.getData().split("/");
            int ganhoMes = Integer.parseInt(dataSplit[1]);
            int ganhoAno = Integer.parseInt(dataSplit[2]);

            if (ganhoMes == mes && ganhoAno == ano) {
                totalGanhos += ganho.getValor();
            }
        }

        double saldo = totalGanhos - totalGastos;

        System.out.printf("\nMês/Ano: %02d/%04d", mes, ano);
        System.out.printf("\nTotal de Gastos: R$%.2f", totalGastos);
        System.out.printf("\nTotal de Ganhos: R$%.2f", totalGanhos);
        System.out.printf("\nSaldo: R$%.2f", saldo);
    }
}
