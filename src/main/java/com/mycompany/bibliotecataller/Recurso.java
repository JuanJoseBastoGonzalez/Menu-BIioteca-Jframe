/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecataller;

/**
 *
 * @author chimu
 */
public  abstract class Recurso {
    private String titulo;
    private String autor;
    private int idetificador;
    private String date_loan;
    private boolean esta_prestado;

    public Recurso(String titulo, String autor, int idetificador) {
        this.titulo = titulo;
        this.autor = autor;
        this.idetificador = idetificador;
    }

    
    
    
    public String get_titulo() {
        return titulo;
    }

    public void set_titulo(String titulo) {
        this.titulo = titulo;
    }

    public String get_autor() {
        return autor;
    }

    public void set_autor(String autor) {
        this.autor = autor;
    }

    public int get_idetificador() {
        return idetificador;
    }

    public void set_idetificador(int idetificador) {
        this.idetificador = idetificador;
    }

    public String get_date_loan() {
        return date_loan;
    }

    public void set_date_loan(String date_loan) {
        this.date_loan = date_loan;
    }

    public boolean is_esta_prestado() {
        return esta_prestado;
    }

    public void set_esta_prestado(boolean esta_prestado) {
        this.esta_prestado = esta_prestado;
    }
   /*     
 public abstract void prestar(Usuario usuario);
 public  abstract void devolver(Usuario usuario);
 */
  public abstract void prestar( );
 public  abstract void devolver( );


}
