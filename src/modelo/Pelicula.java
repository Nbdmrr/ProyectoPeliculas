package modelo;

import java.time.LocalDate;

public class Pelicula {
private String nombre;
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
