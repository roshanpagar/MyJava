package arrayinjava;

public class ReplaceNagativeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]= {2,-1,56,-2,67,-9,90,-5};
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<0)
			{
				num[i]=num[i]*0;
			}
			System.out.print(num[i]+" ");
		}
	}

}
