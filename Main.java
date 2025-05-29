import java.util.Scanner;

public class Main {

    // Funciones
    public static int contarCaracteres(String texto) {
        return texto.length();
    }

    public static String Mayusculas(String cadena) {
        return cadena.toUpperCase();
    }

    public static String convertirMinusculasErick(String texto) {
        return texto.toLowerCase();
    }

    public static int contarPalabrasAlberto(String texto) {
        return texto.trim().split("\\s+").length;
    }

    public static boolean esPalindromoBenjamin(String texto) {
        String limpio = texto.toLowerCase().replaceAll("[^a-z0-9]", "");
        String invertido = new StringBuilder(limpio).reverse().toString();
        return limpio.equals(invertido);
    }

    // Invertir texto mas optimizado
    public static String invertirTextoJulian(String texto) {
        StringBuilder sb = new StringBuilder(texto);
        return sb.reverse().toString();
    }

    public static String remplazar(
        String cadena,
        String buscador,
        String remplazo
    ) {
        return cadena.replaceAll(buscador, remplazo);
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
            System.out.println("2. Convertir a Mayúsculas");
            System.out.println("3. Convertir a minúsculas");
            System.out.println("4. Contar palabras");
            System.out.println("5. Verificar Palindromo");
            System.out.println("6. Invertir texto");
            System.out.println("7. Reemplazar palabra de una cadena");
            System.out.println("8. Eliminar espacios");
            System.out.println("9. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println(
                        "Total de caracteres: " + contarCaracteres(texto)
                    );
                    break;
                case 2:
                    System.out.println(
                        "Texto en mayúsculas: " + Mayusculas(texto)
                    );
                    break;
                case 3:
                    System.out.println(
                        "Texto en minúsculas: " +
                        convertirMinusculasErick(texto)
                    );
                    break;
                case 4:
                    System.out.println(
                        "Total de palabras: " + contarPalabrasAlberto(texto)
                    );
                    break;
                case 5:
                    System.out.println(
                        "¿Es palíndromo? " +
                        (esPalindromoBenjamin(texto) ? "Sí" : "No")
                    );
                    break;
                case 6:
                    System.out.println("Texto invertido: " + invertirTextoJulian(texto));
                    break;
                case 7:
                    System.out.print("Palabra a reemplazar: ");
                    String buscador = scanner.nextLine();
                    System.out.print(
                        "Ingresa la palabra por la que deseas reemplazar: "
                    );
                    String remplazo = scanner.nextLine();
                    System.out.println(
                        "Texto reemplazado: " +
                        remplazar(texto, buscador, remplazo)
                    );
                    break;
                case 8:
                    System.out.println(
                        "Texto sin espacios: " + eliminarEspacios(texto)
                    );
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
