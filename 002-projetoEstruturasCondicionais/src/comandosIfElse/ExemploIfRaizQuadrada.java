package comandosIfElse;

import java.util.Scanner;

/**
 * 
 * @author wagne
 *
 */
public class ExemploIfRaizQuadrada {

	public static void main(String[] args) {
		double delta;
		double raizdelta;
		double x1, x2;

		Scanner pdc = new Scanner(System.in);

		System.out.println("Informe o valor de a :  ");
		double a = pdc.nextDouble();
		System.out.println("Informe o valor de b :  ");
		double b = pdc.nextDouble();
		System.out.println("Informe o valor de c :  ");
		double c = pdc.nextDouble();
		delta = b * b - 4 * a * c;
		// raizdelta = sqrt(raiz);
		String deltaFormato = getDelta(delta);
		System.out.println(delta);
	
		
		//pdc.close();
	}

	

	private static String getDelta(double delta) {
		// TODO Auto-generated method stub
		// return null;
		//double delta = b * b - 4 * a * c;
		if (delta < 0) {
			return "A equa��o n�o possui ra�zes reais";
		//	System.out.println(delta);
		} else if (delta == 0) {
			return "A equa��o possui apeas uma raiz reaal.";
		} else {
			return "A equa��o  possui duas ra�zes reais";

			// }

		}

	}

}
