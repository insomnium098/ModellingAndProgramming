public class Suspendido implements EstadoRobot{
    Robot robot;

    public Suspendido(Robot nuevoRobot){
        robot = nuevoRobot;
    }
    public void atender(){
        System.out.println("Robot suspendido, no puede atender");
    }
    public void caminar(){
        System.out.println("Robot suspendido, no puede caminar");
    }
    public void cocinar(){
        System.out.println("Robot suspendido, no puede cocinar");
    }
    public void suspender(){
        System.out.println("Robot suspendido, no puede suspenderse (otra vez)");
    }
    public void activar(){
        System.out.println("Robot activado");
    }

}