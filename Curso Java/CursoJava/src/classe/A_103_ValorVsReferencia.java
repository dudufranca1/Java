package classe;

public class A_103_ValorVsReferencia {
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribuição por valor (Tipo primitivos).
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(20, 5, 2020);
		Data d2 = d1; // atribuição por referência (Objetos).
		
		d1.dia = 21;
		d1.mes = 6;
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		dataPadrao(d1);
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		// Com o método criado foi gerada uma cópia na memória, então aqui não vai atribuir o valor ++
		// porque são diferentes
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	
	// Criando método atribuindo parâmetro
	static void dataPadrao (Data d) {
		d.dia = 21;
		d.mes = 5;
		d.ano = 2020;
	}
	
	// Passar um primitivo como parâmetro para um método 
	static void alterarPrimitivo(int a) {
		a++;
	}
}
