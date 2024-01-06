//제네릭클래스?
//어레이 리스트? 다양한 종류의 자료형을 한꺼번에 사용할 수 있다.

import java.util.Scanner;
import java.util.*;


public class Example_8_2 {
	public static void main(String args[]) throws CloneNotSupportedException{
		Scanner scanner = new Scanner(System.in);
		
		//스트링 형태의 어레이리스트이다.
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
		
		
		//set 사용하여 추가시 사이즈는 그대로지만 2번째 Bread가 Sweet이 된다.
		//update
		list.set(2, "Sweet");
		
		
		System.out.println("ArrayList Size = " + list.size());
		System.out.println();
		
		for(i=0;i<=list.size()-1;i++) {
			System.out.println("ArrayList list["+i+"] = " + list.get(i));
		}
		System.out.println();
		
		
		//remove를 통해 1번 Apple을 제거하라
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
