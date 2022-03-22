package operaciones;

import Entidades.Matematica;
import ServiciosMatematica.servicio;

public class operaciones {

    public static void main(String[] args) {
        
        servicio sc = new servicio();
        
        Matematica op = sc.asignarValor();
        
        System.out.println(op.getNum1() + "" + op.getNum2());
        
        System.out.println("El número mayor es el: " + sc.devolverMayor());
        
        System.out.println("El numero mayor elevado al numero menor es: " + sc.calculaPotencia());
        
        System.out.println("La raiz cuadrada del menor número es: " + sc.calculaRaiz());
        
    }

}
