package classe;

public class A_103_ValorVsReferencia {
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribui��o por valor (Tipo primitivos).
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(20, 5, 2020);
		Data d2 = d1; // atribui��o por refer�ncia (Objetos).
		
		d1.dia = 21;
		d1.mes = 6;
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		dataPadrao(d1);
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		// Com o m�todo criado foi gerada uma c�pia na mem�ria, ent�o aqui n�o vai atribuir o valor ++
		// porque s�o diferentes
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	
	// Criando m�todo atribuindo par�metro
	static void dataPadrao (Data d) {
		d.dia = 21;
		d.mes = 5;
		d.ano = 2020;
	}
	
	// Passar um primitivo como par�metro para um m�todo 
	static void alterarPrimitivo(int a) {
		a++;
	}
}
