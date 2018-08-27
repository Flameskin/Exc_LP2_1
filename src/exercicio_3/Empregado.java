package exercicio_3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Empregado {
	private String nome; 
	private String sobrenome;
	private double salarioMensal;
	
	public Empregado (String nome, String sobrenome, double salario) {
		this.nome = nome; 
		this.sobrenome = sobrenome; 
		if (salario < 0) {
			this.salarioMensal = 0.0;
		} else {
			this.salarioMensal = salario;
		}
	}
	
	public void exibeAnual() {
		System.out.println("Salario anual de " + this.nome + ": " + (salarioMensal * 12));
	}
	
	public void darAumento(double porcent) {
		this.salarioMensal = salarioMensal + (salarioMensal * (porcent / 100));
	}

	@Override
	public String toString() {
		return "Empregado [Nome= " + nome + " " + sobrenome + ", Salario Mensal= " + salarioMensal + "]";
	}
	
}
