package modelo;

import java.util.ArrayList;
import java.text.Normalizer;
import java.time.LocalDate;

public class Catalogo {
	private ArrayList<Pelicula> catalogoPeliculas;
	private double duracion;
	
	public Catalogo() {
	catalogoPeliculas= new ArrayList<Pelicula>();
		duracion = calcularHorasCatalogo();
	}
	
	public void añadirPelicula(Pelicula peliculaAIngresar) {
		LocalDate actual = LocalDate.now();
		LocalDate haceUnAño = actual.minusYears(1);
		if (peliculaAIngresar.getFechaEstreno().isBefore(haceUnAño)) {
		System.out.println("LA PELICULA NO SE PUEDE INGRESAR PORQUE TIENE FECHA DE ESTRENO DE MAS DE UN AÑO");	
		
		}
		else {
		for (int i=0 ;i< catalogoPeliculas.size(); i++) {
		if (peliculaAIngresar.getIdPelicula()== catalogoPeliculas.get(i).getIdPelicula()) {
			System.out.println("OTRA PELICULA YA TIENE ESE ID");
			return;
		}	
		}
			catalogoPeliculas.add(peliculaAIngresar);	
			System.out.println("LA PELICULA FUE AGREGADA CORRECTAMENTE");	
		}
	}
	
	
	
	
	
	
	
	public Pelicula buscarPorNombre(String nombreIngresado) {
		
	}
	
	
	
	public ArrayList <Pelicula> peliculasPorGenero(String genero){
		
	}
	
	
	
	
	
	
	
	
	
	
	public static String normalizar(String texto) {
	        texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
	        texto = texto.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
	        return texto.toLowerCase();
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
