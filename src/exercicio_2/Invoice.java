package exercicio_2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Invoice {
	private int itemFaturado;
	private String descricao;
	private int quantidade;
	private double precoUnit;
	
	public Invoice (int faturado, String desc, int quant, double preco) {
		itemFaturado = faturado;
		descricao = desc;
		
		if (quant < 0) {
			quantidade = 0;
		} else {
			quantidade = quant;
		}
		
		if (preco < 0) {
			precoUnit = 0.0;
		} else {
			precoUnit = preco;
		}
	}
	
	public double getInvoiceAmount() {
		return (quantidade * precoUnit);
	}
	
}
