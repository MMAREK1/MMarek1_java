public class Rectangle extends Shape {
	private int height;
	private int width;
	private boolean filled =true;

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Rectangle(int height, int width,boolean filled) {
		this.height = height;
		this.width = width;
		this.filled=filled;
	}

	public Rectangle(int height, int width,boolean filled, int x, int y, char fill) {
		super(x, y, fill);
		this.height = height;
		this.width = width;
		this.filled=filled;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		String answer = "";
		answer+=under(getY());
		for (int i = 0; i < height; i++) {
			answer += right(getX());
			for (int j = 0; j < width; j++) {
				if(this.filled)
				{ 
					answer += getFill();
				}
				else
				{
					if(i==0||i==height-1)
					{
						answer += getFill();
					}
					else
						if(j==0||j==width-1)
						{
							answer += getFill();
						}
						else 
							answer +=" ";
				}
			}
			answer += "\n";
		}
		return answer;
	}
}
