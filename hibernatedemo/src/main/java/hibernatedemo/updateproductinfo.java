package hibernatedemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class updateproductinfo {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		product p=new product();
		p.setId(3);
		p.setBrand("puma");
		p.setType("shoes");
		p.setCost(100);
		
		et.begin();
		em.merge(p);
		et.commit();
	}
}
