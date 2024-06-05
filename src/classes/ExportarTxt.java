package classes;

import java.util.ArrayList;

public class ExportarTxt extends Exportador{
    @Override
    public void exportar(ArrayList<Producto> listaProductos) {
        System.out.println("Exportar Txt");
    }
}
