public class Cocinando implements EstadoRobot{
    Robot robot;

    public Cocinando(Robot nuevoRobot){
        robot = nuevoRobot;
    }
    public void atender(){
        System.out.println("Robot cocinando, no puede atender");
        robot.menuRobotPrincipal();
    }
    public void caminar(){
        System.out.println("Robot cocinando, no puede caminar");
        robot.menuRobotPrincipal();
    }
    public void cocinar(){

        System.out.println("Robot ya cocinando tu pinche hamburguesa");
        robot.cocinaHamburgesa();
        //robot.setEstadoActual(robot.getAtendiendo());
        System.out.println("Hamburguesa entregada");
        robot.setEstadoActual(robot.getAtendiendo());
        //robot.atenderCliente();
        robot.menuRobotPrincipal();

    }
    public void suspender(){
        System.out.println("Robot cocinando, no puede suspenderse");
        robot.menuRobotPrincipal();
    }
    public void activar(){
        System.out.println("Robot ya activado");
        robot.menuRobotPrincipal();
    }
}