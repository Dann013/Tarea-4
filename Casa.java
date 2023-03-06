package mx.unam;

public class Casa {
    //atributos

    private String ubicacion;
    private String material;
    private int metrosc;
    private int NOcuartos;
    private int NOpisos;

    // constructor
    public Casa(String ubicacion, String material, int metrosc, int NOcuartos, int NOpisos) {
        this.ubicacion = ubicacion;
        this.material = material;
        this.metrosc = metrosc;
        this.NOcuartos = NOcuartos;
        this.NOpisos = NOpisos;

    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getMetrosc() {
        return metrosc;
    }

    public void setMetrosc(int metrosc) {
        this.metrosc = metrosc;
    }

    public int getNOcuartos() {
        return NOcuartos;
    }

    public void setNOcuartos(int NOcuartos) {
        this.NOcuartos = NOcuartos;
    }

    public int getNOpisos() {
        return NOpisos;
    }

    public void setNOpisos(int NOpisos) {
        this.NOpisos = NOpisos;
    }

    
    @Override
    public String toString() {
        return "Casa{" + "ubicacion=" + ubicacion + ", material=" + material +
                ", metrosc=" + metrosc + ", NOcuartos=" + NOcuartos + ", NOpisos=" + NOpisos + '}';
    }

    
    

}
