package operadores;
/**
 * 
 * @author wagne
 *
 */
public class Operadores {

	public static void main(String[] args) {
		operadoresRelacionais();
		operadoresIncementoDecremento();
		operadoresAritmeticos();
		operadoresAtribuicao();
		//raizQuadrada();

	}

//*********************************************************************************//
	private static void operadoresRelacionais() {
		System.out.println("*****      Operacoes Relacionais   *****\n");

		int num1 = 10;
		int num2 = 10;

		boolean isMaior = num1 > num2;
		System.out.println("isMaior: " + isMaior);

		boolean isIgual = num1 == num2;
		System.out.println("isIgual: " + isIgual);

		boolean isDiferente = num1 != num2;
		System.out.println("isDiferente: " + isDiferente);

		boolean isMaiorIgual = num1 >= num2;
		System.out.println("isMaiorIgual: " + isMaiorIgual);
		// 1 .... 10 ---Logica AND
		boolean isDentro10 = num1 >= 0;
		System.out.println("isDentro10: " + isDentro10);

		boolean isDentroDe10 = num1 >= 1 && num1 <= 10;
		System.out.println("isDentroDe10: " + isDentroDe10);

		boolean isDentroDe102 = num1 >= 1 && num1 <= 9;
		System.out.println("isDentroDe102: " + isDentroDe102);

		// 1 .... 10 ---Logica AND

		boolean isDentroDe104 = num1 >= 1 || num1 <= 9;
		System.out.println("isDentroDe104: " + isDentroDe104);

	}

	// *********************************************************************************//
	private static void operadoresIncementoDecremento() {
		System.out.println("***** Operacoes de Incemento e Decremento *****\n");

		int num1 = 10;
		int num2 = 100;

		System.out.println(num1);
		num1++;
		System.out.println(num1);
		// Print
		System.out.println(num2);
		num2--;
		num2--;
		System.out.println(num2);
	}

	// *********************************************************************************//
	private static void operadoresAritmeticos() {
		System.out.println("***** Operadores Aritmeticos *****\n");

		int num1 = 10;
		int num2 = 20;

		int num3 = num1 + num2;
		int num4 = num1 - num2;
		int num5 = num1 / num2;
		int num6 = num1 * num2;
		int num7 = num1 + num2;
		// Print

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);

	}

	// *********************************************************************************//
	private static void operadoresAtribuicao() {
		System.out.println("***** Operadores de Atribuicao  *****\n");

		int numero1 = 10;
		int numero2 = 10;
		int numero3 = numero1 + numero2;

		System.out.println(numero3);
		numero3 += numero3;
		System.out.println(numero3);

	}

	private static void raizQuadrada() {
		System.out.println("***** Operadores de Atribuicao  *****\n");

		int num1 = 2;
		double a = Math.sqrt(num1);

		System.out.println(a);

	}

}
