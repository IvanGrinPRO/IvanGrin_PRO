package model;

public class Libro extends Caracteristicas{

    private String isbn;
    private int numero_paginas;

    public Libro(){}

    public Libro(String isbn,int numero_paginas,String identificador,String tituolo,String autor,String formato,double tamano){
        super(identificador,tituolo,autor,formato,tamano);
        this.isbn = isbn;
        this.numero_paginas = numero_paginas;

    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        this.numero_paginas = numero_paginas;
    }
}
