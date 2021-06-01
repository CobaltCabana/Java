package example1;

public class SwitchDemo {
	public static void main(String[] args) {

		if (args.length < 1) {
			System.out.println("Java SwitchDemo did not receive arguments");
			System.out.println("Pass a number between 1 and 12");
			return;
		}
		for (var i = 0; i < args.length; i++) {
			int month = Integer.parseInt(args[i]);
			String monthString;
			switch (month) {
			case 1:
				monthString = "January";
				break;
			case 2:
				monthString = "February";
				break;
			case 3:
				monthString = "March";
				break;
			case 4:
				monthString = "April";
				break;
			case 5:
				monthString = "May";
				break;
			case 6:
				monthString = "June";
				break;
			case 7:
				monthString = "July";
				break;
			case 8:
				monthString = "August";
				break;
			case 9:
				monthString = "September";
				break;
			case 10:
				monthString = "October";
				break;
			case 11:
				monthString = "November";
				break;
			case 12:
				monthString = "December";
				break;
			default:
				monthString = "Invalid month";
				break;
			}
			System.out.println(monthString);
			System.out.println(convertToFrench(monthString));
		}
	}

	public static String convertToFrench(String input) {
		String monthString;
		switch (input.toLowerCase()) {
		case "january":
			monthString = "Janvier";
			break;
		case "february":
			monthString = "Fevrier";
			break;
		case "march":
			monthString = "Mars";
			break;
		case "april":
			monthString = "Avril";
			break;
		case "may":
			monthString = "Mai";
			break;
		case "june":
			monthString = "Juin";
			break;
		case "july":
			monthString = "Juillet";
			break;
		case "august":
			monthString = "Auguste";
			break;
		case "septembre":
			monthString = "Septembre";
			break;
		case "october":
			monthString = "Octobre";
			break;
		case "november":
			monthString = "Novembre";
			break;
		case "december":
			monthString = "Decembre";
			break;
		default:
			monthString = "Invalid month";
			break;
		}
		//System.out.println(monthString);
		return monthString;
	}
}