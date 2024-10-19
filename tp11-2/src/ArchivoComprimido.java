import java.util.ArrayList;
import java.util.Comparator;

public class ArchivoComprimido extends Directorio {
	private int tasaCompresion;

	public ArchivoComprimido(String s, int tasa) {
		super(s);
		setTasaCompresion(tasa);
	}

	public int getTasaCompresion() {
		return tasaCompresion;
	}

	public void setTasaCompresion(int tasaCompresion) {
		this.tasaCompresion = tasaCompresion;
	}

	public int getTamanio() {
		return (super.getTamanio() * tasaCompresion);
	}
	public ArrayList<ElementoSA> busqueda(Filtro f, Comparator<ElementoSA> c){
		ArrayList<ElementoSA> rta = super.busqueda(f, c);
		ArrayList<ElementoSA> resultado = new ArrayList<>();
		
		if(!(rta.isEmpty())) {
			resultado.add(new ArchivoComprimido(this.getNombre(), this.getTasaCompresion()));
			return resultado;
		} else {
			return null;
		}
	}
}
