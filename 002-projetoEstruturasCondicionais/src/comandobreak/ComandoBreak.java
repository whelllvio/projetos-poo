package comandobreak;
/**
 * 
 * @author wagne
 *
 */
public class ComandoBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner pdc = new Scanner(System.in);
		// System.out.println("Informe um numero inteiro menor ou igual a 9 ");
		// int num = pdc.nextInt();
		// int i;

		for (int contador = 1; contador < 10; contador++) {
			System.out.println("Essa é a repetição numero: " + contador);
			if (contador == 6) {
				break;
			}

		}

	}

}
