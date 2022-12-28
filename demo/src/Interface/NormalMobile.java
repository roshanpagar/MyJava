package Interface;

interface Mobile
{
	void calling(int call);
	void messaging(String messege) ;
	void fm(String fm);
	void ram(String ram);
	void calcalator(int calculator);
	void calender(String calender);
	void battery(int battery);
	
}
public class NormalMobile implements Mobile {

		public void calling(int call) {
			System.out.println("Type the number fot calling"+call);
			
		}

		public void messaging(String messege) {
			System.out.println(messege+ " Everyone");
			
		}

		public void fm(String fm) {
			System.out.println(fm+" Fm and poor network");
			
		}

		public void ram(String ram) {
			System.out.println("Normal Mobilr Ram is "+ram);
			
		}

		public void calcalator(int calculator) {
			System.out.println("Normal mobile use only normal calculator + - * / "+calculator);
			
		}

		public void calender(String calender) {
		System.out.println("Normal Mobile not show the Festival"+calender);
			
		}

		public void battery(int battery) {
			System.out.println("Normal mobile Battery Capacity "+battery);
			
		}
		
			
		}

