import java.util.Random;
public class Exercicio4{
    public static void main(String[] args){
        Random random= new Random();
        int numero[]={random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100)};

        for(int i=0; i<numero.length; i++){
            if(numero[i]%2==0){
                System.out.println("Par");
                System.out.println(numero[i]);
            }
            else{
                System.out.println("Impar");
                System.out.println(numero[i]);
            }

        }
    }
}