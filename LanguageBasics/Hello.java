public class Hello {

	public static void main(String[] args) {
		int j = 0;
		String nazov = "HelloWorld";
		System.out.print("Hello World!");
		System.out.print("Hello World!");
		System.out.print("Hello World!");
		for (int i = 0; i < 3; i++) {
			System.out.println("vypis vo for");
		}
		while (j < 3) {
			System.out.println("vypis vo while");
			j++;
		}
		System.out.println();
		for (int k = nazov.length(); k > 0; k--) {

			System.out.println(nazov.substring(0, k));
		}
		System.out.println();
		for (int l = 0; l <= nazov.length(); l++) {

			System.out.println(nazov.substring(l, nazov.length()));
		}
		System.out.println();
		for (int m = 0; m <= nazov.length(); m++) {

			System.out.println(nazov.substring(0, m));
		}
		System.out.println();
		System.out.println();
		for (int l = 0; l < nazov.length() / 2; l++) {
			System.out.println(nazov.substring(l, nazov.length() - l));
		}
		System.out.println();
		System.out.println();
		for (int l = 0; l < nazov.length() / 2; l++) {
			for (int n = 0; n < l; n++) {
				System.out.print(" ");
			}
			System.out.println(nazov.substring(l, nazov.length() - l));
		}

		Person p = new Person("Janko Hraško", 18);
		System.out.println(p);

		Triangle triangle = new Triangle(10,false, 2, 1, '/');
		System.out.println(triangle);

		Line line = new Line(10, true, 3, 2, '+');
		System.out.println(line);

		Square square = new Square(8,false,4,3,'*');
		System.out.println(square);

		Rectangle rectangle = new Rectangle(4, 30,true, 5, 4, 'r');
		System.out.println(rectangle);
	}
	
}