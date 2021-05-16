
package atividaderevisao;

import java.util.Scanner;

public class Atividdade7Revisao {
    public static void main(String[] args) {
        Double horas, valor;
        System.out.println("Quantas horas vc trabalhou?");
        Scanner  teclado=new Scanner(System.in);
        horas=teclado.nextDouble();
        valor=horas*12.25;
        System.out.println(+valor); 
        if(valor<50.00){
            System.out.println("Atenção, dirija-se à direção do Hotel!");
        }
    }
}
