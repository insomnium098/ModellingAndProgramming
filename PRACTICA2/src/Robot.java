public class Robot {

    EstadoRobot atendiendo;
    EstadoRobot cocinando;
    EstadoRobot caminando;
    EstadoRobot suspendido;

    EstadoRobot estadoActual;

    public Robot(){
        atendiendo = new Atendiendo(this);
        cocinando = new Cocinando(this);
        caminando = new Caminando(this);
        suspendido = new Suspendido(this);

        estadoActual = suspendido;

    }

    public void cocinarHamburguesa(int idMenu){
        estadoActual.cocinar(idMenu);
    }
    public void atenderCliente(){
        estadoActual.atender();
    }
    public void caminarToCliente(){
        estadoActual.caminar();
    }
    public void activarRobot(){
        estadoActual.activar();
    }

}