package hibernatedemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class priductdriver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		product p=new product();
		p.setId(1);
		p.setBrand("puma");
		p.setType("shoes");
		p.setCost(100);
		
		product p1=new product();
		p1.setId(2);
		p1.setBrand("adidas");
		p1.setType("shoes1");
		p1.setCost(1000);
		
		et.begin();
		em.persist(p);
		em.persist(p1);
		et.commit();
	}
}
