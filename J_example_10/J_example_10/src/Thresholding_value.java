

import java.io.File;//���������̹������
import java.io.IOException;
import java.awt.Color;//���, �׸�, ���� ������ ������
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Thresholding_value {//�¿� �ٲٴ� ����
	private BufferedImage SourceImage = null;//�Է¿���
	private BufferedImage TargetImage = null;
	private int a,b;
	private int width, height;//ũ��
	private int row, column;//���� ���� ����
	private int red, green, blue;
	private int new_red, new_green, new_blue;
	
	private Color color, new_color;
	private Color white_color = new Color(255,255,255);;
	private Color black_color = new Color(0,0,0);
	
	
	private File U_InputFile = null;
	private File U_OutputFile = null;
	
	// Constructor #2 - constructor with parameter ������
	Thresholding_value(String U_InputFile_Path, String U_OutputFile_Path) {
		
		/////////////////////////////
		// Read in the input image ������ ������
		U_InputFile = new File(U_InputFile_Path);
		U_OutputFile = new File(U_OutputFile_Path);
		
		//������ ������ �߻������� ó���� ����
		try {
			SourceImage = ImageIO.read(U_InputFile);//������ ������ �ҷ��ͼ� �޸𸮿� ������� - �޸� ����Ȯ��
			TargetImage = ImageIO.read(U_InputFile);
		}
		catch(IOException e) {//���� ĳġ ������
			System.out.println(e);
		}
		
		//get image width and height �ʺ�� ���̸� �˾Ƴ�
		width = SourceImage.getWidth();
		height = SourceImage.getHeight();
		
		//�Ͼᵵȭ�� ����� make TargetImage white image
		white_color = new Color(255,255,255);//������ ���� ��� 255�� ������ ����� ���´�.
		

		
		for (column = 0; column<=height-1;column++) {//�˾Ƴ� �ʺ�� ���̷� ������ ������� ĥ����
			for (row=0;row<=width-1;row++) {
				TargetImage.setRGB(row, column, white_color.getRGB());//Ư�� �̹����� ������ �����ַ��� row, column�� ��ġ�� white_color�� ����ش�.
			}
		}
		
		
		/////////////////////////////////////////////
		//F L I P H O R I Z O N T A L   I M A G E
		/////////////////////////////////////////////
		/*
		for(column =0;column<=height-1;column++) {
			for (row = 0; row<=width-1;row++) {
				
				//read a pixel ���� �о��
				color = new Color(SourceImage.getRGB(row, column));//row, column�� Ư���� ��ġ�� �ִ� ������ �о�Ͷ�
				
				
				//write it on the targetImage
				TargetImage.setRGB(width-1-row, column, color.getRGB());//������ ����ٶ��� row�� column�� ����
			}
		}*/
		
		
		for(column =2;column<height-2;column++) {
			
			for (row = 2; row<width-2;row++) {
				
				red=0;
				green=0;
				blue=0;
				
				for(int i=-2;i<=2;i++) {
					for(int j=-2;j<=2;j++) {
						color = new Color(SourceImage.getRGB(row+i, column+j));//row, column�� Ư���� ��ġ�� �ִ� ������ �о�Ͷ�
						red+=(int)(color.getRed());//���尡 ��������´�->�����Ѵ�
						green+=(int)(color.getGreen());
						blue+=(int)(color.getBlue());
					}
				}
				
				
				
				
				new_color = new Color(red/25,green/25,blue/25);//������ ���� ��� �������
				
				
				
				for(int i=-2;i<=2;i++) {
					for(int j=-2;j<=2;j++) {
						TargetImage.setRGB(row+i, column+j, new_color.getRGB());
					}
				}
				


			}
		}
		
		
		
		
		
		
		
		//��� ����
		//write out the result image
		try {
			ImageIO.write(TargetImage,"png", U_OutputFile);
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}
