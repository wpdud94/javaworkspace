package oop.javadoc.test;

import oop.javadoc.JavaComment;


public class JavaCommentTest {

	public static void main(String[] args) {
		JavaComment jc = new JavaComment();
		
		System.out.println(jc);
		
		jc.name = "HA";// 한글
		System.out.println(jc.scoreSum(100, 100)) ; //Method calling
	
		
	}

}
