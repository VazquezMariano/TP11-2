import java.util.Comparator;

public class ComparadorFecha implements Comparator<ElementoSA> {

	@Override
	public int compare(ElementoSA arg0, ElementoSA arg1) {
		return arg0.getFechaCreacion().compareTo(arg1.getFechaCreacion());
	}

}
