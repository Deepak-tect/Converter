package Converter;

import java.lang.Math;
public class Converter {
	public static String reScaleDouble(double answerNum)
	{
	    //round to the 10th decimal place (like actual 10th not first decimal)
	    //if the number is too high or low it ends as zero which is bad
	    if(!(answerNum > 1.0E10) && ! (answerNum < 1.0E-10))
	    {
	        answerNum=Math.round(answerNum*10000000000.0)/10000000000.0;
	    }

	    //if double is just .0 then it's an int otherwise keep it
	    if(Double.toString(answerNum).endsWith(".0"))
	    {
	        return Integer.toString((int)answerNum);
	    }
	    else
	        return Double.toString(answerNum);
	}
	
//	public static void main(String[] args) throws Exception {
////		System.out.print(Converter.timeConverter("1", "Seconds", "Minutes"));
////		System.out.println(massConverter("3", "kg", "lb"));
////		System.out.println(massConverter("3", "kg", "oz"));
////		System.out.println(massConverter("3", "kg", "t"));
////		System.out.print(tempConverter("abcd", "Invalid", "Kelvin"));
//	}
}

