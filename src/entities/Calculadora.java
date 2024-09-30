package entities;

public class Calculadora {
    private double totalDaCompra;
    private double valorPagamento;
    private int[] troco = new int[12];
    private double[] valores = new double[]{100, 50, 20, 10, 5, 2, 1, 0.50, 0.25, 0.10, 0.05, 0.01};
    private String[] valoresEscritos = new String[]{"Nota: R$ 100,00", "Nota: R$ 50,00", "Nota: R$ 20,00", "Nota: R$ 10,00",
            "Nota: R$ 5,00", "Nota: R$ 2,00", "Moeda: R$ 1,00", "Moeda: R$ 0,50", "Moeda: R$ 0,25", "Moeda: R$ 0,10", "Moeda: R$ 0,05",
            "Moeda: R$ 0,01"};
    private boolean temTroco = false;

    public double getTotalDaCompra() {
        return totalDaCompra;
    }

    public void setTotalDaCompra(double totalDaCompra) {
        this.totalDaCompra = totalDaCompra;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    //100 reais, 50 reais, 20 reais 10 reais, 5 reais, 2 reais, 1 realmoeda, 50 centavos, 25 centavos, 10 centavos
    //5 centavos, 1 centavo;
    public void calculaTroco() {
        double a = this.valorPagamento - this.totalDaCompra ;
        for (int i = 0; i < 12; i++) {
            if (a >= valores[i] && a > 0) {
                troco[i] = (int) (a / valores[i]);
                a =  a - ( troco[i] * valores[i]);
                this.temTroco = true;
            }
        }
    }

    @Override
    public String toString() {

            if (this.temTroco) {
            for (int i = 0; i < 12; i++) {
                if (troco[i] > 0) {
                    System.out.println(troco[i] + " " + valoresEscritos[i]);
                }
            }
        }else {
                return "Sem troco para a compra";
            }
            return "Fim da operação";
    }
}

