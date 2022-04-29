package comandowhile;

import java.util.Scanner;

/**
 * 
 * @author wagne
 *
 */
public class ComandoWhileTabuada {

	public static void main(String args[]) {
		Scanner pdc = new Scanner(System.in);

		System.out.println("Deseja gerar a tabuada de algum numero inteiro? (Responda Sim ou Não) ");
		String resposta = pdc.next();

		while (resposta.equals("Sim")) {
			System.out.println("Digite um numero para gerar a tabuada: ");
			int numero = pdc.nextInt();
			for (int i = 0; i <= 10; i++) {
				System.out.println(numero + "X " + i + " =" + numero);

			}

			System.out.println("Deseja continuar?");
			resposta = pdc.next();

		}
		System.out.println("Obrigado. ");

	}
}
