
public class Adivina{
    int numero = (int)(Math.random()*100);
    private int opción;
    Interfaz interfaz = new Interfaz();


public void Juego(){
    for(int contador=1; contador<=4;contador++){
        int opción= interfaz.leerEntero("Digite un número (intento"+ contador+"):");
        if(this.opción>numero){
            System.out.println("El número que estoy pensando es menor a"+this.opción);
        }
        else{
            if(this.opción<numero){
                System.out.println("El número que estoy pensando es mayor a"+this.opción);  
            }
            else{
                System.out.println("Felicidades ganaste");
            }
        }
    }
    else{
        System.out.println("Lo siento has perdido");
    }
        
    }
}


