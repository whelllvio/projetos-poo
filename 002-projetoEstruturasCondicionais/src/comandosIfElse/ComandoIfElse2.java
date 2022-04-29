package comandosIfElse;

/**
 * 
 * @author wagne
 *
 */
public class ComandoIfElse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		if (num >= 5) {
			if (num >= 8) {
				System.out.println("Um");
			} else if (num >= 6) {
				System.out.println("Dois");
			} else {
				System.out.println("Tres");
			}
		}
		///////////////////////////

		else {
			if (num >= 1 && num <= 3) {
				System.out.println("Tres");
			} else {
				System.out.println("Quatro");
			}
		}

		//////////////////////////

	}
}