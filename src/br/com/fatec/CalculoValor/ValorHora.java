package br.com.fatec.CalculoValor;

import br.com.fatec.Veiculo.Carga;
import br.com.fatec.Veiculo.Passeio;
import br.com.fatec.Veiculo.Transporte;
import br.com.fatec.Veiculo.Veiculo;

public class ValorHora implements CalcularConta {

	private static  double hora= 3600000; 
	
	public static double getHora()
	{
		return hora;
	}
	@Override
	public double valorConta(long periodo, Veiculo veiculo, double taxa) {
		// TODO Auto-generated method stub
		
		if(veiculo instanceof Passeio)
			return 2.0*Math.ceil(periodo/hora);
		else if( veiculo instanceof Transporte)
			return 3.0*Math.ceil(periodo/hora);
		else {
			Carga carga=(Carga)veiculo;
			return 4.0*Math.ceil(periodo/hora)*carga.getQuantEixo()+taxa;
		}
			
			
	}

}
