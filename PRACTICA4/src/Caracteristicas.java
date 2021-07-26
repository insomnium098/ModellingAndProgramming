public class Caracteristicas {
    private String sistema;
    private String blindaje;
    private String cabina;
    private String armas;

    public Caracteristicas(String sistema, String blindaje, String cabina, String armas){
        this.sistema = sistema;
        this.blindaje = blindaje;
        this.cabina = cabina;
        this.armas = armas;
    }
    public String getSistema() {
        return sistema;
    }
    public String getBlindaje() {
        return blindaje;
    }
    public String getCabina() {
        return cabina;
    }
    public String getArmas() {
        return armas;
    }


}
