public class Caminando implements EstadoRobot{
    Robot robot;

    public Suspendido(Robot nuevoRobot){
        robot = nuevoRobot;
    }
    public void atender(){
        System.out.println("Robot caminando, no puede atender");
    }
    public void caminar(){
        System.out.println("Robot caminando, no puede caminar (otra vez)");
    }
    public void cocinar(){
        System.out.println("Robot caminado, no puede cocinar");
    }
    public void suspender(){
        System.out.println("Robot suspendido");
    }
    public void activar(){
        System.out.println("Robot ya activado");
    }
}