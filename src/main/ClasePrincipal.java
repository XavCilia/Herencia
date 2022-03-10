package main;

import operaciones.Clasehija_resta;
import operaciones.Clasehija_suma;

public class ClasePrincipal {

    public static void main(String[] args) {

        Clasehija_suma mensajeroSuma = new Clasehija_suma();
        mensajeroSuma.PedirDatos();
        mensajeroSuma.sumar();
        System.out.print("El resultado de la suma es: ");
        mensajeroSuma.MostrarResultado();

        Clasehija_resta mensajeroresta = new Clasehija_resta();
        mensajeroresta.PedirDatos();
        mensajeroresta.restar();
        System.out.print("El resultado de la resta es: ");
        mensajeroresta.MostrarResultado();
    }

}
