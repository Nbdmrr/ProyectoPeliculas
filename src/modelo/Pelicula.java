package modelo;

import java.time.LocalDate;

public class Pelicula {
private String nombre;
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public LocalDate getFechaEstreno() {
	return fechaEstreno;
}

public void setFechaEstreno(LocalDate fechaEstreno) {
	this.fechaEstreno = fechaEstreno;
}

public int getIdPelicula() {
	return idPelicula;
}

public void setIdPelicula(int idPelicula) {
	this.idPelicula = idPelicula;
}

public String getGenero() {
	return genero;
}

public void setGenero(String genero) {
	this.genero = genero;
}

public int getCalificacion() {
	return calificacion;
}

public void setCalificacion(int calificacion) {
	this.calificacion = calificacion;
}

public double getDuracionEnHoras() {
	return duracionEnHoras;
}

public void setDuracionEnHoras(double duracionEnHoras) {
	this.duracionEnHoras = duracionEnHoras;
}

private LocalDate fechaEstreno;
private int idPelicula;
private String genero;
private int calificacion;
public double duracionEnHoras;

public Pelicula(String nombre, LocalDate fechaEstreno, int idPelicula, String genero, int calificacion, double duracionEnHoras) {
	this.nombre=nombre;
	this.fechaEstreno=fechaEstreno;
	this.idPelicula=idPelicula;
	this.genero=genero;
	this.calificacion=calificacion;
	this.duracionEnHoras=duracionEnHoras;
}

}
