/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo;

import java.io.Serializable;

/**
 *
 * @author Sistemas
 */
public class Figura implements Serializable{
    private int id;
    private String f;
    private int nl;
    private int l1;
    private int l2;
    private int l3;
    private int l4;
    private int l5;

    public Figura() {
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the f
     */
    public String getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(String f) {
        this.f = f;
    }

    /**
     * @return the nl
     */
    public int getNl() {
        return nl;
    }

    /**
     * @param nl the nl to set
     */
    public void setNl(int nl) {
        this.nl = nl;
    }

    /**
     * @return the ln
     */
   
    public int calculoArea(){
        
    return    l1*l2;
    }

    /**
     * @return the l1
     */
    public int getL1() {
        return l1;
    }

    /**
     * @param l1 the l1 to set
     */
    public void setL1(int l1) {
        this.l1 = l1;
    }

    /**
     * @return the l2
     */
    public int getL2() {
        return l2;
    }

    /**
     * @param l2 the l2 to set
     */
    public void setL2(int l2) {
        this.l2 = l2;
    }

    /**
     * @return the l3
     */
    public int getL3() {
        return l3;
    }

    /**
     * @param l3 the l3 to set
     */
    public void setL3(int l3) {
        this.l3 = l3;
    }

    /**
     * @return the l4
     */
    public int getL4() {
        return l4;
    }

    /**
     * @param l4 the l4 to set
     */
    public void setL4(int l4) {
        this.l4 = l4;
    }

    /**
     * @return the l5
     */
    public int getL5() {
        return l5;
    }

    /**
     * @param l5 the l5 to set
     */
    public void setL5(int l5) {
        this.l5 = l5;
    }
}
