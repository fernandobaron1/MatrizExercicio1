
package matrizexercicio1;

import java.util.Scanner;


public class MatrizExercicio1 {

   
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in); 
       
       
        int quantidadeLinhas = 0;
        int quantidadeColunas = 0;
       
        System.out.println("Informe a quantidade de LINHAS que você deseja em sua matriz:");
        quantidadeLinhas = leia.nextInt();
        
        System.out.println ("Informe a quantidade de COLUNAS que você deseja em sua matriz:");
        quantidadeColunas = leia.nextInt();
        
        int [][] matriz = new int [quantidadeLinhas][quantidadeColunas];
        
        //Preencher
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Preencha a Matriz["+linha+"]"+"["+coluna+"]");  
                matriz [linha][coluna] = leia.nextInt();     
            }
        }
        //Percorrer        
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print("["+linha+"]"+"["+coluna+"] => "+matriz [linha][coluna]+"\t"); //\n
            }
            System.out.println("");
        }
        
    }
    
}
