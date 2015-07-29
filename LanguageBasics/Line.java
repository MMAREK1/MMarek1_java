
public class Line extends Shape {
	private int length;
	private boolean vertical;

	public Line(int length, boolean vertical) {
		this.length = length;
		this.vertical = vertical;
	}

	public Line(int length, boolean vertical, int x, int y, char fill) {
		super(x, y, fill);
		this.length = length;
		this.vertical = vertical;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public boolean isVertical() {
		return vertical;
	}

	public void setVertical(boolean vertical) {
		this.vertical = vertical;
	}

	@Override
	public String toString() {
		String answer = "";
		answer+=under(this.getY());
		answer += right(this.getX());
		for (int i = 0; i < length; i++) {
			answer += getFill();
			if (vertical == false)
			{
				answer += "\n";
				answer += right(this.getX());
			}
		}
		return answer;
	}

}
