package application;

import Entities.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {

	public static void main(String[] args) {
	
	/* 	Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquin Torres", "joaquin@gmail.com");
		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
	*/ 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		Pessoa  p = em.find(Pessoa.class, 2);

		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();


		System.out.println("Pronto");
		em.close();
		emf.close();
	}

}
