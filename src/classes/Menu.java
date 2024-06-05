package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    //Crear una clase Menu que contendrá un menú similar al que vemos a continuación,
    //recordar que debemos generar todas las instancias de scanner en esta clase.
    private Scanner scanner;
    private ProductoServicio productoServicio;
    private ExportadorTxt exportadorTxt;

    public Menu() {
        scanner = new Scanner(System.in);
        productoServicio = new ProductoServicio();
        exportadorTxt = new ExportadorTxt();
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mostrarMenu();
        Utilidad.limpiarPantalla();
    }

    public void mostrarMenu() {
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("1 Listar Producto");
            System.out.println("2 Agregar Producto");
            System.out.println("3 Exportar Datos");
            System.out.println("4 Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    productoServicio.listarProductos();
                    break;
                case 2:
                    agregarProducto();
                    break;
                case 3:
                    exportadorTxt.exportar(productoServicio.getListaProductos());
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
        }
        scanner.close();
    }

    private void agregarProducto() {
        //leer producto
        System.out.println("Ingrese un Nombre de producto: ");
        String nombreProducto = scanner.nextLine();
        System.out.println("Ingrese el Precio del producto: ");
        String precio = scanner.nextLine();
        System.out.println("Ingrese el Descripcion del producto: ");
        String descripcion = scanner.nextLine();
        System.out.println("Ingrese la Talla del producto: ");
        String talla = scanner.nextLine();
        System.out.println("Ingrese el Codigo del producto: ");
        String codigo = scanner.nextLine();
        System.out.println("Ingrese la Marca del producto:");
        String marca = scanner.nextLine();
        System.out.println("Ingrese el cOLOR del producto:");
        String color = scanner.nextLine();

        Producto producto1 = new Producto(nombreProducto,precio,descripcion,codigo,talla,marca,color);
        productoServicio.agregarProducto(producto1);
    }
}
