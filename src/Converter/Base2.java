package Converter;

public class Base2 {
	public static String dataConverterBase2(String equationText, String fromThis, String toThis) throws Exception
	{
		String answerText;
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
							answerNum/=Math.pow(2,13);
							break;
						case "Megabyte":
							answerNum/=Math.pow(2,23);
							break;
						case "Gigabyte":
							answerNum/=Math.pow(2,33);
							break;
						case "Terabyte":
							answerNum/=Math.pow(2,43);
							break;
						case "Petabyte":
							answerNum/=Math.pow(2,53);
							break;
						case "Exabyte":
							answerNum/=Math.pow(2,63);
							break;
						case "Zettabyte":
							answerNum/=Math.pow(2,73);
							break;
						case "Yottabyte":
							answerNum/=Math.pow(2,83);
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
							answerNum/=Math.pow(2,10);
							break;
						case "Megabyte":
							answerNum/=Math.pow(2,20);
							break;
						case "Gigabyte":
							answerNum/=Math.pow(2,30);
							break;
						case "Terabyte":
							answerNum/=Math.pow(2,40);
							break;
						case "Petabyte":
							answerNum/=Math.pow(2,50);
							break;
						case "Exabyte":
							answerNum/=Math.pow(2,60);
							break;
						case "Zettabyte":
							answerNum/=Math.pow(2,70);
							break;
						case "Yottabyte":
							answerNum/=Math.pow(2,80);
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
							answerNum*=Math.pow(2,13);
							break;
						case "Byte":
							answerNum*=Math.pow(2,10);
							break;
						case "Megabyte":
							answerNum/=Math.pow(2,10);
							break;
						case "Gigabyte":
							answerNum/=Math.pow(2,20);
							break;
						case "Terabyte":
							answerNum/=Math.pow(2,30);
							break;
						case "Petabyte":
							answerNum/=Math.pow(2,40);
							break;
						case "Exabyte":
							answerNum/=Math.pow(2,50);
							break;
						case "Zettabyte":
							answerNum/=Math.pow(2,60);
							break;
						case "Yottabyte":
							answerNum/=Math.pow(2,70);
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
							answerNum*=Math.pow(2,23);
							break;
						case "Byte":
							answerNum*=Math.pow(2,20);
							break;
						case "Kilobyte":
							answerNum*=Math.pow(2,10);
							break;
						case "Gigabyte":
							answerNum/=Math.pow(2,10);
							break;
						case "Terabyte":
							answerNum/=Math.pow(2,20);
							break;
						case "Petabyte":
							answerNum/=Math.pow(2,30);
							break;
						case "Exabyte":
							answerNum/=Math.pow(2,40);
							break;
						case "Zettabyte":
							answerNum/=Math.pow(2,50);
							break;
						case "Yottabyte":
							answerNum/=Math.pow(2,60);
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
							answerNum*=Math.pow(2,33);
							break;
						case "Byte":
							answerNum*=Math.pow(2,30);
							break;
						case "Kilobyte":
							answerNum*=Math.pow(2,20);
							break;
						case "Megabyte":
							answerNum*=Math.pow(2,10);
							break;
						case "Terabyte":
							answerNum/=Math.pow(2,10);
							break;
						case "Petabyte":
							answerNum/=Math.pow(2,20);
							break;
						case "Exabyte":
							answerNum/=Math.pow(2,30);
							break;
						case "Zettabyte":
							answerNum/=Math.pow(2,40);
							break;
						case "Yottabyte":
							answerNum/=Math.pow(2,50);
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
							answerNum*=Math.pow(2,43);
							break;
						case "Byte":
							answerNum*=Math.pow(2,40);
							break;
						case "Kilobyte":
							answerNum*=Math.pow(2,30);
							break;
						case "Megabyte":
							answerNum*=Math.pow(2,20);
							break;
						case "Gigabyte":
							answerNum*=Math.pow(2,10);
							break;
						case "Petabyte":
							answerNum/=Math.pow(2,10);
							break;
						case "Exabyte":
							answerNum/=Math.pow(2,20);
							break;
						case "Zettabyte":
							answerNum/=Math.pow(2,30);
							break;
						case "Yottabyte":
							answerNum/=Math.pow(2,40);
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
							answerNum*=Math.pow(2,53);
							break;
						case "Byte":
							answerNum*=Math.pow(2,50);
							break;
						case "Kilobyte":
							answerNum*=Math.pow(2,40);
							break;
						case "Megabyte":
							answerNum*=Math.pow(2,30);
							break;
						case "Gigabyte":
							answerNum*=Math.pow(2,20);
							break;
						case "Terabyte":
							answerNum*=Math.pow(2,10);
							break;
						case "Exabyte":
							answerNum/=Math.pow(2,10);
							break;
						case "Zettabyte":
							answerNum/=Math.pow(2,20);
							break;
						case "Yottabyte":
							answerNum/=Math.pow(2,30);
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
							answerNum*=Math.pow(2,63);
							break;
						case "Byte":
							answerNum*=Math.pow(2,60);
							break;
						case "Kilobyte":
							answerNum*=Math.pow(2,50);
							break;
						case "Megabyte":
							answerNum*=Math.pow(2,40);
							break;
						case "Gigabyte":
							answerNum*=Math.pow(2,30);
							break;
						case "Terabyte":
							answerNum*=Math.pow(2,20);
							break;
						case "Petabyte":
							answerNum*=Math.pow(2,10);
							break;
						case "Zettabyte":
							answerNum/=Math.pow(2,10);
							break;
						case "Yottabyte":
							answerNum/=Math.pow(2,20);
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
							answerNum*=Math.pow(2,73);
							break;
						case "Byte":
							answerNum*=Math.pow(2,70);
							break;
						case "Kilobyte":
							answerNum*=Math.pow(2,60);
							break;
						case "Megabyte":
							answerNum*=Math.pow(2,50);
							break;
						case "Gigabyte":
							answerNum*=Math.pow(2,40);
							break;
						case "Terabyte":
							answerNum*=Math.pow(2,30);
							break;
						case "Petabyte":
							answerNum*=Math.pow(2,20);
							break;
						case "Exabyte":
							answerNum*=Math.pow(2,10);
							break;
						case "Yottabyte":
							answerNum/=Math.pow(2,10);
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
							answerNum*=Math.pow(2,83);
							break;
						case "Byte":
							answerNum*=Math.pow(2,80);
							break;
						case "Kilobyte":
							answerNum*=Math.pow(2,70);
							break;
						case "Megabyte":
							answerNum*=Math.pow(2,60);
							break;
						case "Gigabyte":
							answerNum*=Math.pow(2,50);
							break;
						case "Terabyte":
							answerNum*=Math.pow(2,40);
							break;
						case "Petabyte":
							answerNum*=Math.pow(2,30);
							break;
						case "Exabyte":
							answerNum*=Math.pow(2,20);
							break;
						case "Zettabyte":
							answerNum*=Math.pow(2,10);
							break;
						default:
							answerText = "";
							return "";
					}
					break;
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
