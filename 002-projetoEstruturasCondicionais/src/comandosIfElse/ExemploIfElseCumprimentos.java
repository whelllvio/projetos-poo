package comandosIfElse;

import java.util.Scanner;
/**
 * 
 * @author wagne
 *
 */
public class ExemploIfElseCumprimentos {

	public static void main(String[] args) {

		Scanner pdc = new Scanner(System.in);

		System.out.println("Informe a hora, no formato de 24h :  ");
		int horas = pdc.nextInt();

		String horaFormato = getHora(horas);
		System.out.println(horaFormato);

		pdc.close();

	}

	private static String getHora(int horas) {
		// TODO Auto-generated method stub
		// return null;

		if (horas >= 0 && horas < 12) {
			return "Bom dia.";
		} else if (horas >= 12 && horas <= 18) {
			return "Boa tarde.";
		} else {
			return "Boa noite.";
		}

	}

}
