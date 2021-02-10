package classe;

public class Data {

		int dia;
		int mes;
		int ano;
		
//		String dataFormada() {
//		    return dia + "/" + mes + "/" + ano;
//		}
		
		Data (){
			// Posso definir esse valores padrão mas posso modificar na instância
			// Também posso definir os valor dessa forma:
			// dia = 10;
			// mes = 5;
			// ano = 2020;
			// Usando this como um método:
			this (10, 5, 2020);
			// Significa que estou chamando um construtor através de outro
		}		
		// Criando atributos da instância com o construtor
//		Data (int diaInicial, int mesInicial, int anoInicial){
//			dia = diaInicial;
//			mes = mesInicial;
//			ano = anoInicial;
//		}
		// Usando this para acessar os atributos da instância
		// Para diferenciar o que é parâmetro e o que é váriavel de instância
		// pois ambos tem o mesmo nome
		Data (int dia, int mes, int ano){
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
		// Esses métodos também pertencem a instância, porque os atributos
		// são da instância
		String dataFormatada() {
			// String.format para formatar int em string.
			return String.format("%d/%d/%d.",dia, mes, ano);			 
		}
		
		void imprimirDataFormatada() {
			System.out.printf("%d/%d/%d.\n",dia, mes, ano);
		}
}
