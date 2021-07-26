public class Factory {

    public Nave getNave(Caracteristicas car){
        Nave nave = new Nave();
        nave = setSistemaPropulsion(car.getSistema(), nave);
        nave = setBlindaje(car.getBlindaje(), nave);
        nave = setCabina(car.getCabina(), nave);
        nave = setArmas(car.getArmas(), nave);
        return nave;
    }

    public Nave getNave(String nombre){
        Nave nave = new Nave();
        if (nombre.equalsIgnoreCase("Nave individual de combate")) {
            nave = getNave(new Caracteristicas("Interplanetario", "Simple", "1 piloto", "Laser simple"));
        } else if (nombre.equalsIgnoreCase("Nave militar de transporte")){
            nave = getNave(new Caracteristicas("Interplanetario", "Reforzado", "Tripulacion pequena", "Misiles de plasma"));
        }else if (nombre.equalsIgnoreCase("Base espacial de guerra")){
            nave = getNave(new Caracteristicas("Intergalactico", "Fortaleza", "Ejercito", "Laserdestructor de planetas"));
        }
        return nave;
    }

    private Nave setSistemaPropulsion(String sistema, Nave nave){
        if (sistema.equalsIgnoreCase("Intercontinental")){
            nave = new ConViajeIntercontinental(nave);
        } else if (sistema.equalsIgnoreCase("Interplanetario")){
            nave = new ConViajeInterplanetario(nave);
        } else if (sistema.equalsIgnoreCase("Intergalactico")){
            nave = new ConViajeIntergalactico(nave);
        }
        return nave;
    }
    private Nave setBlindaje(String blindaje, Nave nave){
        if (blindaje.equalsIgnoreCase("Simple")){
            nave = new ConBlindajeSimple(nave);
        } else if (blindaje.equalsIgnoreCase("Reforzado")){
            nave = new ConBlindajeReforzado(nave);
        } else if (blindaje.equalsIgnoreCase("Fortaleza")){
            nave = new ConBlindajeFortaleza(nave);
        }
        return nave;
    }
    private Nave setCabina(String cabina, Nave nave){
        if (cabina.equalsIgnoreCase("1 piloto")){
            nave = new ConPiloto(nave);
        } else if (cabina.equalsIgnoreCase("Tripulacion pequena")){
            nave = new ConTripulacion(nave);
        } else if (cabina.equalsIgnoreCase("Ejercito")){
            nave = new ConEjercito(nave);
        }
        return nave;
    }
    private Nave setArmas(String armas, Nave nave){
        if (armas.equalsIgnoreCase("Laser simple")){
            nave = new ConLaserSimple(nave);
        } else if (armas.equalsIgnoreCase("Misiles de plasma")){
            nave = new ConMisil(nave);
        } else if (armas.equalsIgnoreCase("Laser destructor de planetas")){
            nave = new ConLaserDestructor(nave);
        }
        return nave;
    }
}
