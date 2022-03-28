import java.util.Scanner;
public class Exercicio6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sala[][]= new  int[2][6];
        int somaSala1=0;
        int somaSala2=0;

        for(int i=0; i<sala.length;i++){
            for(int j=0; j<6;j++){
                System.out.println("Digite uma idade da sala: "+(i+1));
                sala[i][j]=sc.nextInt();
                if(i==0){
                    somaSala1+=sala[i][j];
                    
                }
                else{
                    somaSala2+=sala[i][j];
                
                }
        System.out.println("A soma da idade da 1° sala é: "+somaSala1);
        System.out.println("A soma da idade da 2° sala é: "+somaSala2);
                
            }
        }


    }

}