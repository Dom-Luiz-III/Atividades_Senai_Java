package elementos;

import util.QuartoUtil;

public class Quarto {
	private Integer qtd_hospede;
	private Double valor_quarto;
	private Hospede[] hospedes;
	
	public Quarto(Integer qtd_hospede) {
		this.qtd_hospede = qtd_hospede;
		this.valor_quarto = QuartoUtil.valor_locacao + QuartoUtil.valor_pessoa * qtd_hospede;
		this.hospedes = new Hospede[qtd_hospede];
	}

	public Integer getQtd_hospede() {
		return qtd_hospede;
	}

	public void setQtd_hospede(Integer qtd_hospede) {
		this.qtd_hospede = qtd_hospede;
	}

	public Double getValor_quarto() {
		return valor_quarto;
	}

	public Hospede[] getHospedes() {
		return hospedes;
	}

	public void CadastrarHospedes(String nome,Integer idade,String telefone, Integer posicao) {
		this.hospedes[posicao] = new Hospede(nome,idade,telefone);
	}
	
	public String toString() {
		return "Hospede 1: " + this.hospedes[0].getNome();
	}
}
