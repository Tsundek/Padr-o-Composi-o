package br.com.fatec.Veiculo;

import br.com.fatec.CalculoValor.CalcularConta;
import br.com.fatec.CalculoValor.ValorDia;
import br.com.fatec.CalculoValor.ValorHora;
import br.com.fatec.CalculoValor.ValorMensal;

public abstract class Veiculo
{
	
	public CalcularConta calculoPeriodoVeiculo(CalcularConta c, long periodo) {
		if(periodo<12*ValorHora.getHora())
			c= new ValorHora();
		else if(periodo<15*ValorDia.getDia())
			c= new ValorDia();
		else
			c= new ValorMensal();
		return c;
	}
}
