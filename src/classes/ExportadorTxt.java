package classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExportadorTxt extends ExportarTxt{
    //Crear la clase ExportadorTxt extendido por herencia de la clase ExportarTxt.
    //Utilizamos el método exportar y generamos aquellos códigos que nos ayuden a
    //exportar la lista de productos en un archivo “.txt”.
    @Override
    public void exportar(ArrayList<Producto> listaProductos) {
        //codigo para exportar a archivo txt
        System.out.println("Exportando todos los productos");
        String nombreArchivo = "src/archivos/productos.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (Producto producto : listaProductos) {
                writer.write(producto.toString());
                writer.newLine();
            }
            System.out.println("Exportación completada con éxito.");
        } catch (IOException e) {
            System.err.println("Error al exportar los productos: " + e.getMessage());
        }
    }


}
