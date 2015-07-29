
public class Triangle extends Shape {
	private int size;
	private boolean filled = true;
	

	public Triangle(int size, boolean filled)
	{
		this.size=size;
		this.filled=filled;
	}
	public Triangle(int size,boolean fillled, int x, int y, char fill)
	{
		super(x, y, fill);
		this.size=size;
		this.filled=fillled;
				
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		String answer = "";
		answer+=under(getY());
		for(int i=0;i<size;i++)
		{
			answer += right(getX());
			for(int j = 0; j < size - i - 1; j++) {
	            answer+=" ";
	        }
			for(int k = 0; k < 2 * i + 1; k++) {
	            if(filled==true)
	            {
	            	answer+=getFill();
	            }
	            else
	            {
	            	if(i==0||i==size-1)
	            	{
	            		answer+=getFill();
	            	}
	            	else{
	            	if(k==0 ||k==2*i)
	            	{
	            		answer+=getFill();
	               	}
	            	else
	            	{
	            		answer+=" ";
	            	}
	            	}
	            }
	        }
			answer+="\n";
		}
		return answer;
	}
	
}
