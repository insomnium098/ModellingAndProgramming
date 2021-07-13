public class Atendiendo implements EstadoRobot{
    Robot robot;

    public Suspendido(Robot nuevoRobot){
        robot = nuevoRobot;
    }
    public void atender(){
        System.out.println("Robot atendiendo, no puede atender a alguien mas");
    }
    public void caminar(){
        System.out.println("Robot atendiendo, no puede caminar");
    }
    public void cocinar(){
        System.out.println("Robot cocinando");
    }
    public void suspender(){
        System.out.println("Robot atendiendo, no puede suspenderse");
    }
    public void activar(){
        System.out.println("Robot ya activado");
    }
}