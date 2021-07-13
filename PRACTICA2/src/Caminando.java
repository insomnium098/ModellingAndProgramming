public class Caminando implements EstadoRobot{
    Robot robot;

    public Caminando(Robot nuevoRobot){
        robot = nuevoRobot;
        //this.atender();
    }
    public void atender(){
        System.out.println("Robot caminando, no puede atender");
        robot.menuRobotPrincipal();
        //System.out.println("Robot atendiendo");
        ///Aqui implementar la seleccion del menu



        /////
        //robot.setEstadoActual(robot.getCocinando());
        //robot.cocinarHamburguesa();
    }
    public void caminar(){

        System.out.println("Robot caminando");
        robot.setEstadoActual(robot.getAtendiendo());
        robot.atenderCliente();

    }
    public void cocinar(){
        System.out.println("Robot caminado, no puede cocinar");
        robot.menuRobotPrincipal();
    }
    public void suspender(){
        robot.setEstadoActual(robot.getSuspendido());
        System.out.println("Robot suspendido");
    }
    public void activar(){
        System.out.println("Robot ya activado");
        robot.menuRobotPrincipal();
    }
}