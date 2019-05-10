package SeguroCarros;

public class Estacionamento {
	
	private int garagem;
	/*	Veiculo fica em garagem na residência ?
	Sim, de um apartamento
	Sim, de uma casa
	Sim, de um condomínio fechado
	Não, mas fica em estacionamento
	Não*/
	private int garagemTrabalho;
	private String cepResidencia;
	private String cepTrabalho;
	
	private int localEstudo;
	/*
	Informe CEP onde o veiculo passa a noite

	O veiculo fica em garagem no trabalho?
		Caso a resposta tem sido sim, informe o CEP do trabalho

•	O veiculo fica em garagem no loção de estudo?
o	Sim
o	Não
o	Não utilizo para estudo
o	Os condutores não estudam
*/

	public int getGaragem() {
		return garagem;
	}

	public void setGaragem(int garagem) {
		this.garagem = garagem;
	}

	public String getCepResidencia() {
		return cepResidencia;
	}

	public void setCepResidencia(String cepResidencia) {
		this.cepResidencia = cepResidencia;
	}

	public String getCepTrabalho() {
		return cepTrabalho;
	}

	public void setCepTrabalho(String cepTrabalho) {
		this.cepTrabalho = cepTrabalho;
	}

	public int getLocalEstudo() {
		return localEstudo;
	}

	public void setLocalEstudo(int localEstudo) {
		this.localEstudo = localEstudo;
	}

	public int getGaragemTrabalho() {
		return garagemTrabalho;
	}

	public void setGaragemTrabalho(int garagemTrabalho) {
		this.garagemTrabalho = garagemTrabalho;
	}
	

}
