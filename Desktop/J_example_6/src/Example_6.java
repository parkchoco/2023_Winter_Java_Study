
import java.util.Scanner;

public class Example_6 {
	public static void main(String args[]) throws CloneNotSupportedException {
		
		Scanner input = new Scanner(System.in);
		
		Television SStv = new Television();
		Television LGtv = new Television();

		
		//�ܼ�
		SStv.channel = 10;
		SStv.volume = 20;
		SStv.onoff = false;
		//�ＺƼ��� ��� ������ ���� ���� �־���
		
		
		System.out.println("SStv:");
		System.out.println("Channnel Number = " + SStv.channel);
		System.out.println("Volume = " + SStv.volume);
		
		
		//����
		//��� �Լ��� ���� ������ ���� ������ ������ ���ϴ�
		//�Ｚ�� ���� ���� �ٷ� ������
		//Television���� ��� �Լ����� ������ �����Ͽ����Ƿ� ���� �������ش�
		LGtv.SetChannel(15);
		LGtv.SetVolume(25);
		LGtv.SetOnOff(true);
		
		System.out.println();
		System.out.println("LGtv:");
		System.out.println("Channnel Number = " + LGtv.channel);
		System.out.println("Volume = " + LGtv.volume);
		
		Television HDtv = (Television)SStv.clone();//�ＺƼ���� ���� ����Ƽ�� �ִµ� �ּҰ� ���� ���� �������� ���� �������� (Television)��.clone()�� �߰��Ѵ�.
		
		System.out.println();
		System.out.println("HDtv:");
		System.out.println("Channnel Number = " + HDtv.channel);
		System.out.println("Volume = " + HDtv.volume);
		
		HDtv.SetChannel(35);
		HDtv.SetVolume(45);
		
		System.out.println();
		System.out.println("HDtv:");
		System.out.println("Channnel Number = " + HDtv.channel);
		System.out.println("Volume = " + HDtv.volume);
		
		//�Ｚ�� ������ ���� ���� ���� �������µ� ������ ���� �ּҸ� �����ϱ� �����̴�.
		System.out.println();
		System.out.println("SStv:");
		System.out.println("Channnel Number = " + SStv.channel);
		System.out.println("Volume = " + SStv.volume);
		
	}
}






/*
 *��ü ���� ����� Ư¡
 *(1) ĸ��ȭ (2) �߻�ȭ (3) ������ (4) ���->��ü���⿡�� ���� �߿��ϴ� 
 *class Ŭ���� �̸�{
 *	�ɹ� ������; ->����
 *	
 *	�ɹ� �Լ���;
 *}
 */
