package br.com.fatec.CalculoValor;

import br.com.fatec.Veiculo.Veiculo;

public interface CalcularConta {
	public double valorConta(long periodo, Veiculo veiculo, double taxa);
}
