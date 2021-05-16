
package atividaderevisao;

import java.util.Scanner;

public class Atividade8Revisao {
    public static void main(String[] args) {
        Double custo, venda;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Digite de custo: ");
        custo = teclado.nextDouble();
        System.out.print("Digite o preco de venda: ");
        venda = teclado.nextDouble();
        if(((venda+(50/100)*custo)>custo)){
        System.out.println("Houve lucro");
        }else{
        System.out.println("Houve prejuízo");
        }
        }  
}
