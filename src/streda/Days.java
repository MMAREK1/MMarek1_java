package streda;

public class Days {

	public static void dayToText(int day) {
		switch (day) {
		case 1:
			System.out.println("Pondelisko");
			break;
		case 2:
			System.out.println("Utorisko");
			break;
		case 3:
			System.out.println("Streda");
			break;
		case 4:
			System.out.println("Stvrtok");
			break;
		case 5:
			System.out.println("Piatocek");
			break;
		case 6:
			System.out.println("Soboticka");
			break;
		case 7:
			System.out.println("Nedelicka");
			break;
		default:
			System.out.println("Co za den si to tu dal?");
			break;
		}
	}

	public static void dayToText(String day) {
		switch (day.toLowerCase()) {
		case "pondelok":
			System.out.println("Pondelisko -");
			break;
		case "utorok":
			System.out.println("Utorisko-");
			break;
		case "streda":
			System.out.println("Streda-");
			break;
		case "stvrtok":
			System.out.println("Stvrtok-");
			break;
		case "piatok":
			System.out.println("Piatocek-");
			break;
		case "sobota":
			System.out.println("Soboticka-");
			break;
		case "nedela":
			System.out.println("Nedelicka-");
			break;
		default:
			System.out.println("Co za den si to tu dal?-");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < args.length; i++) {
			try {
				int n = Integer.parseInt(args[i]);
				dayToText(n);
			} catch (NumberFormatException ex) {
				dayToText(args[i]);
			}
		}

	}

}
