package Test_4Polymorphism_Inheritance;
/*4.	Design a class to overload a function series() as follows:
(i) double series(double n) with one double argument and returns the sum of the series, sum = 1 / 1 + 1 / 2 + 1 / 3 + … + 1 / n.
(ii) double series(double a, double n) with two double arguments and returns the sum of the series, sum = 1 / a2 + 4 / a5 + 7 / a8 + 10 / a11 + … to n terms.
*/
public class FuncationOverloadSeries {

	 double series(double n) {
	        double sum = 0;
	        for (int i = 1; i <= n; i++) {
	            double term = 1.0 / i;
	            sum += term;
	        }
	        return sum;
	    }
	    
	    double series(double a, double n) {
	        double sum = 0;
	        int x = 1;
	        for (int i = 1; i <= n; i++) {
	            int e = x + 1;
	            double term = x / Math.pow(a, e);
	            sum += term;
	            x += 3;
	        }
	        return sum;
	    }
	    
	   /* public static void main(String args[]) {
	        FuncationOverloadSeries obj = new FuncationOverloadSeries();
	        System.out.println("First series sum = " + obj.series(5));
	        System.out.println("Second series sum = " + obj.series(3, 8));*/
	    }

