//���׸�Ŭ����?
//��� ����Ʈ? �پ��� ������ �ڷ����� �Ѳ����� ����� �� �ִ�.

import java.util.Scanner;
import java.util.*;
import java.util.Vector;

public class Example_8 {
	public static void main(String args[]) throws CloneNotSupportedException{
		Scanner scanner = new Scanner(System.in);
		
		Vector v = new Vector();
		int i;
		
		//���Ϳ� ���� �Ǽ� �ڷ������� �پ��ϰ� �����ִ�.
		v.add(10);
		v.add(15.5);
		v.add("Good Morning");
		//size()��� ��� �Լ��� �ִ�
		//������ ũ�⸦ ����� ���� �� �� �ִ�.
		System.out.println("Vector Size = " + v.size());
		System.out.println();
		//�ش�Ǵ� ������ �̾ƿ��� ���� get()�� ���
		for(i=0;i<=v.size()-1;i++) {
			System.out.println("Vector v[" + i + "] = " + v.get(i));
		}
		System.out.println();
		
		
		
		
		
		//�߰��� �������� 1�� ���Ϳ� 2�� ���� ���̰� ������ �� ���� 2�� �ڸ��� Hello�� ����.
		v.add(2,"Hello");
		
		//size()��� ��� �Լ��� �ִ�
		//������ ũ�⸦ ����� ���� �� �� �ִ�.
		System.out.println("Vector Size = " + v.size());
		System.out.println();
		//�ش�Ǵ� ������ �̾ƿ��� ���� get()�� ���
		for(i=0;i<=v.size()-1;i++) {
		System.out.println("Vector v[" + i + "] = " + v.get(i));
		}
		System.out.println();
		
	}
}
