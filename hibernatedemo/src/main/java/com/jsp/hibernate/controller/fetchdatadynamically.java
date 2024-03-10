package com.jsp.hibernate.controller;

import java.util.Scanner;

import com.jsp.hibernate.dao.StudentDao;

public class fetchdatadynamically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		int id=sc.nextInt();
		
		StudentDao dao=new StudentDao();
		

}
}
