package br.com.fatec.CalculoValor;

import br.com.fatec.Veiculo.Carga;
import br.com.fatec.Veiculo.Passeio;
import br.com.fatec.Veiculo.Transporte;
import br.com.fatec.Veiculo.Veiculo;

public class ValorDia implements CalcularConta {

	private static double dia=86400000;
	
	public static double getDia()
	{
		return dia;
	}

	@Override
	public double valorConta(long periodo, Veiculo veiculo, double taxa) {
		// TODO Auto-generated method stub
		if(veiculo instanceof Passeio)
			return 20*Math.ceil(periodo/dia);
		else if( veiculo instanceof Transporte)
			return 25.0*Math.ceil(periodo/dia);
		else {
			Carga carga=(Carga)veiculo;
			return 35.0*Math.ceil(periodo/dia)*carga.getQuantEixo()+taxa;
		}
			
		
	
	}

}
