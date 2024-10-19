import java.util.ArrayList;
import java.util.Comparator;

public class Link extends ElementoSA {
	private final int disco = 1;
	
	public Link(String s) {
		super(s);
	}

	public int getDisco() {
		return disco;
	}

	@Override
	public int getTamanio() {
		return disco;
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
	public ElementoSA getCopia() {
		ElementoSA rta = new Link(this.getNombre());
		return rta;
	}

}
