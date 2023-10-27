package services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author dafer
 */
public class PaqueteCiudad extends PaquetePais{
    private String nombreCiudad;
    private String vueloLlegada;
    private String hotel;
    private String planAlimentacion;
    private Date fechaCheckIn;
    private Date fechaCheckOut;
    private List<IPaquete> cityTours;
    
    public PaqueteCiudad(){
        this.cityTours = new ArrayList<>();
    }

    public PaqueteCiudad(String nombreCiudad, String vueloLlegada, String hotel, String planAlimentacion, Date fechaCheckIn, Date fechaCheckOut) {
        this.nombreCiudad = nombreCiudad;
        this.vueloLlegada = vueloLlegada;
        this.hotel = hotel;
        this.planAlimentacion = planAlimentacion;
        this.fechaCheckIn = fechaCheckIn;
        this.fechaCheckOut = fechaCheckOut;
        this.cityTours = new ArrayList<>();
    }
    
    public PaqueteCiudad(String nombreCiudad, String vueloLlegada, String hotel, String planAlimentacion, Date fechaCheckIn, Date fechaCheckOut, List<IPaquete> cityTours) {
        this.nombreCiudad = nombreCiudad;
        this.vueloLlegada = vueloLlegada;
        this.hotel = hotel;
        this.planAlimentacion = planAlimentacion;
        this.fechaCheckIn = fechaCheckIn;
        this.fechaCheckOut = fechaCheckOut;
        this.cityTours = cityTours;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getVueloLlegada() {
        return vueloLlegada;
    }

    public void setVueloLlegada(String vueloLlegada) {
        this.vueloLlegada = vueloLlegada;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getPlanAlimentacion() {
        return planAlimentacion;
    }

    public void setPlanAlimentacion(String planAlimentacion) {
        this.planAlimentacion = planAlimentacion;
    }

    public Date getFechaCheckIn() {
        return fechaCheckIn;
    }

    public void setFechaCheckIn(Date fechaCheckIn) {
        this.fechaCheckIn = fechaCheckIn;
    }

    public Date getFechaCheckOut() {
        return fechaCheckOut;
    }

    public void setFechaCheckOut(Date fechaCheckOut) {
        this.fechaCheckOut = fechaCheckOut;
    }

    
    public List<IPaquete> getCityTours() {
        return cityTours;
    }
    

    public void setCityTours(List<IPaquete> cityTours) {
        this.cityTours = cityTours;
    }
    
    @Override
    public void imprimirInfoPaquete() {
        System.out.print("\t\t=== Viaje a la ciudad de "+getNombreCiudad()+" ===\n");
        for(IPaquete paquete: cityTours){
            paquete.imprimirInfoPaquete();
        }
    }

    @Override
    public int calcularDuracionPaquete() {
        int duracion = 0;
        for(IPaquete paquete: cityTours){
            duracion+=paquete.calcularDuracionPaquete();
        }
        return duracion;
    }
    
    @Override
    public void agregarPaquete(IPaquete paquete) {
        cityTours.add(paquete);
    }
}
