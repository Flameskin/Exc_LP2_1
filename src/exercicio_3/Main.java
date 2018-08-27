package exercicio_3;

public class Main {

	public static void main(String[] args) {
		
		Empregado e = new Empregado("Afonso", "Pereira", 500.00);
		Empregado f = new Empregado("Luisa", "Soares", 700.00);
		
		System.out.println(e);
		
		System.out.println(f);

		e.exibeAnual();
		
		f.exibeAnual();
		
		e.darAumento(10);
		
		f.darAumento(10);
		
		e.exibeAnual();
		
		f.exibeAnual();
		
		
	}

}
