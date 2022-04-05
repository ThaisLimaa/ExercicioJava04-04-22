package Exercícios;

import java.util.Scanner;

public class Quesito2 {
	public static void main(String[] args) {
		
		int num,contPar=0,contImpar=0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nSoma dos números pares e ímpares ");
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println("\nInsira um número: ");
			num = leia.nextInt();
			if(num<0)
			{
				System.out.println("\nNúmero negativo inserido, programa finalizado!");
			}
			else
			{
				if(num%2==0)
				{
					contPar++;
				}
				else
				{
					contImpar++;
				}
			}
		}
		
		System.out.println("\nSomatório dos números pares: "+contPar);
		System.out.println("\nSomatório dos números impares: "+contImpar);

	}
}
