//importa a classe Scanner para nosso projeto, que esta dentro do pacote java.util
import java.util.Scanner;
//declara uma classe publica chamada Vetor2 e inicia o corpo da classe.
public class Exercicio2{
    //tipo de metodo, declaração do metodo, o void diz que não tem retorno, e o main é o nome do metodo, em parenteses tem o parametro)
    public static void main(String[] args){
        //Scanner é utilizado para que consigam pegar dados de fora, ou seja, a pessoa digita o qe ela quer.
        Scanner sc=new Scanner(System.in);
        //Int mostra que n é inteiro
        int n=5;
        //String mostra que são letras e não números.
        String funcionario[] = new String[n];
        //for é o sistema de repetição, index é apenas uma variavel pode ter qualquer nome, ++ é para somar 1
        // o metodo .lenght retorna o tamanho do vetor
        for(int index = 0; index < funcionario.length; index++){
            System.out.println("Digite o nome do funcionario");
            //adicionar os nomes que foram digitados pelo usuario no vetor
            funcionario[index]=sc.next();
        }
        for(int index = 0; index < funcionario.length; index++){
            System.out.println(funcionario[index]);
        }
        sc.close();

        

    }
}