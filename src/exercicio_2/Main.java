package exercicio_2;

public class Main {

	public static void main(String[] args) {
		Invoice t = new Invoice(0, "Batata", 5, 3.55);
		
		System.out.println("Código: " + t.getItemFaturado() + "\n" + "Produto: " + t.getDescricao() + "\n" +
				"Quantidade: " + t.getQuantidade() + "\n" + "Valor Unitário: " + t.getPrecoUnit() + "\n" + 
				"Valor total da fatura: " + t.getInvoiceAmount());
	}

}
