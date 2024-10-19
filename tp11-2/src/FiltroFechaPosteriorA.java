import java.time.LocalDate;

public class FiltroFechaPosteriorA extends Filtro {
	private LocalDate fecha;
	
	public FiltroFechaPosteriorA(int y, int m, int d) {
		this.fecha = LocalDate.of(y, m, d);
	}

	@Override
	public boolean cumple(ElementoSA e) {
		return e.getFechaCreacion().isAfter(fecha);
	}

}
