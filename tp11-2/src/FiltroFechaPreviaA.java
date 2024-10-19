import java.time.LocalDate;

public class FiltroFechaPreviaA extends Filtro{
	private LocalDate fecha;
	
	public FiltroFechaPreviaA(int y, int m, int d) {
		this.fecha = LocalDate.of(y, m, d);
	}

	@Override
	public boolean cumple(ElementoSA e) {
		return e.getFechaCreacion().isBefore(fecha);
	}

}
