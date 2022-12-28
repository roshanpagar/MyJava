package arrayinjava;

public class VariableArgument {
	
	void add(String name, float...marks) // argument ....complete array
	{
		float sum=0;
		System.out.println(name);
	
		for(int i=0;i<marks.length;i++)
		{
			sum=sum+marks[i];
		}
		System.out.println("Total Marks: "+sum);
		System.out.println("Perent: "+(sum/marks.length+" %"));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableArgument va=new VariableArgument();
		va.add("Rohit", 89.6f,87,69,78.4f,91);

	}

}
