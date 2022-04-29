package comandosIfElse;

import java.util.Scanner;

public class ExemploIfElseCumprimentos2 {

	public static void main(String[] args) {

		Scanner pdc = new Scanner(System.in);

		System.out.println("Informe a hora, no formato de 24h :  ");
		int horas = pdc.nextInt();

		String horaFormato = getHora(horas);
		System.out.println(horaFormato);

		////////////////////////////////////////////

		// int horasSt = getHoras(horas);
		// System.out.printf("São %d"+ horas + " horas");
//		System.out.printf("Foram inseridos " + listaPessoa.size() + "  registros. ");
		System.out.printf("São " + horas + "  horas. ");

//		int idade = pdc.nextInt();
		// String idadeSt = getIdade(idade);
		// System.out.println(idadeSt);

		pdc.close();

	}

	private static String getHora(int horas) {
		// TODO Auto-generated method stub
		// return null;

		if (horas >= 0 && horas <= 12) {
			return "Bom dia.";
		} else if (horas > 12 && horas <= 18) {
			return "Boa tarde.";
		} else {
			return "4";
		}

	}

	/*
	 * public static String getIdade(int idade) { // TODO Auto-generated method stub
	 * 
	 * if (idade >= 0 && idade <= 5) { return "Voce é um bebe"; } else if (idade >=
	 * 6 && idade < 10) { return "2"; } else if (idade >= 11 && idade <= 18) {
	 * return "3"; } else { return "4"; }
	 * 
	 */
}
//}