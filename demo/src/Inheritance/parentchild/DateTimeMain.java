package Inheritance.parentchild;

public class DateTimeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyTime mt= new MyTime();
		mt.setHrs(11);
		mt.setmin(10);
		mt.setSecs(49);
		// MyDate mt1=new MyDate()
		mt.setDd(28);
		mt.setMm(11);
		mt.setYy(2022);
		System.out.println("mt");
		System.out.println(mt.getHrs()+" "+mt.getMin()+" "+mt.getSecs()+" \n"+mt.getDd()+" "+mt.getMm()+" "+mt.getYy());
		
		
		
	}

}
