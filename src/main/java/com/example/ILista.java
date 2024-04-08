package com.example;

public interface ILista<T> {

    /**
     * 1- Quiten un elemento de la lista (si existe) y lo deje disponible para su
     * posterior utilización
     * Metodo encargado de eliminar un nodo de la lista cuya clave es la indicada y
     * la devuelve para su posterior utilizacion
     *
     *
     * @param clave Clave del nodo a eliminar.
     * @return Nodo<T> el nodo eliminado
     */
    public Nodo<T> eliminar(Comparable clave);

    /**
     * 2- Quiten y destruyan un elemento (podría llamarse “Eliminar”)
     *
     * Metodo encargado de eliminar un nodo de la lista cuya clave es la indicada,
     * no retorna ningun elemento ni booleano.
     *
     * @param clave Clave del nodo a eliminar.
     * @return void
     */
    public void eliminar(Comparable clave);

    /*
     * en ambos casos cuando el elemento es eliminado se "engancha" el elemento
     * anterior con el siguiente al eliminado, en el primero caso como todavia
     * guardo una referencia no se borra, en el segundo caso como ya no tengo
     * referencias cuando pase el recolector de basura se borra definitivamente
     */

     
}
