package Fundamentos;

public class A_22_NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhora"); //troca
		s = s.toUpperCase(); //escreve com letra maiúscula;
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String y = "Bom dia X"
				.replace("X", "Du")
				.toUpperCase()
				.concat("!!!");
		
		System.out.println(y);
	}
}
