package arraylist_examen;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_examen {

    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in); 
     double t=0;
     int mayorprom=0,poseslent=0,posesrapi=0; //posiciones de estudiante lento y rapido
     double estrapi,estlent; //estudiantes mas rapidos comparacion (lentos tambien)
     double sprom=0,promedio=0;
     ArrayList <String> nomestud = new ArrayList ();
     ArrayList <Double> velocidad = new ArrayList();
     ArrayList <Double> tiempo = new ArrayList();
     boolean fin=false;
     while(!fin){
         
         System.out.println("ingrese un nombre ");
         nomestud.add(leer.next());
         System.out.println("ingrese la veocidad del estudiante ");
         velocidad.add(leer.nextDouble());
         int des;
         
         System.out.println("¿desea agregar un estudiante mas? 1)terminar 2)continuar");
         des=leer.nextInt();
         if (des==1){
             fin=true;
         }else if (des==2){
           fin=false;
         }
     }
        for(int x=0;x<velocidad.size();x++){ 
        t=0;
        t=(100/velocidad.get(x));
        tiempo.add(t);
        sprom=(sprom+tiempo.get(x));
        promedio=sprom/tiempo.size();
        if(tiempo.get(x)>promedio){
        mayorprom=mayorprom+1; //cantida de estudiantes mayores al promedio
        }
        }
        
        estrapi=tiempo.get(0);
        estlent=tiempo.get(0);
        System.out.println("la lista de estudiantes es: ");
        for(int y =0;y<nomestud.size();y++){
            if (estrapi>tiempo.get(y)){
            estrapi=tiempo.get(y); // estudiante mas rapido y su posicion
            posesrapi=y;
            }
            if (estlent<tiempo.get(y)){
            estlent=tiempo.get(y); // estudiante mas lento y su posicion
            poseslent=y;
            }
            System.out.println("nombre "+nomestud.get(y)+" velocidad "+velocidad.get(y)+" tiempo "+tiempo.get(y));
            System.out.println("");
        
        }
        System.out.println("el promedio total es "+promedio);
        System.out.println("");
        System.out.println("el estudiante mas rapido es "+nomestud.get(posesrapi)+" con tiempo "+tiempo.get(posesrapi));
        System.out.println("");
        System.out.println("el estudiante mas lento es "+nomestud.get(poseslent)+" con tiempo "+tiempo.get(poseslent));
        System.out.println("");
        System.out.println("la cantidad de estudiantes mayores al promdeio de tiempo es de "+mayorprom);
    }
    
}
