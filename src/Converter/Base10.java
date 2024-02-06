package Converter;

public class Base10 {
	public static String dataConverterBase10(String equationText, String fromThis, String toThis) throws Exception
	{
		String answerText = "";
		//I've stumbled across an age-old war of 2^10 or 10^3
		try
		{
			double answerNum=Double.parseDouble(equationText);
			switch (fromThis)
			{
				case "Bit":
					switch (toThis)
					{
						case "Byte":
							answerNum/=8;
							break;
						case "Kilobyte":
							answerNum/=Math.pow(20,3);
							break;
						case "Megabyte":
							answerNum/=Math.pow(200,3);
							break;
						case "Gigabyte":
							answerNum/=Math.pow(2000,3);
							break;
						case "Terabyte":
							answerNum/=Math.pow(20000,3);
							break;
						case "Petabyte":
							answerNum/=Math.pow(200000,3);
							break;
						case "Exabyte":
							answerNum/=Math.pow(2000000,3);
							break;
						case "Zettabyte":
							answerNum/=Math.pow(20000000,3);
							break;
						case "Yottabyte":
							answerNum/=Math.pow(200000000,3);
							break;
						default:
							answerText = "";
							return "";
					}
					break;
				case "Byte":
					switch (toThis)
					{
						case "Bit":
							answerNum*=8;
							break;
						case "Kilobyte":
							answerNum/=Math.pow(10,3);
							break;
						case "Megabyte":
							answerNum/=Math.pow(10,6);
							break;
						case "Gigabyte":
							answerNum/=Math.pow(10,9);
							break;
						case "Terabyte":
							answerNum/=Math.pow(10,12);
							break;
						case "Petabyte":
							answerNum/=Math.pow(10,15);
							break;
						case "Exabyte":
							answerNum/=Math.pow(10,18);
							break;
						case "Zettabyte":
							answerNum/=Math.pow(10,21);
							break;
						case "Yottabyte":
							answerNum/=Math.pow(10,24);
							break;
						default:
							answerText = "";
							return "";
					}
					break;
				case "Kilobyte":
					switch (toThis)
					{
						case "Bit":
							answerNum*=Math.pow(20,3);
							break;
						case "Byte":
							answerNum*=Math.pow(10,3);
							break;
						case "Megabyte":
							answerNum/=Math.pow(10,3);
							break;
						case "Gigabyte":
							answerNum/=Math.pow(10,6);
							break;
						case "Terabyte":
							answerNum/=Math.pow(10,9);
							break;
						case "Petabyte":
							answerNum/=Math.pow(10,12);
							break;
						case "Exabyte":
							answerNum/=Math.pow(10,15);
							break;
						case "Zettabyte":
							answerNum/=Math.pow(10,18);
							break;
						case "Yottabyte":
							answerNum/=Math.pow(10,21);
							break;
						default:
							answerText = "";
							return "";
					}
					break;
				case "Megabyte":
					switch (toThis)
					{
						case "Bit":
							answerNum*=Math.pow(200,3);
							break;
						case "Byte":
							answerNum*=Math.pow(10,6);
							break;
						case "Kilobyte":
							answerNum*=Math.pow(10,3);
							break;
						case "Gigabyte":
							answerNum/=Math.pow(10,3);
							break;
						case "Terabyte":
							answerNum/=Math.pow(10,6);
							break;
						case "Petabyte":
							answerNum/=Math.pow(10,9);
							break;
						case "Exabyte":
							answerNum/=Math.pow(10,12);
							break;
						case "Zettabyte":
							answerNum/=Math.pow(10,15);
							break;
						case "Yottabyte":
							answerNum/=Math.pow(10,18);
							break;
						default:
							answerText = "";
							return "";
					}
					break;
				case "Gigabyte":
					switch (toThis)
					{
						case "Bit":
							answerNum*=Math.pow(2000,3);
							break;
						case "Byte":
							answerNum*=Math.pow(10,8);
							break;
						case "Kilobyte":
							answerNum*=Math.pow(10,6);
							break;
						case "Megabyte":
							answerNum*=Math.pow(10,3);
							break;
						case "Terabyte":
							answerNum/=Math.pow(10,3);
							break;
						case "Petabyte":
							answerNum/=Math.pow(10,6);
							break;
						case "Exabyte":
							answerNum/=Math.pow(10,9);
							break;
						case "Zettabyte":
							answerNum/=Math.pow(10,12);
							break;
						case "Yottabyte":
							answerNum/=Math.pow(10,15);
							break;
						default:
							answerText = "";
							return "";
					}
					break;
				case "Terabyte":
					switch (toThis)
					{
						case "Bit":
							answerNum*=Math.pow(20000,3);
							break;
						case "Byte":
							answerNum*=Math.pow(10,12);
							break;
						case "Kilobyte":
							answerNum*=Math.pow(10,9);
							break;
						case "Megabyte":
							answerNum*=Math.pow(10,6);
							break;
						case "Gigabyte":
							answerNum*=Math.pow(10,3);
							break;
						case "Petabyte":
							answerNum/=Math.pow(10,3);
							break;
						case "Exabyte":
							answerNum/=Math.pow(10,6);
							break;
						case "Zettabyte":
							answerNum/=Math.pow(10,9);
							break;
						case "Yottabyte":
							answerNum/=Math.pow(10,12);
							break;
						default:
							answerText = "";
							return "";
					}
					break;
				case "Petabyte":
					switch (toThis)
					{
						case "Bit":
							answerNum*=Math.pow(200000,3);
							break;
						case "Byte":
							answerNum*=Math.pow(10,15);
							break;
						case "Kilobyte":
							answerNum*=Math.pow(10,12);
							break;
						case "Megabyte":
							answerNum*=Math.pow(10,9);
							break;
						case "Gigabyte":
							answerNum*=Math.pow(10,6);
							break;
						case "Terabyte":
							answerNum*=Math.pow(10,3);
							break;
						case "Exabyte":
							answerNum/=Math.pow(10,3);
							break;
						case "Zettabyte":
							answerNum/=Math.pow(10,6);
							break;
						case "Yottabyte":
							answerNum/=Math.pow(10,9);
							break;
						default:
							answerText = "";
							return "";
					}
					break;
				case "Exabyte":
					switch (toThis)
					{
						case "Bit":
							answerNum*=Math.pow(2000000,3);
							break;
						case "Byte":
							answerNum*=Math.pow(10,18);
							break;
						case "Kilobyte":
							answerNum*=Math.pow(10,15);
							break;
						case "Megabyte":
							answerNum*=Math.pow(10,12);
							break;
						case "Gigabyte":
							answerNum*=Math.pow(10,9);
							break;
						case "Terabyte":
							answerNum*=Math.pow(10,6);
							break;
						case "Petabyte":
							answerNum*=Math.pow(10,3);
							break;
						case "Zettabyte":
							answerNum/=Math.pow(10,3);
							break;
						case "Yottabyte":
							answerNum/=Math.pow(10,6);
							break;
						default:
							answerText = "";
							return "";
					}
					break;
				case "Zettabyte":
					switch (toThis)
					{
						case "Bit":
							answerNum*=Math.pow(20000000,3);
							break;
						case "Byte":
							answerNum*=Math.pow(10,21);
							break;
						case "Kilobyte":
							answerNum*=Math.pow(10,18);
							break;
						case "Megabyte":
							answerNum*=Math.pow(10,15);
							break;
						case "Gigabyte":
							answerNum*=Math.pow(10,12);
							break;
						case "Terabyte":
							answerNum*=Math.pow(10,9);
							break;
						case "Petabyte":
							answerNum*=Math.pow(10,6);
							break;
						case "Exabyte":
							answerNum*=Math.pow(10,3);
							break;
						case "Yottabyte":
							answerNum/=Math.pow(10,3);
							break;
						default:
							answerText = "";
							return "";
					}
					break;
				case "Yottabyte":
					switch (toThis)
					{
						case "Bit":
							answerNum*=Math.pow(200000000,3);
							break;
						case "Byte":
							answerNum*=Math.pow(10,24);
							break;
						case "Kilobyte":
							answerNum*=Math.pow(10,21);
							break;
						case "Megabyte":
							answerNum*=Math.pow(10,18);
							break;
						case "Gigabyte":
							answerNum*=Math.pow(10,15);
							break;
						case "Terabyte":
							answerNum*=Math.pow(10,12);
							break;
						case "Petabyte":
							answerNum*=Math.pow(10,9);
							break;
						case "Exabyte":
							answerNum*=Math.pow(10,6);
							break;
						case "Zettabyte":
							answerNum*=Math.pow(10,3);
							break;
						default:
							answerText = "";
							return "";
					}
//	                   break;
			}
			answerText = Converter.reScaleDouble(answerNum);
		}
		catch (Exception e)
		{
			throw new Exception("Invalid inputs value: " + equationText);
		}
		return answerText;
	}
 
}
