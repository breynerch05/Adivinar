
public class Adivina{
    int numero = (int)(Math.random()*3+1);
    private int opción;
    Interfaz interfaz = new Interfaz();


public void Juego(){
    for(int contador=1; contador<=5;contador++){
        if(contador==5){
            System.out.println("Lo siento perdiste, el número era: "+ this.numero);
        }
        else{
            opción = interfaz.leerEntero("Digite un número (intento "+ contador+"):");
            if(this.opción<numero){
                System.out.println("El número que estoy pensando es mayor a " +this.opción);  
            }
            else{
                if(this.opción>numero){
                    System.out.println("El número que estoy pensando es menor a " +this.opción);
            }
            else{
                System.out.println("Felicidades ganaste");
                break;
            }
        }
    }
}
}
}
        
    

        
    



