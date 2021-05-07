import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Recibe y muestra datos de consola
 * @author Sivana Hamer
 * @version 29-4-2021
 */
public class Interfaz {

    /**
     * Leer un double de la entrada estandar (consola)
     * @param mensaje Imprime el mensaje a leer
     * @return Retorna el double
     */
    public double leerDouble(String mensaje){
        //Crea el objeto Scanner
        Scanner scanner = new Scanner(System.in);

        double number = 0;
        //Muestra el mensaje de pedir datos
        System.out.print(mensaje);

        try{
            //Obtiene un flotante
            number = scanner.nextDouble();
        //Maneja el caso que no se le da un double
        }catch(InputMismatchException error){
            System.err.println("ERROR! No se digito un flotante como número.");
        }

        // //Cierra el scanner
        // scanner.close();

        return number;
    }

    /**
     * Leer un entero de la entrada estandar (consola)
     * @param mensaje Imprime el mensaje a leer
     * @return Retorna el entero
     */
    public int leerEntero(String mensaje){
        //Crea el objeto Scanner
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        //Muestra el mensaje de pedir datos
        System.out.print(mensaje);

        try{
            //Obtiene un entero
            number = scanner.nextInt();
        //Maneja el caso que no se le da un double
        }catch(InputMismatchException error){
            System.err.println("ERROR! No se digito un entero como número.");
        }

        // //Cierra el scanner
        // scanner.close();

        return number;
    }

    /**
     * Lee una hilera de texto
     * @param mensaje El mensaje donde pide la hilera
     * @return La hilera de texto digitada
     */
    public String leerTexto(String mensaje){
        //Crea el objeto Scanner
        Scanner scanner = new Scanner(System.in);

        String text = "";
        //Muestra el mensaje de pedir datos
        System.out.print(mensaje);

        try{
            //Obtiene la siguiente linea
            text = scanner.nextLine();
        //Maneja el caso que no se le da un double
        }catch(InputMismatchException error){
            System.err.println("ERROR! No se digito un texto.");
        }

        // //Cierra el scanner
        // scanner.close();

        return text;
    }

    /**
     * Imprimir un mensaje
     * @param mensaje El mensaje a imprimir
     */
    public void imprimirMensaje(String mensaje){
        System.out.println(mensaje);
    }
}