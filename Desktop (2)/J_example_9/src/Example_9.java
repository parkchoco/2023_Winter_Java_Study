
import java.io.IOException;

import java.util.Scanner;

public class Example_9 {
	public static void main(String args[]) throws IOException{
		
		Scanner scanner = new Scanner (System.in);
		
		String U_InputFile = "C:\\U_java\\Car.jpg";
		String U_OutputFile = "C:\\U_java\\Car_FlipHorizontal.jpg";
		
		//�̹����� �ҷ��´�.
		FlipHorizontalImage GI = new FlipHorizontalImage(U_InputFile,U_OutputFile);
		
	}
}
