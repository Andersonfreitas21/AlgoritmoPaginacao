package algoritmoTrocadePaginas;

import java.util.ArrayList;

public class Quadro {
	private int numQuadros;
	private int seqdePaginas[] = new int[10];

	public int getNumQuadros() {
		return numQuadros;
	}

	public void setNumQuadros(int numQuadros) {
		if(numQuadros < 0) {
			System.out.println("Quadro inválido.");
		}
		this.numQuadros = numQuadros;
	}

	public int[] getSeqdePaginas() {
		return seqdePaginas;
	}

	public void setSeqdePaginas(int[] seqdePaginas) {
		this.seqdePaginas = seqdePaginas;
	}
}
