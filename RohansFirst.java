package example1;

public class RohansFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var len = args.length;
		
		for(var i = -1; i < len; i++) {
			System.out.println("Number of arguements = " + i);
			if (i >= 2) {
				System.out.println("Where is the food? " + args[0] + " " + args[1] + " " + args[2]);
			} else if (i >= 1) {
				System.out.println("Where is the food? " + args[0] + " " + args[1]);
			} else if (i >= 0) {
				System.out.println("Where is the food? " + args[0]);
			} else if (i >= -1){
				System.out.println("You didn't give me any arguements!");
			}
			
			}
		}
	
	}

