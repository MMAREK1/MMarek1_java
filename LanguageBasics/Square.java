
public class Square {
	private int size;
	public Square(int size)
	{
		setSize(size);
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		String answer="";
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(i==0 ||i==size-1)
				{
					answer+="*";
				}
				else
				{
					if(j==0 ||j==size-1)
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
