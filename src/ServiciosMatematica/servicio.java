package ServiciosMatematica;

import Entidades.Matematica;
import static java.lang.Double.max;
import static java.lang.Double.min;
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.round;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class servicio {
    
    Matematica op = new Matematica();
    
    Scanner leer = new Scanner(System.in);
            
    public Matematica asignarValor() {
        
        op.setNum1(Math.random() * 10);
        
        op.setNum2(Math.random() * 10);
        
        return op;
    }
    
    public Double devolverMayor() {
        Double mayor = max(op.getNum1(), op.getNum2());
        
        return mayor;
    }
    
    public Double calculaPotencia() {
        Double potencia;
        
        long redondeo = round(op.getNum1());
        long redondeo2 = round(op.getNum2());
        
        potencia = pow(max (redondeo, redondeo2), min(redondeo, redondeo2));
        
        return potencia;
    }
    
    public Double calculaRaiz() {
        Double raiz;
        
        long redondeo = round(op.getNum1());
        long redondeo2 = round(op.getNum2());
        
        long abs1 = abs(redondeo);
        long abs2 = abs(redondeo);
        
        raiz = sqrt(min(abs1, abs2));
        
        return raiz;
    }
    
}
