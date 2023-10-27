package main;

import java.util.Date;
import services.*;

/**
 *
 * @author dafer
 */
public class Main {
    public static void main(String [] args){
        PaqueteContinental continente1 = new PaqueteContinental("America");
        PaqueteContinental continente2 = new PaqueteContinental("Asia");
       
        PaquetePais pais1 = new PaquetePais("Colombia");
        PaquetePais pais2 = new PaquetePais("Mexico");
        
        PaqueteCiudad ciudad1 = new PaqueteCiudad("Bogota", "Vuelo 401", "Hotel San Martin", "Menu 1",
                                                  new Date(2023,1,1), new Date(2023,1,2));
        PaqueteCiudad ciudad2 = new PaqueteCiudad("Ciudad de Mexico", "Vuelo 402", "Hotel San Pedro", "Menu 2",
                                                  new Date(2023, 2, 1), new Date(2023, 2, 2));
        
        CityTour cityTour1 = new CityTour(1, "Monserrate", "Senderismo al cerro de Monserrate",
                                        "Llevar abrigo", 4);
        CityTour cityTour2 = new CityTour(2, "Bellas Artes", "Visita al palacio de Bellas Artes", 
                                          "Comer tacos", 5);
        
        ciudad1.agregarPaquete(cityTour1);
        ciudad2.agregarPaquete(cityTour2);
        pais1.agregarPaquete(ciudad1);
        pais2.agregarPaquete(ciudad2);
        continente1.agregarPaquete(pais1);
        continente1.agregarPaquete(pais2);
        continente1.imprimirInfoPaquete();
        System.out.println("Duracion del viaje: "+ continente1.calcularDuracionPaquete());
        
        
        /*
        ciudad2.agregarPaquete(cityTour2);
        pais2.agregarPaquete(ciudad2);
        continente2.agregarPaquete(pais2);
        continente2.imprimirInfoPaquete();
        System.out.println("Duracion del viaje: "+ continente2.calcularDuracionPaquete());
        */
    }
}
