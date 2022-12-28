package arrayinjava;
import java.util.Scanner;
public class CompanyDepartmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Company comp[]=new Company[2];
		
		Scanner sc= new Scanner(System.in);
		
		/*Department dep[]= new Department[3];
		 * dep[0]=new Department(1000,"HR",70);
		dep[1]=new Department(1001,"Sales",60);
		dep[2]=new Department(1002,"Marketing",80);
		
		Company c1= new Company(101,"Infosys",dep);
		System.out.println(c1);*/
		
		for(int i=0;i<comp.length;i++)
		{
			Department dep[]= new Department[3];
			System.out.println("Enter the Company id,name: ");
			int cid=sc.nextInt();
			String cname=sc.next();
			System.out.println("Enter the department information: ");
			for(int j=0;j<dep.length;j++)
			{
				System.out.println("enter the dept id,name,employee numberr: ");
				int did=sc.nextInt();
				String dname= sc.next();
				int empNo=sc.nextInt();
				dep[j]=new Department(did,dname,empNo);
			}
			
			comp[i]=new Company(cid,cname,dep);
		}
		
		for(Company c:comp)
		{
			System.out.println(c);
		}
	}

}
