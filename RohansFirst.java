package example1;

public class RohansFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Number of arguements = " + args.length);
		if (args.length > 2) {
			System.out.println("Where is the food? " + args[0] + " " + args[1] + " " + args[2]);
		} else if (args.length > 1) {
			System.out.println("Where is the food? " + args[0] + " " + args[1]);
		} else if (args.length > 0) {
			System.out.println("Where is the food? " + args[0]);
		} else {
			System.out.println("You didn't give me any arguements!");
		}
	}

}
