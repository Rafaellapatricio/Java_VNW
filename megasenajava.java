package br.com.vainaweb.backendt1.megasenajava;
/* 1 - MEGA-SENA EM JAVA
→ O usuário precisa escolher 7 números de 0 a 100. 
→ Precisa ser obrigatoriamente um numero inteiro. Caso o usuário digite outro tipo de dado, o programa não pode parar
→ Os números escolhidos terão de ser guardados em um vetor
→ Os 7 números vencedores terão de ser sorteado pela classe Random do java. 
→ Após o final, percorrer o vetor com as respostas e comparar com os 7 números sorteados
→ Se o usuário acertar 5 números → Premio de 10 mil reais
→ Se o usuário acertar 6 números → Premio de 50 mil reais
→ Se o usuário acertar 7 números → Premio de 200 mil reais */

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class megasenajava {

	public static void  main(String [] args) {
		
		Scanner valoresEscolhidos = new Scanner(System.in);
		Random rd = new Random();
		int[] numerosMega = new int[7];
		int[] vetorValoresEscolhidos = new int[7];
		int contador=0;
		
		//gerando um vetor aleatorio
		for (int i = 0; i < 7; i++) {
			int numAleatorio = (int)(Math.random() * 100 ) + 1;
		    numerosMega[i]=+numAleatorio;   
		}
		
		//inserindo valores para comparar
		System.out.println("MEGA SENA - JAVA.");
		System.out.println("Digite uma sequencia de 7 números entre 0 e 100.");
		 
		for (int j = 0; j < vetorValoresEscolhidos.length; j++) {
			
			try {
				System.out.print("Digite o " + (j+1)+" valor:");
			    vetorValoresEscolhidos[j] = valoresEscolhidos.nextInt(); 
			    
			    //percorrendo o vetor e comparando com o outro vetor aleatório.
			    
			    if(vetorValoresEscolhidos[j]==numerosMega[0]) {
					contador++;
				}
				if(vetorValoresEscolhidos[j]==numerosMega[1]) {
					contador++;
				}
				if(vetorValoresEscolhidos[j]==numerosMega[2]) {
					contador++;
				}
				if(vetorValoresEscolhidos[j]==numerosMega[3]) {
					contador++;
				}
				if(vetorValoresEscolhidos[j]==numerosMega[4]) {
					contador++;
				}
				if(vetorValoresEscolhidos[j]==numerosMega[5]) {
					contador++;
				}
				if(vetorValoresEscolhidos[j]==numerosMega[6]) {
					contador++;
				}
			
			}
			catch(Exception e) {
				System.err.println("O tipo de entrada não é compatível.");
				valoresEscolhidos.next();
				if(vetorValoresEscolhidos[j]==0){
					System.out.println("Digite um número inteiro: ");
					vetorValoresEscolhidos[j]= valoresEscolhidos.nextInt();
				}
			}
		} 
		
		System.out.println("Os números da Mega são: "+Arrays.toString(numerosMega));
		System.out.println("Os números que você escolheu foram: "+Arrays.toString(vetorValoresEscolhidos));
		
		
		//verificando resultado final total
		switch(contador){
		
			case 1:
				System.out.println("Você acertou apenas 1 número.");
				break;
			case 2:
				System.out.println("Você acertou apenas 2 números.");
				break;
			case 3:
				System.out.println("Você acertou apenas 3 números.");
				break;	
			case 4:
				System.out.println("Você acertou apenas 4 números.\n Quase lá");
				break;
			case 5:
				System.out.println("Parabéns, você acertou 5 números.");
				System.out.println("SEU PRÊMIO É DE 50 MIL");
				break;
			case 6:
				System.out.println("Parabéns, você acertou 6 números.");
				System.out.println("SEU PRÊMIO É DE 100 MIL");
				break;	
			case 7:
				System.out.println("Parabéns, você acertou 7 números.");
				System.out.println("SEU PRÊMIO É DE 200 MIL");
				break;
			
			default:
				System.out.println("Você  não acertou nenhum número.");
		}	
		
	}
}
