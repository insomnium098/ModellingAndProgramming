public class Atendiendo implements EstadoRobot{
    Robot robot;

    public Atendiendo(Robot nuevoRobot){
        robot = nuevoRobot;
    }
    public void atender(){

        System.out.println("Que pinche hamburguesa quieres?");
        //robot.setEstadoActual(robot.getCocinando());

        MenuItem item = robot.clienteEligeMenu();
        robot.setHamburguesaItem(item);
        robot.setEstadoActual(robot.getCocinando());
        robot.cocinarHamburguesa();

    }
    public void caminar(){
        System.out.println("Robot atendiendo, no puede caminar");
        robot.menuRobotPrincipal();
    }
    public void cocinar(){
        System.out.println("Robot atendiendo, no puede cocinar");
        robot.menuRobotPrincipal();
        //System.out.println("Robot cocinando");
        //robot.cocinarHamburguesa();
    }
    public void suspender(){
        System.out.println("Robot atendiendo, no puede suspenderse");
        robot.menuRobotPrincipal();
    }
    public void activar(){ System.out.println("Robot ya activado");
        robot.menuRobotPrincipal();
    }
}