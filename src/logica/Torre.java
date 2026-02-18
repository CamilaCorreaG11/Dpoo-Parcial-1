package logica;

public class Torre extends Pieza{

	public Torre(int fila, int columna) throws Exception {
		super(fila, columna);
	}
	
	
	@Override
	public int CantidadDeMovimientos() {
		return 14;
	}


	
}
