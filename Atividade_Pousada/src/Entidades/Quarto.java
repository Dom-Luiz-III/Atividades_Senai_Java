package Entidades;

import Util.QuartoUtil;

public class Quarto {
	private Integer qtd_hospede;
	private Double valor_quarto;
	private Hospede[] hospedes;
	
	public Quarto(Integer qtd_hospede) {
		this.qtd_hospede = qtd_hospede;
		this.valor_quarto =  QuartoUtil.valor_locacao 
				+ QuartoUtil.valor_pessoa 
				* qtd_hospede;
		this.hospedes = new Hospede[qtd_hospede];
	}

	public Integer getQtd_hospede() {
		return qtd_hospede;
	}

	public void setQtd_hospede(Integer qtd_hospede) {
		if(qtd_hospede > 0) {
			this.qtd_hospede = qtd_hospede;
		}
		
	}

	public Double getValor_quarto() {
		return valor_quarto;
	}

	public Hospede[] getHospedes() {
		return hospedes;
	}

	public void cadastrarHospede(String nome, Integer idade, String telefone, Integer posicao) {
		this.hospedes[posicao] = new Hospede(nome, idade, telefone);
	}
	
	public String toString() {
		return "";
	}
	
	public static int verificarQuartoVazio(Quarto[] quartos){
		//Retorna o indice do próximo quarto vazio. Retorna -1 caso nenhuma quarto esteja vago.
		for(int i = 0 ; i<10 ; i++) {
			if (quartos[i] == null) {
				return i;
			}
		}
		return -1;
	}
	
}
