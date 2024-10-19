import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public abstract class ElementoSA {
private String nombre;
private LocalDate fechaCreacion;

public ElementoSA(String s) {
	setNombre(s);
	setFechaCreacion(LocalDate.now());
}

//getters setters
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public LocalDate getFechaCreacion() {
	return fechaCreacion;
}
public void setFechaCreacion(LocalDate fechaCreacion) {
	this.fechaCreacion = fechaCreacion;
}
//metodos abstractos
public abstract ArrayList<ElementoSA> busqueda(Filtro f, Comparator<ElementoSA> c);

public abstract int getTamanio();

public abstract ElementoSA getCopia();


}
