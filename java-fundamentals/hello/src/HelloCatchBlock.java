
public class HelloCatchBlock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String name = args[0];
			System.out.println("Hello "+ name);
		} catch (ArrayIndexOutOfBoundsException e) {
			//catch block
			System.out.println("Hello Nobody");
		}		
	}

}
