package Interface;

interface TestCar
{
	void milage(int milage);
	void crash(String crash);
	void speedTest(int speedtest);
	void breakTest(String breaktest);
	void loadTesting(String  loadtest);

	
	}
class switf1  implements TestCar
{
	

	public void milage(int milage)
	{
		System.out.println("Mlilage is very high "+milage);
	}

	public void crash(String crash) 
	{
	 System.out.println(crash+" car Trust be Company ");
	}

	public void speedTest(int speedtest) {
		System.out.println("Maximum speed is : "+speedtest);
		
	}

	public void breakTest(String breaktest) {
		System.out.println(breaktest+" break this car be care ");
		
	}

	public void loadTesting(String loadtest) {
		System.out.println("Load Capicity of  "+loadtest) ;
		
	}

	public void dashBord(String dashbord) 
	{
		System.out.println(dashbord+"is very samrt design a car");
		
	}

	public void airBag(int airbag) {
		
		System.out.println(airbag+"Air bag in car");
	}

	public void chidLock(String clildlock) {
		System.out.println(clildlock+"car in lock");
	}
}

public class Switf {

	public static void main(String[] args) {
		 switf1 st = new  switf1();
		 st.milage(45);
		 st.crash("Sefty");
		 st.speedTest(180);
		 st.breakTest("Highpresher ");
		 st.loadTesting("250kg");
		 st.dashBord("Ac,Music,display Screen");
		 st.airBag(5);
		 st.chidLock("Automatic");
	}

}
	
