
package atividaderevisao;

import java.util.Scanner;

public class Atividade2Revisao {
    public static void main(String[] args) {
        int escolha,num1,num2;  
        Scanner teclado=new Scanner (System.in); 
        System.out.println("Digite o preimeiro numero:");
        num1=teclado.nextInt();
        System.out.println("Digite o segundo numero:");
        num2=teclado.nextInt();
        System.out.println("Escolha qual operação ddeseja realizar:\n1=Multiplicação\n2=Dvisão\n3=Soma\n4=Subtração");
        escolha=teclado.nextInt();
        if(escolha==1){
            System.out.println(num1*num2);
        }else if(escolha==2){
            System.out.println(num1/num2);
        }else if(escolha==3){
            System.out.println(num1+num2);
        }else if(escolha==4){
            System.out.println(num1-num2);
        }
    }
}
