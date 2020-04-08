package selection_sort;

import java.util.Scanner;

public class Selection_Sort {

    public static void main(String[] args) {
        int X[] = new int[5];
        int i, j, eleito, menor, pos;
        Scanner entrada = new Scanner(System.in);

        //carregando os numeros no vetor
        for(i=0; i<=4; i++){
            System.out.println("Digite o " + (i+1) + "° numero: ");
            X[i] = entrada.nextInt();
        }

        //ordenando de forma crescente
        //laço que percorre da 1ª posição á
        //penúltima posição do vetor
        //elegendo um número para ser comparado
        for(i=0; i<=3; i++){
            eleito = X[i];

            //encontrando o menor número á direita do eleitor
            //com sua respectiva posição
            //posição do eleito = i
            //primeiro número á direita do eleito
            //na posição = i + 1
            menor = X[i+1];
            pos = i + 1;

            //laço que percorre os elementos
            //que estão á direita do
            //número eleito, retornando o menor número
            //direita e sua posição
            for (j=i+2; j<=4; j++){
                if(X[j] < menor){
                    menor = X[j];
                    pos = j;
                }
            }

            //troca do número eleito com o número da posição pos
            //o número da posição pos é o menor número á direita
            //do número eleito
            if(menor < eleito){
                X[i] = X[pos];
                X[pos] = eleito;
            }
        }

        //mostrando o vetor ordenado
        for(i=0; i<=4; i++){
            System.out.println((i+1) + "º número: " + X[i]);
        }

    }
    
}