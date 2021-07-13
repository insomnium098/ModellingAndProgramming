public class Suspendido implements EstadoRobot{
    Robot robot;

    public Suspendido(Robot nuevoRobot){
        robot = nuevoRobot;
    }
    public void atender(){
        System.out.println("Robot suspendido, no puede atender");
        robot.menuRobotPrincipal();
    }
    public void caminar(){
        System.out.println("Robot suspendido, no puede caminar");
        robot.menuRobotPrincipal();
    }
    public void cocinar(){
        System.out.println("Robot suspendido, no puede cocinar");
        robot.menuRobotPrincipal();
    }
    public void suspender(){
        System.out.println("Robot suspendido, no puede suspenderse (otra vez)");
        robot.menuRobotPrincipal();
    }
    public void activar(){
        System.out.println("Robot activado");
        robot.setEstadoActual(robot.getCaminando());
        robot.caminarToCliente();
    }

}