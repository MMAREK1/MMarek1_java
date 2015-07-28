

public class Person {
	
	public Person(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean setAge(int age) {
		if(isValidAge(age))
		{
				this.age = age;
		}
		return isValidAge(age);
	}
	private boolean isValidAge(int age){
			return age>0 && age <150;		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " ("+ this.age+")";
	}

}
