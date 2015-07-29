public class Square extends Shape {
	private int size;
	private boolean filled =true;

	public Square(int size,boolean filled) {
		this.size = size;
		this.filled=filled;
	}

	public Square(int size,boolean filled, int x, int y, char fill) {
		super(x, y, fill);
		this.size = size;
		this.filled=filled;
	}

	public int getSize() {
		return size;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		String answer = "";
		answer+=under(getY());
		for (int i = 0; i < size; i++) {
			answer += right(getX());
			for (int j = 0; j < size; j++) {
				if(this.filled)
				{ 
					answer += getFill();
				}
				else
				{
					if(i==0||i==size-1)
					{
						answer += getFill();
					}
					else
						if(j==0||j==size-1)
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
