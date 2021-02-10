package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data(28, 05, 1998);
		
		Data d2 = new Data();
		d2.dia = 01;
		d2.mes = 07;
		d2.ano = 2021;
		
		// String dataFormatada1 = d1.obterDataFormada;
		// System.out.println(dataFormatada1);
		
		System.out.println("Meu aniversário é na data: "+d1.dataFormatada());
		System.out.println("Eu vou me formar na data: "+d2.dataFormatada());
				
		// Estou chamando o método que criei com void
		// apenas usando uma string.
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
	}
}
