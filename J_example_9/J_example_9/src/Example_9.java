
import java.io.IOException;

import java.util.Scanner;

public class Example_9 {
	public static void main(String args[]) throws IOException{
		
		Scanner scanner = new Scanner (System.in);
		
		String U_InputFile = "C:\\U_java\\Car.jpg";
		String U_OutputFile = "C:\\U_java\\Car_FlipHorizontal.jpg";
		
		String U_InputFile1 = "C:\\U_java\\Car.jpg";
		String U_OutputFile1 = "C:\\U_java\\Car_Red.jpg";
		
		String U_InputFile2 = "C:\\U_java\\Car.jpg";
		String U_OutputFile2 = "C:\\U_java\\Car_Green.jpg";
		
		String U_InputFile3 = "C:\\U_java\\Car.jpg";
		String U_OutputFile3 = "C:\\U_java\\Car_Blue.jpg";
		
		String U_InputFile4 = "C:\\U_java\\Car.jpg";
		String U_OutputFile4 = "C:\\U_java\\Car_Colorfull.jpg";
		
		String U_InputFile5 = "C:\\U_java\\Car.jpg";
		String U_OutputFile5 = "C:\\U_java\\Car_Brighter.jpg";
		
		String U_InputFile6 = "C:\\U_java\\Car.jpg";
		String U_OutputFile6 = "C:\\U_java\\Car_Darker.jpg";
		
		String U_InputFile7 = "C:\\U_java\\Car.jpg";
		String U_OutputFile7 = "C:\\U_java\\Car_Gray.jpg";
		
		String U_InputFile8 = "C:\\U_java\\Car.jpg";
		String U_OutputFile8 = "C:\\U_java\\Car_All.jpg";
		
		//이미지를 불러온다.
		FlipHorizontalImage GI = new FlipHorizontalImage(U_InputFile,U_OutputFile);
		Red Gi = new Red(U_InputFile1,U_OutputFile1);
		Green Ge = new Green(U_InputFile2,U_OutputFile2);
		Blue Gy = new Blue(U_InputFile3,U_OutputFile3);
		Colorfull Gk = new Colorfull(U_InputFile4,U_OutputFile4);
		Brighter Gj = new Brighter(U_InputFile5,U_OutputFile5);
		Darker Gd = new Darker(U_InputFile6,U_OutputFile6);
		Gray Gr = new Gray(U_InputFile7,U_OutputFile7);
		All Gq = new All(U_InputFile8,U_OutputFile8);
	}
}
