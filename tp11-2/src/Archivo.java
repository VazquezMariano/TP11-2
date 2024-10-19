import java.util.ArrayList;
import java.util.Comparator;

public class Archivo extends ElementoSA {
	private int tamanio;

	public Archivo(String s, int tam) {
		super(s);
		setTamanio(tam);
	}

	@Override
	public ArrayList<ElementoSA> busqueda(Filtro f, Comparator<ElementoSA> c) {
		ArrayList<ElementoSA> resultado = new ArrayList<>();
		if(f.cumple(this)) {
			resultado.add(this.getCopia());
		}
		return resultado;
	}

	@Override
	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	@Override
	public ElementoSA getCopia() {
		ElementoSA rta = new Archivo(this.getNombre(), this.getTamanio());
		return rta;
	}

}
