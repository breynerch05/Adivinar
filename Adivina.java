
public class Adivina{
    int numero = (int)(Math.random()*100);
    private int opción;


public Adivina(int opción){
    this.opción=opción;
}

public void Juego(){
    for(int contador=1; contador<=4;contador++){
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
        System.out.println("Lo siento has perdido");
        
    }
}


