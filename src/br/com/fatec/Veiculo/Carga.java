package br.com.fatec.Veiculo;

public class Carga extends Veiculo {

	private double valorCarga;
	private int quantEixo;
	
	public int getQuantEixo() {
		return quantEixo;
	}
	
	public double getValorCarga() {
		return valorCarga;
	}
	
	public Carga(int quantEixo, double valorCarga) {
		// TODO Auto-generated constructor stub
		super();
		this.quantEixo=quantEixo;
		this.valorCarga=valorCarga;
	}
}
