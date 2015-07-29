
public class Triangle {
	private int size;
	
	public Triangle(int size)
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
		String answer = "";
		for(int i=0;i<size;i++)
		{
			for(int j = 0; j < size - i - 1; j++) {
	            answer+=" ";
	        }
			for(int k = 0; k < 2 * i + 1; k++) {
	            answer+="*";
	        }
			answer+="\n";
		}
		return answer;
	}
	
}
