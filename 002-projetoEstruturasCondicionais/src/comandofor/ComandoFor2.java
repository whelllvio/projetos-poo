package comandofor;
/**
 * 
 * @author wagne
 *
 */
import java.util.Scanner;

public class ComandoFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner pdc = new Scanner(System.in);
		System.out.println("Informe um numero inteiro menor ou igual a 9 ");
		int num = pdc.nextInt();
		int i;
		for (i = 0; i < 10; i++)
			// System.out.println("Linha: " +i);
			System.out.println(num + " X " + i + " =  " + num * i);
	}

}