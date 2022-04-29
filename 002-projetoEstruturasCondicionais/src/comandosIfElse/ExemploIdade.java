package comandosIfElse;

import java.util.Scanner;

public class ExemploIdade {

	public static void main(String[] args) {

		Scanner pdc = new Scanner(System.in);

		System.out.println("Informe a sua idade:  ");
		int idade = pdc.nextInt();
		String idadeSt = getIdade(idade);
		System.out.println(idadeSt);

//		pdc.close();

	}

	public static String getIdade(int idade) {
		// TODO Auto-generated method stub

		if (idade >= 0 && idade <= 5) {
			return "Voce é um bebe";
		} else if (idade >= 6 && idade < 10) {
			return "2";
		} else if (idade >= 11 && idade <= 18) {
			return "3";
		} else {
			return "4";
		}
	}
}