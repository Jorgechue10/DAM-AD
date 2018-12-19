package aplicacion;


import modelo.*;
import modelos.entidades.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PruebaHibernate {
	
	
	//Prueba sencilla, persiste una nueva entidad
	 
	public static void main(String[] args) throws Exception{
	
		
	try {
		
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		
		System.out.println("Creada la session Factory, se abre session");
		
		Session session = sessionFactory.openSession();
		
		System.out.println("Crea la transacción");
		
		Transaction tr = session.beginTransaction();
		
		System.out.println("Crea el modelo");
		Jugadores j = new Jugadores();
		
		// Profesor profesor=(Profesor)session.get(profesor.class,101);
		
		Equipos equipo = (Equipos)session.get(Equipos.class, "raptors");
		
		System.out.println("set variables");
		j.setNombre("Pedro Perez");
		j.setAltura("7-2");
		j.setEquipos(equipo);
		j.setPeso(225);
		j.setProcedencia("Tarazona");
		j.setCodigo(614);
		
		System.out.println("almacena el jugador");
		session.save(j);
		
		System.out.println("Commit");
		tr.commit();
		
		System.out.println("Se guardó satisfactoriamente el jugador");
		sessionFactory.close();
		
	} catch (Exception exc) {
		exc.printStackTrace();
	}
	
	
	 
	}

}
