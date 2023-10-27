package services;

/**
 *
 * @author dafer
 */
public class CityTour implements IPaquete{
    private long idTour;
    private String nombreTour;
    private String descripcionTour;
    private String recomendaciones;
    private int duracionTour;
    
    public CityTour(){
        
    }

    public CityTour(long idTour, String nombreTour, String descripcionTour, String recomendaciones, int duracionTour) {
        this.idTour = idTour;
        this.nombreTour = nombreTour;
        this.descripcionTour = descripcionTour;
        this.recomendaciones = recomendaciones;
        this.duracionTour = duracionTour;
    }

    public long getIdTour() {
        return idTour;
    }

    public void setIdTour(long idTour) {
        this.idTour = idTour;
    }

    public String getNombreTour() {
        return nombreTour;
    }

    public void setNombreTour(String nombreTour) {
        this.nombreTour = nombreTour;
    }

    public String getDescripcionTour() {
        return descripcionTour;
    }

    public void setDescripcionTour(String descripcionTour) {
        this.descripcionTour = descripcionTour;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public int getDuracionTour() {
        return duracionTour;
    }

    public void setDuracionTour(int duracionTour) {
        this.duracionTour = duracionTour;
    }
    
    @Override
    public void imprimirInfoPaquete() {
        System.out.print("\t\t\t==== Tour "+getIdTour()+" ====\n"+
                        "\t\t\tNombre del tour: "+getNombreTour()+"\n"+
                        "\t\t\tDescripcion: "+getDescripcionTour()+"\n"+
                        "\t\t\tRecomendaciones: "+getRecomendaciones()+"\n"+
                        "\t\t\tDuracion del tour (horas): "+getDuracionTour()+"\n");
    }

    @Override
    public int calcularDuracionPaquete() {
        return duracionTour;
    }
}
