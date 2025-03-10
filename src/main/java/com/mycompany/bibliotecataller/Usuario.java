/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecataller;

import java.util.ArrayList;

/**
 *
 * @author chimu
 */
public class Usuario {

    private String name;
    private int document;
    private boolean tiene_prestamos;
    private ArrayList<Integer> identificador_libros_prestados;

    public Usuario(String name, int document) {
        this.name = name;
        this.document = document;
        this.identificador_libros_prestados = new ArrayList<>();
        this.tiene_prestamos=false;
    }

    public String get_name() {
        return name;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public int get_document() {
        return document;
    }

    public void set_document(int document) {
        this.document = document;
    }

    public boolean is_tiene_prestamos() {
        return tiene_prestamos;
    }

    public void set_tiene_prestamos(boolean tiene_prestamos) {
        this.tiene_prestamos = tiene_prestamos;
    }

    public ArrayList<Integer> get_identificador_libros_prestados() {
        return identificador_libros_prestados;
    }

    public void set_identificador_libros_prestados(ArrayList<Integer> identificador_libros_prestados) {
        this.identificador_libros_prestados = identificador_libros_prestados;
    }

    public void anadir_libro(int identificador) {

        identificador_libros_prestados.add(identificador);
    }

    public void devolvio_libro(int indentificador) {
    
        if (identificador_libros_prestados.contains(identificador_libros_prestados)){
        
        
        }
        
        
    

    }
}
