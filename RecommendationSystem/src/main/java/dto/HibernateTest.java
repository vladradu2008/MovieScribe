package dto;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class HibernateTest {

	public static void main(String[] args) {
//		SessionFactory sessionFactory = new Configuration()
//			.configure().buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//		
//		UserDetails user;
//		
//		for (int i = 0; i < 5; i++) {
//			user = new UserDetails();
//			user.setFirstName("User" + i);
//			session.save(user);
//		}
//		
//		Movie movie;
//		
//		List<UserDetails> users = session.createCriteria(UserDetails.class)
//				.list();
//		
//		for (int i = 0; i < 10; i++) {
//			movie = new Movie();
//			movie.setTitle("Movie" + i); 
//			movie.setRating(i);
//			for (int j = 0; j < users.size(); j += (i%2) + 1) {							
//				user = users.get(j);
//				user.getMovies().add(movie);
//				movie.getUsers().add(user);
//			}
//			session.save(movie);
//		}
//		
//		session.getTransaction().commit();
//		session.close();
	}																																																																						

}
