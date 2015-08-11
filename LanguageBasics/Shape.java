public abstract class Shape {
	protected int x, y;
	protected char fill;

	public Shape(int x, int y, char fill) {
		this.fill = fill;
		this.x = x;
		this.y = y;
	}

	public Shape() {
		this.fill = 'x';
		this.x = 0;
		this.y = 0;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public char getFill() {
		return fill;
	}

	public void setFill(char fill) {
		this.fill = fill;
	}

	public String under(int y) {
		String answer = "";
		for (int i = 0; i < y; i++)
			answer+="\n";
		return answer;
	}

	public String right(int x) {
		String answer = "";
		for (int j = 0; j < x; j++)
			answer += " ";
		return answer;
	}
	
	public void move(int x,int y){
		setX(x);
		setY(y);
	}
	
	public String right2(int x){
		String answer = "";
		Line line = new Line(x, true, 0, 0, ' ');
		answer+=line.toString();
		return answer;
	}
}