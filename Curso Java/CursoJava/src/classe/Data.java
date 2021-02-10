package classe;

public class Data {

		int dia;
		int mes;
		int ano;
		
//		String dataFormada() {
//		    return dia + "/" + mes + "/" + ano;
//		}
		
		Data (){
			// Posso definir esse valores padr�o mas posso modificar na inst�ncia
			// Tamb�m posso definir os valor dessa forma:
			// dia = 10;
			// mes = 5;
			// ano = 2020;
			// Usando this como um m�todo:
			this (10, 5, 2020);
			// Significa que estou chamando um construtor atrav�s de outro
		}		
		// Criando atributos da inst�ncia com o construtor
//		Data (int diaInicial, int mesInicial, int anoInicial){
//			dia = diaInicial;
//			mes = mesInicial;
//			ano = anoInicial;
//		}
		// Usando this para acessar os atributos da inst�ncia
		// Para diferenciar o que � par�metro e o que � v�riavel de inst�ncia
		// pois ambos tem o mesmo nome
		Data (int dia, int mes, int ano){
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
		// Esses m�todos tamb�m pertencem a inst�ncia, porque os atributos
		// s�o da inst�ncia
		String dataFormatada() {
			// String.format para formatar int em string.
			return String.format("%d/%d/%d.",dia, mes, ano);			 
		}
		
		void imprimirDataFormatada() {
			System.out.printf("%d/%d/%d.\n",dia, mes, ano);
		}
}
