class DescontoCompra {
	public static void main (String [] args){
		double compra = 800;
		double desconto = 35;
		double total = compra - (compra * desconto / 100 );
		System.out.println("O valor total da compra de R$" + compra + " com desconto de " + desconto + "% e igual a R$" + total);
	}
}