import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Directorio extends ElementoSA {
	private ArrayList<ElementoSA> elementos;

	public Directorio(String s) {
		super(s);
		this.elementos = new ArrayList<>();
	}

	@Override
	public ArrayList<ElementoSA> busqueda(Filtro f, Comparator<ElementoSA> c) {
		ArrayList<ElementoSA> resultado = new ArrayList<>();
		for(ElementoSA el : this.elementos) {
			if(f.cumple(el)) {
				resultado.add(el.getCopia());
			}
		}
		Collections.sort(resultado, c);
		return resultado;
	}
	
	public void agregarElemento(ElementoSA e) {
		this.elementos.add(e);
	}

	@Override
	public int getTamanio() {
		int tam = 0;
		for(ElementoSA e : this.elementos) {
			tam = tam + e.getTamanio();
		}
		return tam;
	}

	@Override
	public ElementoSA getCopia() {
		//esto no lo use, no se si esta bien o que
		ElementoSA d = new Directorio(this.getNombre());
		for(ElementoSA el : this.elementos) {
			((Directorio) d).agregarElemento(el.getCopia());
		}
		return d;
	}
	

}
