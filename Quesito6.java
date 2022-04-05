package Exercícios;

import java.util.Scanner;

public class Quesito6 {
	public static void main(String[] args) {
		
		int numero,somaMult3=0,contMult3=0;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nO sistema se encerrará assim que você inserir o número zero.");
		System.out.println("\nEscolha seus números inteiros");
		
		do
		{
			System.out.println("\nEntre com um número: ");
			numero = leia.nextInt();
			if(numero==0)
			{
				System.out.println("\nNúmero zero inserido, programa finalizado!");
			}
			else
			{
				if(numero%3==0)
				{
					somaMult3 +=numero;
					contMult3++;
				}
			}
		}
		while(numero!=0);
		media = somaMult3 / contMult3;
		System.out.printf("\nMédia dos números múltiplos de 3: %6.2f",media);

	}
}
