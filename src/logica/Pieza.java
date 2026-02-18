package logica;

public abstract class Pieza {

		protected int fila;
		protected int columna;
		
		
		public Pieza(int fila, int columna) throws Exception {
			setFila(fila);
			setColumna(columna);
			
		}


		public int getFila() {
			return fila;
		}


		public void setFila(int fila) throws Exception{
			if (fila>8 || fila < 1) {
				throw new Exception("Fila fuera del tablero");
			}
			this.fila = fila;
		}


		public int getColumna() {
			return columna;
		}


		public void setColumna(int columna) throws Exception{
			if (columna>8 || columna < 1) {
				throw new Exception("Columna fuera del tablero");
			}
			this.columna = columna;
		}
		
		
		public abstract int CantidadDeMovimientos();
		
}
