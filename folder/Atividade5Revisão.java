
package atividaderevisao;

import java.util.Scanner;

public class Atividade5Revisão {
       public static void main(String[] args) {
        int num,div=0, cont;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        num = teclado.nextInt();
        for(cont=1;cont<=num;cont++){
            if(num%cont==0){
            div++;
            }
        }
        if(div==2 & num%2==0){
            System.out.println("O número é primo e é par");
        }else if(div==2 & num%2!=0){
            System.out.println("O número é primo e ímpar");
        }else if(div!=2 & num%2==0){
            System.out.println("O número não é primo e é par");
        }else{
            System.out.println("O número não é primo e é ímpar");
        }
    }
}
