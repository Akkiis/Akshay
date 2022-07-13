package collection;

import java.util.ArrayList;

public class ArrayListStudy {

	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList<>();
		
		
		a.add("Akshay");   //0
		a.add('A');       //1
		a.add(2428);      //2
		a.add(true);      //3   
		a.add(2428.24f);  //4 
		a.add("Akshay"); //5
		a.add(null);     //6
		a.add(2428);     //7
		a.add(null);     //8
		
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.contains(123));
		System.out.println(a.get(1));
		System.out.println(a.indexOf(123));
		System.out.println(a.indexOf("Velocity"));
		System.out.println(a.lastIndexOf("Velocity"));
		System.out.println(a.remove(1));
		System.out.println(a);
		
		
		for(int i=0;i<=a.size()-1;i++)
		{
			System.out.println(a.get(i));
		}
		
		
		

	}

}
