import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<ElementoSA> {
	private Comparator<ElementoSA> com1;
	private Comparator<ElementoSA> com2;
	
	public ComparadorCompuesto(Comparator<ElementoSA>  c1, Comparator<ElementoSA> c2) {
		this.com1 = c1;
		this.com2 = c2;
	}
	

	@Override
	public int compare(ElementoSA o1, ElementoSA o2) {
		int rta = com1.compare(o1, o2);
		if(rta == 0) {
			return com2.compare(o1,o2);
		}
		return rta;
	}

}
