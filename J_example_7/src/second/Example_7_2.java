package second;

//���� ������ ��ü���
//���� ���� �߻�ȭ -> public, private ����
//������-> ���� �̸� ������
//�ڹٴ� public, private�� ������ �����ָ� ��� public�̵ȴ� , c++�� �ݴ�

import java.util.Scanner;

public class Example_7_2 {
	public static void main(String args[]) throws CloneNotSupportedException {
		
		Scanner input = new Scanner(System.in);
		
		Television SStv = new Television(); // ������ 1���� ����ؼ� �����
		Television LGtv = new Television(15,25,false); // ������ 2���� ����ؼ� �����

		OLED HDtv = new OLED();
		OLED SKtv = new OLED(17, 27, false,      4, 5, true);
		//���� ������ television�� ���� �Ӽ� �ڿ� ������ OLED�� ���� �Ӽ�
		
		
		//Television ������ 1���� ����ؼ� �����
		System.out.println();
		System.out.println("SStv:");
		System.out.println("Channnel Number = " + SStv.GetChannel());
		System.out.println("Volume = " + SStv.GetVolume());
		SStv.PrintClassName();
		
		//Television ������ 2���� ����ؼ� �����
		System.out.println();
		System.out.println("LGtv:");
		System.out.println("Channnel Number = " + LGtv.GetChannel());
		System.out.println("Volume = " + LGtv.GetVolume());
		LGtv.PrintClassName();
		
		System.out.println();
		System.out.println("HDtv:");
		System.out.println("Channnel Number = " + HDtv.GetChannel());
		System.out.println("Volume = " + HDtv.GetVolume());
		System.out.println("USB = " + HDtv.GetUSB());
		System.out.println("HDMI = " + HDtv.GetHDMI());
		HDtv.PrintClassName();
		
		System.out.println();
		System.out.println("SKtv:");
		System.out.println("Channnel Number = " + SKtv.GetChannel());
		System.out.println("Volume = " + SKtv.GetVolume());
		System.out.println("USB = " + SKtv.GetUSB());
		System.out.println("HDMI = " + SKtv.GetHDMI());
		SKtv.PrintClassName();
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
