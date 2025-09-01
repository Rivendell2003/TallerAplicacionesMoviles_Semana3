import java.util.Scanner; // llamamos o importamos el scanner en modo escucha para aceptar que el usuario inserte o agregue datos al programa

public class Automovil {

    public static void main(String[] args) {

        // creamos   un objeto Scanner para obtener la entrada del usuario desde sui teclado.
        Scanner entrada = new Scanner(System.in);

        // aca declaramos  las variables para almacenar la información del vehículo.
        // utilizaremos   String para texto y int para números enteros.
        String marca;
        String modelo;
        int cilindrada;
        String tipoCombustible;
        int capacidadPasajeros;

        // se solicita y lee la marca del vehículo.
        System.out.println("Por favor, ingresa la marca:");
        marca = entrada.nextLine();

        // aca se solicita  y lee el modelo del vehículo.
        System.out.println("Por favor, ingresa el modelo:");
        modelo = entrada.nextLine();

        // aca se solicita  y lee la cilindrada del vehículo.
        System.out.println("Por favor, ingresa la cilindrada (en cc):");
        cilindrada = entrada.nextInt();
        entrada.nextLine(); // Consume la nueva línea restante.

        // se pide   y lee el tipo de combustible del vehículo.
        System.out.println("Por favor, ingresa el tipo de combustible:");
        tipoCombustible = entrada.nextLine();

        // se pide  y lee la capacidad de pasajeros del vehículo.
        System.out.println("Por favor, ingresa la capacidad en pasajeros:");
        capacidadPasajeros = entrada.nextInt();

        // aca mostramos  en la pantalla los datos ingresados por el usuario .
        System.out.println("\n--- Datos del Vehículo ---");
        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada + " cc");
        System.out.println("El tipo de combustible es: " + tipoCombustible);
        System.out.println("Tiene una capacidad de " + capacidadPasajeros + " pasajeros.");

        // se cierra   el objeto Scanner para ahporrar datos.
        entrada.close();
    }
}