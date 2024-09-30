package entities;

public class Calculadora {

    //variáveis e vetores utilizados na aplicação
    private double totalDaCompra;
    private double valorPagamento;
    private int[] troco = new int[12];
    private double[] valores = new double[]{100, 50, 20, 10, 5, 2, 1, 0.50, 0.25, 0.10, 0.05, 0.01};
    private String[] valoresEscritos = new String[]{"Nota: R$ 100,00", "Nota: R$ 50,00", "Nota: R$ 20,00", "Nota: R$ 10,00",
            "Nota: R$ 5,00", "Nota: R$ 2,00", "Moeda: R$ 1,00", "Moeda: R$ 0,50", "Moeda: R$ 0,25", "Moeda: R$ 0,10", "Moeda: R$ 0,05",
            "Moeda: R$ 0,01"};

    //boolean para chegar se vai haver valor ou não para troco.
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

    //metodo que calcula o valor total de troco da operação e gera na variável a o valor para ser calculado
    //dentro do valor de cada moeda disponivel dentro dos vetores.
    public void calculaTroco() {
        double a = this.valorPagamento - this.totalDaCompra ;
        //percorrendo todas as moedas salvas dentro do vetor valores
        for (int i = 0; i < 12; i++) {
            //checando se o valor e superior a cedula e se é maior que zero.
            if (a >= valores[i] && a > 0) {

                //atribuindo a quantidade de cedulas/moedas correspondentes ao troco
                troco[i] = (int) (a / valores[i]);

                //deixando o resto da subração da moeda para os próximos calculos
                a =  a - ( troco[i] * valores[i]);

                //alterando para impressão no metodo toString// caso for false ele dirá que não há troco a ser dado
                this.temTroco = true;
            }
        }
    }

    @Override
    public String toString() {

            //checando se houve troco na operação calculaTroco
            if (this.temTroco) {
            for (int i = 0; i < 12; i++) {
                if (troco[i] > 0) {
                    //efetuando impressão do vetor de quantidade da moeda/cedula e os valores em formato de string
                    //no vetor valoresEscritos
                    System.out.println(troco[i] + " " + valoresEscritos[i]);
                }
            }
        }else {
                //caso não houver troco retornada essa mensagem
                return "Sem troco para a compra";
            }
            //impressão do final do calculo
            return "Fim da operação";
    }
}

