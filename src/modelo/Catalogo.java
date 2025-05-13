package modelo;

import java.util.ArrayList;

public class Catalogo {
	private ArrayList<Pelicula> catalogoPeliculas;
	private double duracion;
	
	public Catalogo() {
	catalogoPeliculas= new ArrayList<Pelicula>();
	
		
		duracion = calcularHorasCatalogo();
		
		
	}
	
	
	
	public double calcularHorasCatalogo() {
		
		double horasCatalogo = 0;
		
		for (Pelicula pelicula : catalogoPeliculas) {
			
			double horasPelicula = pelicula.duracionEnHoras;
			
			horasCatalogo+=horasPelicula;
			
			
		}
		return horasCatalogo;
		
		
	}
	
	

}
