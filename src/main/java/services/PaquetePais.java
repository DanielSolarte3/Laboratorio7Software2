package services;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dafer
 */
public class PaquetePais extends PaqueteContinental{

    private String nombrePais;
    private List<IPaquete> paquetesCiudades;
    
    public PaquetePais(){
        this.paquetesCiudades = new ArrayList<>();
    }

    public PaquetePais(String nombrePais) {
        this.nombrePais = nombrePais;
        this.paquetesCiudades = new ArrayList<>();
    }
    
    public PaquetePais(String nombrePais, List<IPaquete> paquetesCiudades) {
        this.nombrePais = nombrePais;
        this.paquetesCiudades = paquetesCiudades;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public List<IPaquete> getPaquetesCiudades() {
        return paquetesCiudades;
    }

    public void setPaquetesCiudades(List<IPaquete> paquetesCiudades) {
        this.paquetesCiudades = paquetesCiudades;
    }
    
    @Override
    public void imprimirInfoPaquete() {
        System.out.print("\t=== Viaje al pais "+getNombrePais()+" ===\n");
        for(IPaquete paquete: paquetesCiudades){
            paquete.imprimirInfoPaquete();
        }
    }

    @Override
    public int calcularDuracionPaquete() {
        int duracion = 0;
        for(IPaquete paquete: paquetesCiudades){
            duracion+=paquete.calcularDuracionPaquete();
        }
        return duracion;
    }
    
    @Override
    public void agregarPaquete(IPaquete paquete) {
        paquetesCiudades.add(paquete);
    }
    
}
