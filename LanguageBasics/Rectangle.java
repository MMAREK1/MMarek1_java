
public class Rectangle {
	private int height;
	private int width;
	public Rectangle(int height,int width){
		setHeight(height);
		setWidth(width);
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
		String answer="";
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<width;j++)
			{
				if(i==0 ||i==height-1)
				{
					answer+="*";
				}
				else
				{
					if(j==0 ||j==width-1)
					{
						answer+="*";
					}
					else
					{
						answer+=" ";
					}
				}
			}
			answer+="\n";
		}
		return answer;
	}
}
