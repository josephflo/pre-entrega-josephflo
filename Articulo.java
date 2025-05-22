public class Articulo {
    private int id;
    private String nombre;
    private double precio;

    public Articulo(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getter para el atributo id (solo lectura)
    public int getId() {
        return id;
    }

    // Getter para el atributo nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para modificar el nombre
    public void setNombre(String nombreParametro) {
        if (nombreParametro != null && !nombreParametro.trim().isEmpty()) {
            this.nombre = nombreParametro;
        } else {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
    }

    // Getter para el atributo precio
    public double getPrecio() {
        return precio;
    }

    // Setter para modificar el precio
    public void setPrecio(double precio) {
        if (precio >= 0) {
        this.precio = precio;
    } else {
        throw new IllegalArgumentException("El precio no puede ser negativo.");
    }
    }

    public void mostrar() {
        // Este método puede ser sobrescrito por subclases (polimorfismo)
        System.out.println("ID: " + id + " | Nombre: " + nombre + " | Precio: $" + precio);
    }
}
