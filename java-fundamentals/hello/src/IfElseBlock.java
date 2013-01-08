
public class IfElseBlock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if  (args.length != 0 ) {
			int i = 0;
			System.out.println("Found args");
			while (i < args.length) {
				System.out.println("Hello " + args[i]);
				i++;
			}
		} else {
			//catch block
			System.out.println("Args not specified");
		}	
		
		for (String name : args) {
			System.out.println("Hello " + name);

			
		}
	}
	


}
