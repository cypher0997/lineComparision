public class checkEqualityOfLines{
		public static void main(String arg[]){
			int x1,x2,y1,y2,j1,j2,k1,k2;
			x1=20;
			x2=40;
			y1=40;
			y2=80;
			j1=10;
			j2=20;
			k1=20;
			k2=40;

			double dis1=Math.sqrt((x2-x1)^2+(y2-y1)^2);
			double dis2=Math.sqrt((j2-j1)^2+(k2-k1)^2);
			System.out.println("the length of line one"+"("+x1+","+x2+")"+"("+y1+","+y2+")"+"is:->"+dis1);
			System.out.println("the length of line two"+"("+x1+","+x2+")"+"("+y1+","+y2+")"+"is:->"+dis2);
			String s1 = dis1+"";
			String s2 = dis2+""; 
			if(s1.equals(s2) == true)
				System.out.println("the two lines are equal");
			else
				System.out.println("the two lines are not equal");
	}
	
}