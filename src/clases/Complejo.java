/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author USUARIO
 */
public class Complejo {

    private int real;
    private int imaginario;

    public Complejo(int real, int imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public int getReal() {
        return real;
    }

    public int getImaginario() {
        return imaginario;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImaginario(int imaginario) {
        this.imaginario = imaginario;
    }
    
     public Complejo sumar(Complejo c2) {
        Complejo c;
        int re, im;

        re = this.real + c2.real;
        im = this.imaginario + c2.imaginario;

        c = new Complejo(re, im);
        return c;
    }
    public Complejo restar(Complejo c2) {
        Complejo c;
        int re, im;

        re = this.real - c2.real;
        im = this.imaginario - c2.imaginario;

        c = new Complejo(re, im);
        return c;

    }
      public Complejo multiplicar(Complejo c2 ) {
        Complejo c;
        int re, im;

        re = (this.real * c2.real) - (this.imaginario*c2.imaginario);
        im = (this.imaginario * c2.real) + (this.real*c2.imaginario);

        c = new Complejo(re, im);
        return c;

    }

}
