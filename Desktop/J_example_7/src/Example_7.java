//���� ������ ��ü���
//���� ���� �߻�ȭ -> public, private ����
//������-> ���� �̸� ������
//�ڹٴ� public, private�� ������ �����ָ� ��� public�̵ȴ� , c++�� �ݴ�

import java.util.Scanner;

public class Example_7 {
	public static void main(String args[]) throws CloneNotSupportedException {
		
		Scanner input = new Scanner(System.in);
		
		Television SStv = new Television(); // ������ 1���� ����ؼ� �����
		Television LGtv = new Television(15,25,false); // ������ 2���� ����ؼ� �����

		//������ 1���� ����ؼ� �����
		System.out.println();
		System.out.println("SStv:");
		System.out.println("Channnel Number = " + SStv.GetChannel());
		System.out.println("Volume = " + SStv.GetVolume());
		
		//������ 2���� ����ؼ� �����
		System.out.println();
		System.out.println("LGtv:");
		System.out.println("Channnel Number = " + LGtv.GetChannel());
		System.out.println("Volume = " + LGtv.GetVolume());
		

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
