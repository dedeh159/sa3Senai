
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
        calc.setTotalDaCompra(sc.nextDouble());

        System.out.println("Digite o valor do pagamento do cliente: ");
        calc.setValorPagamento(sc.nextDouble());

        calc.calculaTroco();

        System.out.println(calc.toString());





        sc.close();
    }
}
