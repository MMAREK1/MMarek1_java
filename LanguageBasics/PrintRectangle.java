public class PrintRectangle {
	public static void main(String[] args) {
		if(args.length==2 && Integer.parseInt(args[0])>0 && Integer.parseInt(args[1])>0)
		{
			int w = Integer.parseInt(args[0]);
			int h = Integer.parseInt(args[1]);
	        for(int i = 0; i < h; i++) {
	            for(int j = 0; j < w; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        
		}
		else
			System.out.println("Nespravny zadanie argumentov");
	}
}
