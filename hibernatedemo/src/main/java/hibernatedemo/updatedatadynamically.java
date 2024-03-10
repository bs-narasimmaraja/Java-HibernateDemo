package hibernatedemo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class updatedatadynamically {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id to update");
		int id=sc.nextInt();
		
		System.out.println("enter new brand");
		String brand=sc.next();
		
		product p=em.find(product.class,id);
		p.setBrand(brand);
		
		et.begin();
		em.merge(p);
		et.commit();
		
		System.out.println("data updated successfully");
		
	}
}
