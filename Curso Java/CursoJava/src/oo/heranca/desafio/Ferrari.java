package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
	
	private boolean ligarTurbo;
	private boolean ligarAr;
	
	public Ferrari(){
		this(315);
	}
	
	public Ferrari (int velocidadeMaxima){
		super(velocidadeMaxima);
		setDelta(15);
	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if (ligarTurbo && !ligarAr) {
			return 35;
		}
		else if (ligarTurbo && ligarAr) {
			return 30;
		}
		else if (!ligarTurbo && !ligarAr) {
			return 20;
		}
		else {
			return 15;
		}
		
	}
	
	// @Override = serve como efeito de validação para ter 
	// certeza que você está de fato sobrescrevendo um método
	// que existe na classe pai
	//@Override
	//void acelerar() {		
	//	velocidadeAtual += 15;
	//}
	
}
