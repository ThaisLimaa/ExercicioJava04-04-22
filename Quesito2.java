package Exerc�cios;

import java.util.Scanner;

public class Quesito2 {
	public static void main(String[] args) {
		
		int num,contPar=0,contImpar=0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nSoma dos n�meros pares e �mpares ");
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println("\nInsira um n�mero: ");
			num = leia.nextInt();
			if(num<0)
			{
				System.out.println("\nN�mero negativo inserido, programa finalizado!");
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
		
		System.out.println("\nSomat�rio dos n�meros pares: "+contPar);
		System.out.println("\nSomat�rio dos n�meros impares: "+contImpar);

	}
}
