
package atividaderevisao;

public class Atividade4Revisao {
    public static void main(String[] args) {
         double num, mpar=1,simpar=0;
        for(num=0;num<=30;num++){
            if(num%2==0 & num!=0){
            mpar=mpar*num;
            }else{
            simpar=simpar+num;
            }
        }
        System.out.println("Multiplicação dos números Pares entre 0 e 30 = "+mpar);
        System.out.println("Soma do números Ìmpares entre 0 e 30 = "+simpar);
    }
}
  
