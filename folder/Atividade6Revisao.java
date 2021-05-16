
package atividaderevisao;

import java.util.Scanner;

public class Atividade6Revisao {
    public static void main(String[] args) {
        Double horas;
        System.out.println("Quantas horas vc trabalhou?");
        Scanner  teclado=new Scanner(System.in);
        horas=teclado.nextDouble();
        System.out.println(+horas*12.25); 
    }
}
