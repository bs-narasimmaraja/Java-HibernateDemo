package hibernatedemo;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class establishconnection {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		System.out.println("connection established");
	}
}
