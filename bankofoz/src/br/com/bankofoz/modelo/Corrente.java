package br.com.bankofoz.modelo;

public class Corrente extends Conta {

	private double limite;
	private double taxa;
	
	
	public String getResumo() {
		return 
			 "Taxa....: " + taxa + "\n" +
			 "Limite..: " + limite + "\n";
	}
	
	
	public Corrente() {
		super();
	}
	
	public Corrente(int numero, double saldo, Cliente cliente, Agencia agencia, double limite, double taxa) {
		super(numero, saldo, cliente, agencia);
		this.limite = limite;
		this.taxa = taxa;
	}
	
	@Override
	public String toString() {
		return "Corrente [limite=" + limite + ", taxa=" + taxa + "]";
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	
	
}
