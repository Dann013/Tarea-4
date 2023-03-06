package mx.unam;

public class Puerta {

    private String material;
    private String forma;
    private String cerradura;
    private int largo;
    private int ancho;

    public Puerta(String material, String forma, String cerradura, int largo, int ancho) {
        this.material = material;
        this.forma = forma;
        this.cerradura = cerradura;
        this.largo = largo;
        this.ancho = ancho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getCerradura() {
        return cerradura;
    }

    public void setCerradura(String cerradura) {
        this.cerradura = cerradura;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Puerta{" + "material=" + material + ", forma=" + forma
                + ", cerradura=" + cerradura + ", largo=" + largo + ", ancho=" + ancho + '}';
    }

    public static boolean abrirPuerta(int n) {
        boolean contraseña;
        System.out.println("¿Cual es la contraseña para abrir la puerta?");
        if (n == 00011) {
            contraseña = true;
            System.out.println("La puerta esta abierta ");
            contraseña = false;
        } else {
            contraseña = false;
            System.out.println("La puerta esta cerrada ");
        }
        return contraseña;
    }

    public boolean tiempo(int n) {
        boolean estado = true;
        while (n <= n) {
            if (n <= n) {
                estado = true;
            } else {
                estado = false;
            }
        }
        return estado;
    }

    public static boolean bloqueo(int n) {
        int intentos = 1;
        boolean estado = true;
        if (intentos > 3) {
            estado = false;
        } else {
            estado = true;
        }
        return estado;
    }

}
