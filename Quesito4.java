package Exercícios;

import java.util.Scanner;

public class Quesito4 {
	public static void main(String[] args) {
		
		int idade,genero,fp,contPc=0,contMn=0,contHa=0,contNbc=0,contPn40=0,contPc18=0,pessoas=1;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nPesquisa psicológica");
				
		while(pessoas<=2)
		{
			System.out.println("\nQual a sua idade: ");
			idade = leia.nextInt();
			while(idade<1 || idade>130)
			{
				System.out.println("\nPor favor entre com a sua idade novamente: ");
				idade = leia.nextInt(); 
			}
			System.out.println("\nQual o seu gênero: 1-Masculino 2-Feminino 3-Não binário");
			genero = leia.nextInt();
			while(genero<1 || genero>3)
			{
				System.out.println("\nEntre com o seu gênero novamente: 1-Masculino 2-Feminino 3-Não binário");
				genero = leia.nextInt();
			}
			System.out.println("\nQual o seu fator psicológico: 1- Calma(o) 2-Nervosa(o) 3- Agressiva(o)");
			fp = leia.nextInt();
			while(fp<1 || fp>3)
			{
				System.out.println("\nEntre com o seu fator psicológico novamente: 1- Calma(o) 2-Nervosa(o) 3- Agressiva(o)");
				fp = leia.nextInt();
			}
			
			if(fp==1)
			{
				contPc++;
			}
			
			if(genero==2 && fp==2)
			{
				contMn++;
			}
			
			if(genero==1 && fp==3)
			{
				contHa++;
			}
			
			if(genero==3 && fp==1)
			{
				contNbc++;
			}
			
			if(fp==2 && idade>40)
			{
				contPn40++;
			}
			
			if(fp==1 && idade<18)
			{
				contPc18++;
			}
			pessoas++;
		}
		
		System.out.println("\nPessoas calmas(os): "+contPc);
		System.out.println("\nMulheres nervosas: "+contMn);
		System.out.println("\nHomens agressivos: "+contHa);
		System.out.println("\nNão binário calmes: "+contNbc);
		System.out.println("\nPessoas nervosas com mais de 40 anos: "+contPn40);
		System.out.println("\nPessoas calmas com menos de 18 anos: "+contPc18);

	}

}
