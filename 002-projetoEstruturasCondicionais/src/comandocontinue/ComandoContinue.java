package comandocontinue;
/**
 * 
 * @author wagne
 * Ele ir� imprimir os multiplos de 5.
 */

import java.util.Scanner;
public class ComandoContinue {

	public static void main(String[] args) {

		for (int contador = 1; contador < 100; contador++) {
			// System.out.println("Essa � a repeti��o numero: " + contador);
			if (contador % 5 != 0)
				continue;
			System.out.println("Contador: " + contador);

		}

	}

}
