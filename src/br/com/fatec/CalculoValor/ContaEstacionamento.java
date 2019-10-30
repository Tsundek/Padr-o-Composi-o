package br.com.fatec.CalculoValor;

import javax.swing.JOptionPane;

import br.com.fatec.Veiculo.Carga;
import br.com.fatec.Veiculo.Passeio;
import br.com.fatec.Veiculo.Transporte;
import br.com.fatec.Veiculo.Veiculo;

public class ContaEstacionamento {
	private Veiculo veiculo;
	private long inicio, fim;
	private CalcularConta conta;
	private double taxa=0;
	
	
	//Construtor da canta estacionamento
	public ContaEstacionamento(){
		
		
	}
	
	public void adicionarContaVeiculo()
	{
		int reposta, quantEixo;
		double valorCarga;
		try {
			reposta= Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha:\n1 - para veiculo  de carga\n"
					+ "2 - para veiculo de passeio\n3 - para veiculo de transporte: ",
					null,
					JOptionPane.INFORMATION_MESSAGE));
			if(reposta==1) {
				
				valorCarga= Double.parseDouble(JOptionPane.showInputDialog("Quanto custa a carga? "));
				quantEixo= Integer.parseInt(JOptionPane.showInputDialog("Quantas Eixos o veiculo tem? "));
				veiculo= new Carga(quantEixo, valorCarga);
				taxa= valorCarga*0.1;
				
			}
			if(reposta==2) {
				veiculo= new Passeio();
			}
			if(reposta==3) {
				veiculo= new Transporte();
			}
			this.inicio= System.currentTimeMillis();
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Escola alguem!!");
			this.adicionarContaVeiculo();
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Operação Cancelada");
			this.adicionarContaVeiculo();
		}
	}
	public void finalizarContagem()
	{
		fim = System.currentTimeMillis();
		this.MostrarConta();
	}
	//Metodo de chamar a interfate 
	public void MostrarConta(){
		
		try {
		long atual= (fim==0) ? System.currentTimeMillis():fim;
		long periodo= atual- inicio;
		conta= veiculo.calculoPeriodoVeiculo(conta, periodo);
		JOptionPane.showMessageDialog(null, "A conta do estacionamento ficou em, "+conta.valorConta(periodo, veiculo, taxa)+
				" Reais");
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//Metodo de mudar Conta
	public void setConta(CalcularConta conta){
		this.conta= conta;
	} 
}
