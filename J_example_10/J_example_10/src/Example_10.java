

import java.io.IOException;

import java.util.Scanner;

public class Example_10 {
	public static void main(String args[]) throws IOException{
		
		Scanner scanner = new Scanner (System.in);
		
		String U_InputFile = "C:\\U_java\\Car.jpg";
		String U_OutputFile = "C:\\U_java\\Car_EdgeDetection.jpg";
		
		String U_InputFile1 = "C:\\U_java\\Car.jpg";
		String U_OutputFile1 = "C:\\U_java\\Car_EdgeDetection_5.jpg";
		
		String U_InputFile2 = "C:\\U_java\\Car.jpg";
		String U_OutputFile2 = "C:\\U_java\\Car_EdgeDetection_9.jpg";
		
		String U_InputFile3 = "C:\\U_java\\a.jpg";
		String U_OutputFile3 = "C:\\U_java\\Car_Thresholding_value.jpg";
		//이미지를 불러온다.
		EdgeDetection GI = new EdgeDetection(U_InputFile,U_OutputFile);
		EdgeDetection_5 Gy = new EdgeDetection_5(U_InputFile1,U_OutputFile1);
		EdgeDetection_9 Go = new EdgeDetection_9(U_InputFile2,U_OutputFile2);
		Thresholding_value Gp = new Thresholding_value(U_InputFile3,U_OutputFile3);
	}
}
