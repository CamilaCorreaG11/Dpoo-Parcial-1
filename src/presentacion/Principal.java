package presentacion;
import logica.Peon;
import logica.Pieza;
import logica.Rey;
import logica.Torre;


public class Principal {

	public Principal() {
		
		Pieza p;
		try {
			p = new Peon(2,7);
			System.out.println(p.CantidadDeMovimientos());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			p = new Rey(2,7);
			System.out.println(p.CantidadDeMovimientos());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			p = new Peon(6,7);
			System.out.println(p.CantidadDeMovimientos());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			p = new Torre(2,7);
			System.out.println(p.CantidadDeMovimientos());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			p = new Torre(9,7);
			System.out.println(p.CantidadDeMovimientos());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		new Principal();
	}

}
