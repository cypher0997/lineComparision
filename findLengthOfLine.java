import java.util.Scanner.*;
public class findLengthOfLine{
	public static void main(String[] args){
		int x1,x2,y1,y2;
		x1=20;
		x2=40;
		y1=40;
		y2=80;
		double dis=Math.sqrt((x2-x1)^2+(y2-y1)^2);
		System.out.println("the length of line between two cordinates"+"("+x1+","+x2+")"+"("+y1+","+y2+")"+"is:->"+dis);
	}
}