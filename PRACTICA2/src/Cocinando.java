public class Cocinando implements EstadoRobot{
    Robot robot;

    public Suspendido(Robot nuevoRobot){
        robot = nuevoRobot;
    }
    public void atender(){
        System.out.println("Robot cocinando, no puede atender");
    }
    public void caminar(){
        System.out.println("Robot cocinando, no puede caminar");
    }
    public void cocinar(){
        System.out.println("Robot ya cocinando");
    }
    public void suspender(){
        System.out.println("Robot cocinando, no puede suspenderse");
    }
    public void activar(){
        System.out.println("Robot ya activado");
    }
}