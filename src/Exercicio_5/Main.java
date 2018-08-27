package Exercicio_5;

public class Main {

	public static void main(String[] args) {
		
		Data teste1 = new Data();
		
		System.out.println("Teste 1: " + teste1);
		
		teste1.avancaDia();
		
		System.out.println("Teste 1: " + teste1);
		
		Data teste2 = new Data(1,2,1998);
		
		System.out.println("Teste 2: " + teste2);
		
		teste2.avancaDia();
		
		System.out.println("Teste 2: " + teste2);
		
		Data teste3 = new Data(31,12,2000);
		
		System.out.println("Teste 3: " + teste3);
		
		teste3.avancaDia();
		
		System.out.println("Teste 3: " + teste3);

		


	}

}
