package logica;

public class Peon extends Pieza {

	public Peon(int fila, int columna) throws Exception {
		super(fila, columna);
	}

	
	private int movimientos = 0;
	@Override
	public int CantidadDeMovimientos() {
		
		if (this.fila==2) {movimientos = 2;}
		else if (this.fila ==8) {movimientos = 0;}
			
		else {movimientos = 1;}
		return movimientos;
	}
	
}
