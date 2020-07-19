package org.prac;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Study {

public static void main(String[] args) {
List <Integer> li = new ArrayList <Integer>();
li.add(20);
li.add(30);
li.add(50);
li.add(80);
li.add(40);
System.out.println(li);
int l1=li.size();
System.out.println(l1);
	Integer i = li.get(3);
	System.out.println(i);
	li.add(3,90);
	
	System.out.println(li);	
	li.remove(3);
	System.out.println(li);
	li.set(3, 100);
	System.out.println(li);
	List<Integer>n=new LinkedList<Integer>();
	System.out.println(n);
	boolean b = n.isEmpty();
	System.out.println(b);
	n.add(20);
	n.add(50);
	n.add(80);
	n.add(70);
	System.out.println(n);
	n.addAll(li);
	System.out.println(n);
	n.retainAll(li);
	System.out.println(n);
	
	
}
	
	
	


}

