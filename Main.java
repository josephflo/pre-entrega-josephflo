
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Articulo> lista = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- Menú de Artículos ---");
            System.out.println("1. Crear artículo");
            System.out.println("2. Listar artículos");
            System.out.println("3. Modificar artículo");
            System.out.println("4. Eliminar artículo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            // Estructura switch para manejar las opciones
            switch (opcion) {
                case 1 -> crearArticulo();
                case 2 -> listarArticulos();
                case 3 -> modificarArticulo();
                case 4 -> eliminarArticulo();
                case 5 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida");
            }
        } while (opcion != 5);
    }

    // Método para crear un nuevo artículo
    public static void crearArticulo() {

        int id = 0;
        String entradaId;

        do {
            System.out.println("ID del artículo: ");
            entradaId = sc.nextLine();

            if (!esEntero(entradaId)) {
                System.out.println("El ID debe ser un número entero.");
                continue;
            }

            id = Integer.parseInt(entradaId);

            if (buscarArticuloPorId(id) != null) {
                System.out.println(" El ID ya existe. Ingrese otro.");
                entradaId = ""; 
            }
            
        } while (!esEntero(entradaId) || buscarArticuloPorId(Integer.parseInt(entradaId)) != null);

        String nombre;
        do {
            System.out.print("Nombre: ");
            nombre = sc.nextLine();// Leer nombre

            if (nombre.trim().isEmpty()) {
                System.out.println("El nombre no puede estar vacío. Intenta de nuevo.");
            }
        } while (nombre.trim().isEmpty());

        double precio;
        do {
            System.out.println("Precio (en pesos): $");
            precio = sc.nextDouble();
            if (precio <= 0) {
                System.out.println("El precio tiene que ser mayor que 0. Intenta de nuevo.");
            }

        } while (precio <= 0);

        // Crear un nuevo objeto Articulo y agregarlo a la lista
        Articulo nuevo = new Articulo(id, nombre, precio);
        lista.add(nuevo);
        System.out.println("Artículo agregado.");
    }

    // Método para mostrar todos los artículos de la lista
    public static void listarArticulos() {
        if (lista.isEmpty()) {
            System.out.println("No hay artículos cargados.");
        } else {
            for (Articulo a : lista) {
                a.mostrar(); // Llamada polimórfica al método mostrar()
            }
        }
    }

    // Método para modificar un artículo existente
    public static void modificarArticulo() {
        System.out.print("ID del artículo a modificar: ");
        int id = sc.nextInt();
        for (Articulo articulo : lista) {
            if (articulo.getId() == id) {
                sc.nextLine();
                System.out.print("Nuevo nombre: ");
                articulo.setNombre(sc.nextLine()); // Usar setter para cambiar nombre
                System.out.print("Nuevo precio: ");
                articulo.setPrecio(sc.nextDouble());
                // Usar setter para cambiar precio
                System.out.println("Artículo actualizado.");
                return;
            }
        }
        System.out.println("Artículo no encontrado.");
    }

    // Método para eliminar un artículo por ID
    public static void eliminarArticulo() {
        System.out.print("ID del artículo a eliminar: ");
        int id = sc.nextInt();
        // Usamos removeIf con expresión lambda para eliminar por ID
        lista.removeIf(a -> a.getId() == id);
        System.out.println("Artículo eliminado si existía.");
    }

    static boolean esEntero(String texto) {
        if (texto == null || texto.isEmpty())
            return false;
        for (int i = 0; i < texto.length(); i++) {
            if (!Character.isDigit(texto.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static double leerDouble(String mensaje) {
        double numero;
        while (true) {
            System.out.print(mensaje);
            try {
                numero = Double.parseDouble(sc.nextLine());
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Ingresá un número decimal válido (con punto o coma).");
            }
        }
    }

     static Articulo buscarArticuloPorId(int id) {
        for (Articulo a : lista) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }
}
