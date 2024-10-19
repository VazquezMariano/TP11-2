
public class FiltroContienePalabra extends Filtro {
	private String palabra;
	
	public FiltroContienePalabra(String pal) {
		this.palabra = pal;
	}

	@Override
	public boolean cumple(ElementoSA e) {
		return e.getNombre().contains(palabra);
	}

}
