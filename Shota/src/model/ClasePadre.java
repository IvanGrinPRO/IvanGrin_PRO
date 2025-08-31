package model;

public class ClasePadre {

    private String nombrePadre, apellidoPadre, correPadre;
    private int edadPadre;


    public ClasePadre() {
    }

    public ClasePadre(String nombrePadre, String apellidoPadre, String correPadre, int edadPadre) {
        this.nombrePadre = nombrePadre;
        this.apellidoPadre = apellidoPadre;
        this.correPadre = correPadre;
        this.edadPadre = edadPadre;
    }

    public void mostrarDatos() {

        System.out.println("nombrePadre = " + nombrePadre);
        System.out.println("apellidoPadre = " + apellidoPadre);
        System.out.println("correPadre = " + correPadre);
        System.out.println("edadPadre = " + edadPadre);

    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public String getApellidoPadre() {
        return apellidoPadre;
    }

    public void setApellidoPadre(String apellidoPadre) {
        this.apellidoPadre = apellidoPadre;
    }

    public String getCorrePadre() {
        return correPadre;
    }

    public void setCorrePadre(String correPadre) {
        this.correPadre = correPadre;
    }

    public int getEdadPadre() {
        return edadPadre;
    }

    public void setEdadPadre(int edadPadre) {
        this.edadPadre = edadPadre;
    }


    public class Hija {

        private String nombreHija, apellidoHija, correoHija;
        private int edadHija;

        public Hija() {
        }

        public Hija(String nombreHija, String apellidoHija, String correoHija, int edadHija) {
            this.nombreHija = nombreHija;
            this.apellidoHija = apellidoHija;
            this.correoHija = correoHija;
            this.edadHija = edadHija;
        }


        public void mostrarDatos() {

            System.out.println("nombreHija = " + nombreHija);
            System.out.println("apellidoHija = " + apellidoHija);
            System.out.println("correoHija = " + correoHija);
            System.out.println("edadHija = " + edadHija);

        }

        public String getNombreHija() {
            return nombreHija;
        }

        public void setNombreHija(String nombreHija) {
            this.nombreHija = nombreHija;
        }

        public String getApellidoHija() {
            return apellidoHija;
        }

        public void setApellidoHija(String apellidoHija) {
            this.apellidoHija = apellidoHija;
        }

        public String getCorreoHija() {
            return correoHija;
        }

        public void setCorreoHija(String correoHija) {
            this.correoHija = correoHija;
        }

        public int getEdadHija() {
            return edadHija;
        }

        public void setEdadHija(int edadHija) {
            this.edadHija = edadHija;
        }
    }
}
