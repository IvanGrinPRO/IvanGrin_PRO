package Model;

public class Mueble {

    private String material;
    private int peso,presio;

    public Mueble() {
    }

    public Mueble(String material, int peso, int presio) {
        this.material = material;
        this.peso = peso;
        this.presio = presio;
    }

    public void mostrarDatos(){

        System.out.println("material = " + material);
        System.out.println("peso = " + peso);
        System.out.println("presio = " + presio);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPresio() {
        return presio;
    }

    public void setPresio(int presio) {
        this.presio = presio;
    }
}
