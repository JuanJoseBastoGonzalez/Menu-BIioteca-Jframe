/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecataller;

/**
 *
 * @author chimu
 */
public class Libro extends Recurso{

    public Libro(String titulo, String autor, int idetificador) {
        super(titulo, autor, idetificador);
    }
/*
    @Override
    public void prestar(Usuario usuari) {
        set_esta_prestado(true);
    }

    @Override
    public void devolver(Usuario usuario) {
        set_esta_prestado(false);
    }*/
    
    
    
        @Override
    public void prestar() {
        set_esta_prestado(true);
    }

    @Override
    public void devolver() {
        set_esta_prestado(false);
    }
    
}
