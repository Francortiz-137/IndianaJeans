package classes;

import java.util.ArrayList;

public class ProductoServicio {
    private ArrayList<Producto> listaProductos;

    public ProductoServicio() {
        listaProductos = new ArrayList<>();
    }

    public ProductoServicio(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    //3 Generar una clase ProductoServicio que contendrá una ArrayList llamada
    //listaProductos, con su respectivo getters y setters. Además, esta clase debe contar
    //con los siguientes métodos con sus respectivas aplicaciones:
    public void listarProductos() {
        System.out.println("Listado de Productos");
        listaProductos.forEach(System.out::println);
    }

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
}


