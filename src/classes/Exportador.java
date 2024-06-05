package classes;

import java.util.ArrayList;

//Crear la clase abstracta Exportador con el método abstracto exportar. Esta pueda ser
//extendida por la clase ExportarTxt.
public abstract class Exportador {

    public abstract void exportar(ArrayList<Producto> listaProductos);
}
