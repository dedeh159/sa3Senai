
package application;

import entities.Calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        System.out.println("Digite o valor da compra: ");

        //preenchendo o valor total da compra do cliente
        calc.setTotalDaCompra(sc.nextDouble());

        System.out.println("Digite o valor do pagamento do cliente: ");

        //preenchendo o valor do pagamento que o cliente efetuou.
        calc.setValorPagamento(sc.nextDouble());

        //chamando metodo para efetuar calculo do troco
        calc.calculaTroco();

        //impressão do valor em tela para visualização.
        System.out.println(calc.toString());





        sc.close();
    }
}
