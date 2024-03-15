package classes;

import java.io.Serializable;

public class Data implements Serializable{
    private int clientesAtendidos, sSmoothie, vSmoothie, cSmoothie, sIce, vIce, cIce;

    public Data() {
    }

    public int getClientesAtendidos() {
        return clientesAtendidos;
    }

    public void setClientesAtendidos(int clientesAtendidos) {
        this.clientesAtendidos = clientesAtendidos;
    }

    public int getsSmoothie() {
        return sSmoothie;
    }

    public void setsSmoothie(int sSmoothie) {
        this.sSmoothie = sSmoothie;
    }

    public int getvSmoothie() {
        return vSmoothie;
    }

    public void setvSmoothie(int vSmoothie) {
        this.vSmoothie = vSmoothie;
    }

    public int getcSmoothie() {
        return cSmoothie;
    }

    public void setcSmoothie(int cSmoothie) {
        this.cSmoothie = cSmoothie;
    }

    public int getsIce() {
        return sIce;
    }

    public void setsIce(int sIce) {
        this.sIce = sIce;
    }

    public int getvIce() {
        return vIce;
    }

    public void setvIce(int vIce) {
        this.vIce = vIce;
    }

    public int getcIce() {
        return cIce;
    }

    public void setcIce(int cIce) {
        this.cIce = cIce;
    }
    
}
