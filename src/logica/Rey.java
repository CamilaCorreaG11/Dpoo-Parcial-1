package logica;

public class Rey extends Pieza{

	public Rey(int fila, int columna) throws Exception {
		super(fila, columna);
	}

	
	
	int movimientos = 0;
	@Override
	public int CantidadDeMovimientos() {
		if ((this.fila == 1 || this.fila==8) && (this.columna == 8 || this.columna == 1)){
			movimientos = 3;
		}

		else if(this.fila == 1 || this.fila == 8 || this.columna == 1 || this.columna ==8) {
			movimientos = 5;
			
		}
		else {
			movimientos = 8;
		}
		
		return movimientos;
	}

	

	
}
