//���׸�Ŭ����?
//��� ����Ʈ? �پ��� ������ �ڷ����� �Ѳ����� ����� �� �ִ�.

import java.util.Scanner;
import java.util.*;


public class Example_8_2 {
	public static void main(String args[]) throws CloneNotSupportedException{
		Scanner scanner = new Scanner(System.in);
		
		//��Ʈ�� ������ ��̸���Ʈ�̴�.
		ArrayList <String> list = new ArrayList<String>();
		
		int i;
		int index_number;
		
		list.add("Milk");
		list.add("Bread");
		list.add("Butter");
		
		
		
		
		
		System.out.println("ArrayList Size = " + list.size());
		System.out.println();
		
		for(i=0;i<=list.size()-1;i++) {
			System.out.println("ArrayList list["+i+"] = " + list.get(i));
		}
		System.out.println();
		
		//include
		list.add(1, "Apple");
		

		System.out.println("ArrayList Size = " + list.size());
		System.out.println();
		
		for(i=0;i<=list.size()-1;i++) {
			System.out.println("ArrayList list["+i+"] = " + list.get(i));
		}
		System.out.println();
		
		
		//set ����Ͽ� �߰��� ������� �״������ 2��° Bread�� Sweet�� �ȴ�.
		//update
		list.set(2, "Sweet");
		
		
		System.out.println("ArrayList Size = " + list.size());
		System.out.println();
		
		for(i=0;i<=list.size()-1;i++) {
			System.out.println("ArrayList list["+i+"] = " + list.get(i));
		}
		System.out.println();
		
		
		//remove�� ���� 1�� Apple�� �����϶�
		//remove
		list.remove(1);
		
		System.out.println("ArrayList Size = " + list.size());
		System.out.println();
		
		for(i=0;i<=list.size()-1;i++) {
			System.out.println("ArrayList list["+i+"] = " + list.get(i));
		}
		System.out.println();
		
		
		//find index
		index_number = list.indexOf("Sweet");
		System.out.println("Index Number = " + index_number);
		
	}
}
