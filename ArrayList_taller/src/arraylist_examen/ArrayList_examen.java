package arraylist_examen;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_examen {

    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in); 
     double t=0;
     double sprom=0,promedio;
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
            System.out.println(promedio);
        }
    }
    
}
