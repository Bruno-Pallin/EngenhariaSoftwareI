package SeguroCarros;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Bem Vindo a Cristineland Company Seeguros");
		
		Proprietario proprietario = new Proprietario();
		JOptionPane.showMessageDialog(null, "Insira os dados do Propietário");
		proprietario.setNome(JOptionPane.showInputDialog("Insira o nome do propietário"));
		
		while (proprietario.getSexo() != "M" || proprietario.getSexo() != "F") {	
			proprietario.setSexo(JOptionPane.showInputDialog("Insira M para Masculino e F para Feminino"));
		}
		
		proprietario.setNascimento(JOptionPane.showInputDialog("Insira a data de nascimento no formato 00/00/0000"));
		proprietario.setEstadoCivil(JOptionPane.showInputDialog("Insira o estado civil"));
		proprietario.setCpf(JOptionPane.showInputDialog("Insira o cpf"));
		proprietario.setTempoDeHabilitação(Integer.parseInt(JOptionPane.showInputDialog("Insira o tempo de habilitação em anos")));
		proprietario.setAtividade(JOptionPane.showInputDialog("Insira a atividade  do condutor principal"));
		proprietario.setAssaltos(Integer.parseInt(JOptionPane.showInputDialog("Insira o numero de assaltos que voce sofreu nos ultimos 2 anos")));
		
		
		
		Automovel automovel = new Automovel();
		JOptionPane.showMessageDialog(null, "Insira os dados do Automovel");
		
		automovel.setVeiculo(JOptionPane.showInputDialog("Insira o veiculo"));
		automovel.setValor(Double.parseDouble(JOptionPane.showInputDialog("Insira o valor")));
		
		while (automovel.getTipoCombustivel() < 0 || automovel.getTipoCombustivel() > 4  ) {
			automovel.setTipoCombustivel(Integer.parseInt(JOptionPane.showInputDialog("Digite: \n 1- Flex \n 2- Gasolina \n 3- Alcool \n 4 - Gás"))); 
			
		}
		
		automovel.setAnoFabricação(Integer.parseInt(JOptionPane.showInputDialog("Insira o ano de fabricação")));
		automovel.setAnoModelo(Integer.parseInt(JOptionPane.showInputDialog("Insira o ano do modelo")));
		
		while(automovel.getKitGas() < 0 || automovel.getKitGas() > 1) {
			automovel.setKitGas(Integer.parseInt(JOptionPane.showInputDialog("O veiculo possui Kit Gás? \n 1 - SIM \n 0 - NÃO")));			
		}
		
		automovel.setPlaca(JOptionPane.showInputDialog("Insira a placa do veiculo"));
		automovel.setChassi(JOptionPane.showInputDialog("Insira o veiculo")); 
		automovel.setLocalizador(JOptionPane.showInputDialog("Insira o localizador"));
		
		//dependentes

		

		while(proprietario.getDependente() < 0 || proprietario.getDependente() > 1) {
			proprietario.setDependente(Integer.parseInt(JOptionPane.showInputDialog("O condutor principal possui filhos entre 17 a 25 anos.  \n 1 - SIM \n 2 - NÃO")));
		}		

		if (proprietario.getDependente() == 1) {
			
			proprietario.setIdadeFilhoNovo(Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do filho mais novo?")));
			while(proprietario.getSexoFilhoNovo() != "M" || proprietario.getSexoFilhoNovo() != "F") {
				proprietario.setSexoFilhoNovo(JOptionPane.showInputDialog("Qual o sexo do filho mais novo?\n M - Masculino \n F - Feminino"));
			}		

		}
		
		while (proprietario.getResidentes() < 0 || proprietario.getResidentes() > 3) {		
			proprietario.setResidentes(Integer.parseInt(JOptionPane.showInputDialog("O condutor principal possui residentes entre 17 e 25 anos? Escolha uma das opções  \n 1 - Sim, mas não conduzem o veículo \n 2 - Sim (maiores de 18 anos) e conduzem o veículo até 1 dia da semana \n 3 - Sim e o mais velho possui 17 anos no momento da contratação do seguro \n 0 - Não")));
		}
		if (proprietario.getResidentes() == 1) {

			while(proprietario.getSexoResidente() != "M" || proprietario.getSexoResidente() != "F") {
				proprietario.setSexoResidente(JOptionPane.showInputDialog("Qual o sexo do residente mais novo? \n M - Masculino \n F - Feminino"));
			}		
			while (proprietario.getIdadeResidente() < 1 || proprietario.getIdadeResidente() > 2) {				
				proprietario.setIdadeResidente(Integer.parseInt(JOptionPane.showInputDialog("Qual a faixa etaria do residente mais novo? \n 1 - 17 a 21 anos \n 2 - 22 a 25 anos")));
			}
		
			
		}else if (proprietario.getDependente() == 2) {
			
			while (proprietario.getVeiculoResidente() < 1 || proprietario.getVeiculoResidente() > 3) {				
				proprietario.setVeiculoResidente(Integer.parseInt(JOptionPane.showInputDialog("Algum desses residentes (maior de 18 anos) é proprietário de veículo? \n 1 - Sim \n 2 - Não \n 3 - Alguns sim e outros não")));
			}
			
			while(proprietario.getSexoResidente() != "M" || proprietario.getSexoResidente() != "F") {
				proprietario.setSexoResidente(JOptionPane.showInputDialog("Qual o sexo do residente mais novo? \n M - Masculino \n F - Feminino"));
			}	
			while (proprietario.getIdadeResidente() < 1 || proprietario.getIdadeResidente() > 2) {		
				proprietario.setIdadeResidente(Integer.parseInt(JOptionPane.showInputDialog("Qual a faixa etaria do residente mais novo? \n 1 - 17 a 21 anos \n 2 - 22 a 25 anos")));
			}

		}else if (proprietario.getDependente() == 3) {

			while(proprietario.getSexoResidente() != "M" || proprietario.getSexoResidente() != "F") {
				proprietario.setSexoResidente(JOptionPane.showInputDialog("Qual o sexo do residente mais novo? \n M - Masculino \n F - Feminino"));
			}	
			
		}
		
		while (proprietario.getOtherCondutores() < 0 || proprietario.getOtherCondutores() > 1) {	
			proprietario.setOtherCondutores(Integer.parseInt(JOptionPane.showInputDialog("Deseja cobertura para outros condutores? \n 1 - Sim \n 0 - Não")));
		}
		
		if (proprietario.getOtherCondutores() == 1) {
			while (proprietario.getOtherMaisJovem() < 0 || proprietario.getOtherMaisJovem() > 1) {				
				proprietario.setOtherMaisJovem(Integer.parseInt(JOptionPane.showInputDialog("Algum destes outros condutores é mais jovem que o condutor principal? \n 1 - Sim \n 0 - Não")));
			}
			
		}else if (proprietario.getOtherCondutores() == 2) {
			while (proprietario.getOther25Anos() < 0 || proprietario.getOther25Anos() > 1) {				
				proprietario.setOther25Anos(Integer.parseInt(JOptionPane.showInputDialog("Algum destes outros condutores tem até 25 anos de idade? \n 1 - Sim \n 0 - Não")));			
			}
			
		}

		Estacionamento estacionamento = new Estacionamento();
		
		while (estacionamento.getGaragem() < 0 || estacionamento.getGaragem() > 4) {
		
			estacionamento.setGaragem(Integer.parseInt(JOptionPane.showInputDialog("Veiculo fica em garagem na residência ? \n 1 - Sim, de um apartamento \n" + 
					"2 - Sim, de uma casa\n" + 
					"3 - Sim, de um condomínio fechado\n" + 
					"4 - Não, mas fica em estacionamento\n" + 
					"0 - Não\n" + 
					"")));
		}
		estacionamento.setCepResidencia(JOptionPane.showInputDialog("Informe CEP onde o veiculo passa a noite")); 

		while (estacionamento.getGaragemTrabalho() < 0 || estacionamento.getGaragemTrabalho() > 1) {			
			estacionamento.setGaragemTrabalho(Integer.parseInt(JOptionPane.showInputDialog("O veiculo fica em garagem no trabalho? \n 1 - Sim \n 0 - Não")));			
		}

		if (estacionamento.getGaragemTrabalho() == 1) {

			estacionamento.setCepTrabalho(JOptionPane.showInputDialog("Informe CEP do local da garagem no trabalho")); 	
			
		}

		while (estacionamento.getLocalEstudo() < 0 || estacionamento.getLocalEstudo() > 3) {			
			estacionamento.setLocalEstudo(Integer.parseInt(JOptionPane.showInputDialog("O veiculo fica em garagem no loção de estudo? \n 1 - Sim  \n 2 - Não utilizo para estudo \n 3 - Os condutores não estudam \n 0 - Não")));			
		}

		automovel.setQuilometragem(Integer.parseInt(JOptionPane.showInputDialog("Quantos quilômetros o veículo circula por dia?")));
		


		double seguroMin, seguroMax;

		seguroMin = automovel.getValor() * 0.03;
		seguroMax = automovel.getValor() * 0.05;
		
		
		if (proprietario.getDependente() == 1 && proprietario.getIdadeFilhoNovo() < 25 && proprietario.getSexoFilhoNovo() == "M") {
			seguroMin = seguroMin + seguroMin * 0.0003;
			seguroMax = seguroMax + seguroMax * 0.0003;
		}
		
		if (proprietario.getResidentes() == 1 && proprietario.getSexoResidente() == "M") {
			seguroMin = seguroMin + seguroMin * 0.0003;
			seguroMax = seguroMax + seguroMax * 0.0003;
		}
		
		if (proprietario.getDependente() == 1 && proprietario.getIdadeFilhoNovo() < 25 && proprietario.getSexoFilhoNovo() == "F") {
			seguroMin = seguroMin + seguroMin * 0.00015;
			seguroMax = seguroMax + seguroMax * 0.00015;
		}
		
		if (proprietario.getResidentes() == 1 && proprietario.getSexoResidente() == "F") {
			seguroMin = seguroMin + seguroMin * 0.00015;
			seguroMax = seguroMax + seguroMax * 0.00015;
		}
		
		if (estacionamento.getGaragem() == 0) {
			seguroMin = seguroMin + seguroMin * 0.00010;
			seguroMax = seguroMax + seguroMax * 0.00010;
		}
		if (estacionamento.getGaragemTrabalho() == 0) {
			seguroMin = seguroMin + seguroMin * 0.00010;
			seguroMax = seguroMax + seguroMax * 0.00010;
		}
		if (estacionamento.getLocalEstudo() == 0) {
			seguroMin = seguroMin + seguroMin * 0.00010;
			seguroMax = seguroMax + seguroMax * 0.00010;
		}

		JOptionPane.showInputDialog("O Seguro fica entre R$ " +  String.format("%.2f", (double)seguroMin) + " e R$ " + String.format("%.2f", (double)seguroMax) + ". \n Escolha a forma de Pagamento: \n 1- A vista \n 2 A prazo" );
		
	}

}
