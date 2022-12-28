package Interface;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class SamartPhone implements Mobile {
	
		public void Calling(int call)
		{
			System.out.println("Samart mobile calling vedio calls "+call);
		}

	public static void main(String[] args) {
		System.out.println("___Smart Mobile Features___");
			SamartPhone sm = new  	SamartPhone();
			sm.Calling(984554474);
			sm.ram("2bg");
			sm.calender("march 14");
			sm.battery(1300 );
			sm.fm("Smart");
			sm.camera(32);
		System.out.println("\n___Normal Mobile Features___");
	        NormalMobile n=new NormalMobile();
	        n.calling(708350);
	        n.ram("1gb");
	        n.calender("yes");
	        n.battery(800);
	        n.fm("Normal");
	}

	public void calling(int call) {
		System.out.println("Type the number fot calling"+call);
		
	}

	public void messaging(String messege) {
		System.out.println(messege+ " Everyone");
		
	}

	public void fm(String fm) {
		System.out.println(fm+" FM new Upgraded and Features");
		
	}

	public void ram(String ram) {
		System.out.println("Smartl Mobilr Ram is "+ram);
		
	}

	public void calcalator(int calculator) {
		System.out.println("Smart mobile use only normal calculator + - * / "+calculator);
		
	}

	public void calender(String calender) {
	System.out.println("Smart Mobile not show the Festival"+calender);
		
	}

	public void battery(int battery) {
		System.out.println("Smart mobile Battery Capacity "+battery);
		
	}
	
	public void camera(int camera) {
		System.out.println("smart mb have camera with pixel: "+camera);
	}
	


	

}
