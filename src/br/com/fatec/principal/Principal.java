package br.com.fatec.principal;

import javax.swing.JOptionPane;

import br.com.fatec.CalculoValor.ContaEstacionamento;
import br.com.fatec.CalculoValor.ValorDia;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaEstacionamento conta= new ContaEstacionamento();
		conta.setConta(new ValorDia());
		String resposta="";
		do {
		
		resposta= JOptionPane.showInputDialog("Digite:\n1 - Adicionar carro"
				+ "\n2 - Mostra Conta atual"
				+ "\n3 - Finalizar Conta"
				+ "\n4 - Sair");
		
		if(resposta.equals("1"))
			conta.adicionarContaVeiculo();
		else if(resposta.equals("2"))
			conta.MostrarConta();
		else if(resposta.equals("3")) {
			conta.finalizarContagem();
			System.exit(0);
		}else if(resposta.equals("4"))
		{
			JOptionPane.showMessageDialog(null, "Obrigado por usar!!!");
		}
		}while((Integer.parseInt(resposta)<4));

	}

}
