package Exerc�cios;

import java.util.Scanner;

public class Quesito6 {
	public static void main(String[] args) {
		
		int numero,somaMult3=0,contMult3=0;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nO sistema se encerrar� assim que voc� inserir o n�mero zero.");
		System.out.println("\nEscolha seus n�meros inteiros");
		
		do
		{
			System.out.println("\nEntre com um n�mero: ");
			numero = leia.nextInt();
			if(numero==0)
			{
				System.out.println("\nN�mero zero inserido, programa finalizado!");
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
		System.out.printf("\nM�dia dos n�meros m�ltiplos de 3: %6.2f",media);

	}
}
