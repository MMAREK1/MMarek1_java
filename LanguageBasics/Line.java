
public class Line {
	private int length;
	private boolean vertical;
	public Line(int length, boolean vertical)
	{
		setLength(length);
		setVertical(vertical);				
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
		String answer="";
		for(int i=0;i<length;i++)
		{
			answer+="*";
			if(vertical==false)
				answer+="\n";
		}
		return answer;
	}
	
}
