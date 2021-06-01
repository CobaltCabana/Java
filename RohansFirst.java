package example1;
/**
 * Learning about command line arguments, for loops, and if statements
 * @author rohan
 *
 */
public class RohansFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var len = args.length;

		String s = "";
		for (var i = 0; i < len; i++) {
			// System.out.print("Args[" + i + "] = " + args[i]);
			if (i == (len - 1)) {
				s = s + args[i] + ".";
			} else {
				s = s + args[i] + ", ";
			}
		}
		System.out.println(s);
	}
}
