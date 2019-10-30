package br.com.fatec.CalculoValor;

import br.com.fatec.Veiculo.Carga;
import br.com.fatec.Veiculo.Passeio;
import br.com.fatec.Veiculo.Transporte;
import br.com.fatec.Veiculo.Veiculo;

public class ValorMensal implements CalcularConta {

	private double mes=2592E6;
	@Override
	public double valorConta(long periodo, Veiculo veiculo, double taxa) {
		// TODO Auto-generated method stub
		if(veiculo instanceof Passeio)
			return 100.0*Math.ceil(periodo/mes);
		else if( veiculo instanceof Transporte)
			return 150.0*Math.ceil(periodo/mes);
		else {
			Carga carga=(Carga)veiculo;
			return 200.0*Math.ceil(periodo/mes)*carga.getQuantEixo()+taxa;
		}
			
			
	}

}
