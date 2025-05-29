import java.util.Scanner;

public class Main {

    // Funciones
    public static int contarCaracteres(String texto) {
        return texto.length();
    }

    public static String convertirMayusculasErick(String texto) {
        return texto.toUpperCase();
    }

    public static String convertirMinusculas(String texto) {
        return texto.toLowerCase();
    }

    public static int contarPalabras(String texto) {
        return texto.trim().split("\\s+").length;
    }

    public static boolean esPalindromo(String texto) {
        String limpio = texto.toLowerCase().replaceAll("[^a-z0-9]", "");
        String invertido = new StringBuilder(limpio).reverse().toString();
        return limpio.equals(invertido);
    }

    public static String invertirTexto(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }

    public static String reemplazarPalabra(String texto, String buscar, String reemplazar) {
        return texto.replaceAll(buscar, reemplazar);
    }

    public static String eliminarEspacios(String texto) {
        return texto.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String texto = scanner.nextLine();

        int opcion;
        do {
            System.out.println("\n=== MENÚ DE OPERACIONES ===");
            System.out.println("1. Contar caracteres");
            System.out.println("2. Convertir a mayúsculas");
            System.out.println("3. Convertir a minúsculas");
            System.out.println("4. Contar palabras");
            System.out.println("5. Verificar palíndromo");
            System.out.println("6. Invertir texto");
            System.out.println("7. Reemplazar palabra");
            System.out.println("8. Eliminar espacios");
            System.out.println("9. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("Total de caracteres: " + contarCaracteres(texto));
                    break;
                case 2:
                    System.out.println("Texto en mayúsculas: " + convertirMayusculasErick(texto));
                    break;
                case 3:
                    System.out.println("Texto en minúsculas: " + convertirMinusculas(texto));
                    break;
                case 4:
                    System.out.println("Total de palabras: " + contarPalabras(texto));
                    break;
                case 5:
                    System.out.println("¿Es palíndromo? " + (esPalindromo(texto) ? "Sí" : "No"));
                    break;
                case 6:
                    System.out.println("Texto invertido: " + invertirTexto(texto));
                    break;
                case 7:
                    System.out.print("Palabra a buscar: ");
                    String buscar = scanner.nextLine();
                    System.out.print("Palabra por la que deseas reemplazar: ");
                    String reemplazar = scanner.nextLine();
                    System.out.println("Texto modificado: " + reemplazarPalabra(texto, buscar, reemplazar));
                    break;
                case 8:
                    System.out.println("Texto sin espacios: " + eliminarEspacios(texto));
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 9);

        scanner.close();
    }
}
