package arrayinjava;
import java.util.Scanner;
public class StudentArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud[]=new Student[10];
		Scanner sc=new Scanner(System.in);
		
		/*stud[0]=new Student(101,"Raj","Computer",70);
		stud[1]=new Student(102,"Riya","Civil",60);
		stud[2]=new Student(103,"Anjali","ENTC",76);
		stud[3]=new Student(104,"Ram","Computer",78);
		stud[4]=new Student(105,"Ankit","Mechanical",56);
		stud[5]=new Student(106,"Roshan","Computer",87);
		stud[6]=new Student(107,"Sameer","Computer",54);
		stud[7]=new Student(108,"Rohit","Computer",87);
		stud[8]=new Student(109,"Rahul","EnTC",65);
		stud[9]=new Student(110,"Kartik","Civil",45);*/
		for(int i=0;i<1;i++)
		{
			System.out.println("Enter the id , name, dept, marks for Student:  ");
			int id=sc.nextInt();
			String name=sc.next();
			String depr=sc.next();
			int marks=sc.nextInt();
			String dept=sc.next();
			stud[i]=new Student(id, name, dept, marks);
			
		}
		for(Student s:stud)
		{
			if(s.marks>=65 && s.dept.equals("Computer"))
				System.out.println(s);
		}

	}

}
