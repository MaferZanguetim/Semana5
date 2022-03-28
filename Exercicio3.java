public class Exercicio3{
    public static void main(String[] args){
        String meses[]={"janeio","fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

         System.out.println("1º semestre");
        for(int i=0; i<(meses.length)/2; i++){
            System.out.println(meses[i]);
        }
        System.out.println("2º semestre");
        for(int i=6; i< meses.length; i++){
            System.out.println(meses[i]);
        }
    }
}