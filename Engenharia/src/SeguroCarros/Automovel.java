package SeguroCarros;

public class Automovel {

	private String veiculo;
	private double valor;
	private int tipoCombustivel; //(flex; gasolina; �lcool ou g�s) 
	private int anoFabrica��o;
	private int anoModelo;
	private int kitGas;
	private int quilometragem;
	private String placa;
	private String chassi; 
	private String localizador;
	
	public String getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(int tipoCombustivel) {
		
		this.tipoCombustivel = tipoCombustivel;
	}
	public int getAnoFabrica��o() {
		return anoFabrica��o;
	}
	public void setAnoFabrica��o(int anoFabrica��o) {
		this.anoFabrica��o = anoFabrica��o;
	}
	public int getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}
	public int getKitGas() {
		return kitGas;
	}
	public void setKitGas(int kitGas) {
		this.kitGas = kitGas;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String isLocalizador() {
		return localizador;
	}
	public void setLocalizador(String localizador) {
		this.localizador = localizador;
	}
	public int getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}

}
