package services;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dafer
 */
public class PaqueteContinental implements IPaquete{
    
    private String nombreContinente;
    private List<IPaquete> paquetes;
    
    public PaqueteContinental(){
        this.paquetes = new ArrayList<>();
    }

    public PaqueteContinental(String nombreContinente) {
        this.nombreContinente = nombreContinente;
        this.paquetes = new ArrayList<>();
    }

    
    public PaqueteContinental(String nombreContinente, List<IPaquete> paquetesPaises) {
        this.nombreContinente = nombreContinente;
        this.paquetes = paquetesPaises;
    }

    public String getNombreContinente() {
        return nombreContinente;
    }

    public void setNombreContinente(String nombreContinente) {
        this.nombreContinente = nombreContinente;
    }

    public List<IPaquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(List<IPaquete> paquetes) {
        this.paquetes = paquetes;
    }
    
    @Override
    public void imprimirInfoPaquete() {
        System.out.print("=== Viaje al continente "+getNombreContinente()+" ===\n");
        for(IPaquete paquete: paquetes){
            paquete.imprimirInfoPaquete();
        }
    }

    @Override
    public int calcularDuracionPaquete() {
        int duracionPaquete = 0;
        for(IPaquete paquete: paquetes){
            duracionPaquete+=paquete.calcularDuracionPaquete();
        }
        return duracionPaquete;
    }

    public void agregarPaquete(IPaquete paquete) {
        paquetes.add(paquete);
    }
    
}
