package SeguroCarros;

public class Proprietario {

	private String nome;// do condutor principal
	private String sexo;// do condutor principal
	private String nascimento;// do condutor principal
	private String estadoCivil;// do condutor principal
	private String cpf;// do condutor principal
	private int tempoDeHabilitação;// em anos do condutor principal
	private String atividade;
	private int assaltos; //Nos últimos 24 meses quantas vezes o condutor principal foi vitima de assalto/furto do veíuclo? 
	
	private int dependente;
	
	private int idadeFilhoNovo;
	private String sexoFilhoNovo;
	
	private int residentes;
	private String sexoResidente;
	private int idadeResidente;
	private int veiculoResidente;
	
	private int otherCondutores;
	private int otherMaisJovem;
	private int other25Anos;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getTempoDeHabilitação() {
		return tempoDeHabilitação;
	}
	public void setTempoDeHabilitação(int tempoDeHabilitação) {
		this.tempoDeHabilitação = tempoDeHabilitação;
	}
	public String getAtividade() {
		return atividade;
	}
	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}
	public int getAssaltos() {
		return assaltos;
	}
	public void setAssaltos(int assaltos) {
		this.assaltos = assaltos;
	}
	public int getIdadeFilhoNovo() {
		return idadeFilhoNovo;
	}
	public void setIdadeFilhoNovo(int idadeFilhoNovo) {
		this.idadeFilhoNovo = idadeFilhoNovo;
	}
	public String getSexoFilhoNovo() {
		return sexoFilhoNovo;
	}
	public void setSexoFilhoNovo(String sexoFilhoNovo) {
		this.sexoFilhoNovo = sexoFilhoNovo;
	}
	public int getResidentes() {
		return residentes;
	}
	public void setResidentes(int residentes) {
		this.residentes = residentes;
	}
	public String getSexoResidente() {
		return sexoResidente;
	}
	public void setSexoResidente(String sexoResidente) {
		this.sexoResidente = sexoResidente;
	}
	public int getIdadeResidente() {
		return idadeResidente;
	}
	public void setIdadeResidente(int idadeResidente) {
		this.idadeResidente = idadeResidente;
	}

	public int getDependente() {
		return dependente;
	}
	public void setDependente(int dependente) {
		this.dependente = dependente;
	}
	public int getVeiculoResidente() {
		return veiculoResidente;
	}
	public void setVeiculoResidente(int veiculoResidente) {
		this.veiculoResidente = veiculoResidente;
	}
	public int getOtherCondutores() {
		return otherCondutores;
	}
	public void setOtherCondutores(int otherCondutores) {
		this.otherCondutores = otherCondutores;
	}
	public int getOtherMaisJovem() {
		return otherMaisJovem;
	}
	public void setOtherMaisJovem(int otherMaisJovem) {
		this.otherMaisJovem = otherMaisJovem;
	}
	public int getOther25Anos() {
		return other25Anos;
	}
	public void setOther25Anos(int other25Anos) {
		this.other25Anos = other25Anos;
	}

}
