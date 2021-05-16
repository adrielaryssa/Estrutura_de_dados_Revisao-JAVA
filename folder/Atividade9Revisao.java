
package atividaderevisao;

import java.util.Scanner;

public class Atividade9Revisao {
      public static void main(String[] args) {
        int mes=1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número do mês");
        mes= teclado.nextInt();
        String mesc = "";

        switch (mes) {
            case 1:
                mesc = "Janeiro";
                break;
            case 2:
                mesc = "Fevereiro";
                break;
            case 3:
                mesc = "Março";
                break;
            case 4:
                mesc = "Abril";
                break;
            case 5:
                mesc = "Maio";
                break;
            case 6:
                mesc = "Junho";
                break;
            case 7:
                mesc = "Julho";
                break;
            case 8:
                mesc = "Agosto";
                break;
            case 9:
                mesc = "Setembro";
                break;
            case 10:
                mesc = "Outubro";
                break;
            case 11:
                mesc = "Novembro";
                break;
            case 12:
                mesc = "Dezembro";
                break;
            default:
                mesc = "Inválido";
                break;
        }
        System.out.println("Mês: "+mesc);
    }
}
