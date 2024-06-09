package week1;

public class StudentData {
	
	//data
	int id=101;
	String name="Mona";
	int m1=95;
	int m2=100;
	
	//method
	
	
	public void show()
	{
		System.out.println(id);
		System.out.println(name);
		
	}
	
	public void display()
	{
		int total= m1+m2;
		System.out.println(total);
	}
	
	
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		StudentData s1=new StudentData();
		s1.show();
		s1.display();

	}

}
