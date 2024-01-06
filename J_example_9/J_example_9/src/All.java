
import java.io.File;//파일형태이미지출력
import java.io.IOException;
import java.awt.Color;//블루, 그린, 레드 세가지 색으로
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class All {//좌우 바꾸는 형태
	private BufferedImage SourceImage = null;//입력영상
	private BufferedImage TargetImage = null;
	
	private int width, height;//크기
	private int row, column;//가로 세로 개념
	private int red, green, blue;
	
	private Color color, new_color;
	private Color white_color;
	
	private File U_InputFile = null;
	private File U_OutputFile = null;
	
	// Constructor #2 - constructor with parameter 생성자
	All(String U_InputFile_Path, String U_OutputFile_Path) {
		
		/////////////////////////////
		// Read in the input image 영상을 가져옴
		U_InputFile = new File(U_InputFile_Path);
		U_OutputFile = new File(U_OutputFile_Path);
		
		//오류나 에러가 발생했을때 처리를 위함
		try {
			SourceImage = ImageIO.read(U_InputFile);//지정된 영상을 불러와서 메모리에 보여줘라 - 메모리 공간확보
			TargetImage = ImageIO.read(U_InputFile);
		}
		catch(IOException e) {//에러 캐치 보여줌
			System.out.println(e);
		}
		
		//get image width and height 너비와 높이를 알아냄
		width = SourceImage.getWidth();
		height = SourceImage.getHeight();
		
		//하얀도화지 만들기 make TargetImage white image
		white_color = new Color(255,255,255);//세가지 색을 모두 255로 섞으면 흰색이 나온다.
		

		
		for (column = 0; column<=height-1;column++) {//알아낸 너비와 높이로 영상을 흰색으로 칠해줌
			for (row=0;row<=width-1;row++) {
				TargetImage.setRGB(row, column, white_color.getRGB());//특정 이미지에 색상을 입혀주려면 row, column의 위치에 white_color을 찍어준다.
			}
		}
		
		
		/////////////////////////////////////////////
		//F L I P H O R I Z O N T A L   I M A G E
		/////////////////////////////////////////////
		/*
		for(column =0;column<=height-1;column++) {
			for (row = 0; row<=width-1;row++) {
				
				//read a pixel 값을 읽어라
				color = new Color(SourceImage.getRGB(row, column));//row, column의 특정한 위치에 있는 색깔을 읽어와라
				
				
				//write it on the targetImage
				TargetImage.setRGB(width-1-row, column, color.getRGB());//색깔을 찍어줄때는 row와 column에 찍어라
			}
		}*/
		
		
		for(column =0;column<=height-1;column++) {
			for (row = 0; row<=width-1;row++) {
				
				//read a pixel 값을 읽어라
				color = new Color(SourceImage.getRGB(row, column));//row, column의 특정한 위치에 있는 색깔을 읽어와라
				red=(int)(color.getRed());//레드가 뜯어져나온다->분해한다
				green=(int)(color.getGreen());
				blue=(int)(color.getBlue());
				
				//write it on the targetImage

				TargetImage.setRGB(row/2, column/2, color.getRGB());
				
				if(red+30>255) {
					red=225;
				}
				else
					red=red+30;
				
				if(green+30>255) {
					green=225;
				}
				else
					green+=30;
				
				
				if(blue+30>255) {
					blue=225;
				}
				else
					blue+=30;
				
				new_color = new Color(red,green,blue);//세가지 색을 썪어서 색만들기
				TargetImage.setRGB(row/2+width/2, column/2, new_color.getRGB());
				
				if(red-100<0) {
					red=0;
				}
				else
					red=red-100;
				
				if(green-100<0) {
					green=0;
				}
				else
					green-=100;
				
				
				if(blue-100<0) {
					blue=0;
				}
				else
					blue-=100;
				
				new_color = new Color(red,green,blue);//세가지 색을 썪어서 색만들기
				TargetImage.setRGB(row/2, column/2+height/2, new_color.getRGB());
				
		
				
				new_color = new Color((red+green+blue)/3,(red+green+blue)/3,(red+green+blue)/3);//세가지 색을 썪어서 색만들기
				TargetImage.setRGB(row/2+width/2, column/2+height/2, new_color.getRGB());

			}
		}
		
		
		
		
		
		
		
		//출력 영역
		//write out the result image
		try {
			ImageIO.write(TargetImage,"png", U_OutputFile);
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}
