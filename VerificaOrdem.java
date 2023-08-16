package com.mycompany.verificaordem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


import java.util.Scanner;

/**
 *
 * @author franc
 */
public class VerificaOrdem {
    static char vetor[] = new char[6];
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Repetição até o usuário digitar 6 caracteres de sua escolha.
        for(int i=0; i <= 5; i++){
            System.out.printf("Digite o caractere de posição %d: ", i);
            
            // A função toLowerCase transforma os caracteres em minúsculo para evitar erros.
            vetor[i] = Character.toLowerCase(scanner.next().charAt(0));  
        }   
        crescente();
    }
    public static void crescente(){
        int crescente = 0;
        
        for(int i = 0; i <= 5; i++){
            if(i + 1 < 6){
                //Se a posição do vetor for menor que a seguinte posição, então a variável crescente receberá ela mesma mais um.
                if(vetor[i] < vetor[i + 1]){
                    crescente +=1;
                }
            }
        }
        //Caso a variável crsecente seja igual a 5, isso significa que o vetor está em ordem crescente.
        if(crescente == 5){
            System.out.println("Este vetor está em ordem crescente.");
        }
        //Se não atender ao if, significa que o vetor não está em ordem, e sim desordenado.
        else{
            System.out.println("Este vetor não está em ordem crescente.");
        }  
    }
}

	

