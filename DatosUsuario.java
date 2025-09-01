import java.util.Scanner;

public class DatosUsuario {

    public static void main(String[] args) {
        
        // aca declaramos  la variable para leer la entrada o input del usuario
        Scanner entrada = new Scanner(System.in);

        // aquí pedimos  y leimos el nombre
        System.out.println("Por favor, ingresa tu nombre:");
        String nombre = entrada.nextLine();

        // aca pedimos  y leimos la edad
        System.out.println("Por favor, ingresa tu edad:");
        int edad = entrada.nextInt();

        // aquí mostramos en pantalla los datos ingresados
        System.out.println("Hola, " + nombre + ".");
        System.out.println("Tu edad es: " + edad + " años.");

        // cerramos   el scanner para liberar recursos del sistema (buenas practicas de prog.)
        entrada.close();
    }
}