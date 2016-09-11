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

    Complejo(int nr, int ni, int dr, int di) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public Complejo multiplicar(Complejo c2) {
        Complejo c;
        int re, im;

        re = (this.real * c2.real) - (this.imaginario * c2.imaginario);
        im = (this.imaginario * c2.real) + (this.real * c2.imaginario);

        c = new Complejo(re, im);
        return c;

    }

    public Complejo numeradordividir(Complejo c2) {
        Complejo c;
        int nr, ni;

        nr = (this.real * c2.real) + (this.imaginario * c2.imaginario);
        ni = (this.imaginario * c2.real) - (this.real * c2.imaginario);
        c = new Complejo(nr, ni);
        return c;
    }

    public Complejo denominadordividir(Complejo c2) {
        Complejo c;
        int dr, di;

        dr = (c2.real * c2.real)+(c2.imaginario*c2.imaginario);
        di= (c2.real * c2.real)+(c2.imaginario*c2.imaginario);
       c = new Complejo(dr, di);

        return c;
    }

}
