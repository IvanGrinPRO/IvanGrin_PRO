package Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
//@AllArgsConstructor
//@NoArgsConstructor
public class ProfesorInterno extends Profesor{

    public ProfesorInterno(String nombre, String id, double salario) {
        super(nombre, id, salario);
    }

    public ProfesorInterno() {
        super();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public double getSalario() {
        return super.getSalario();
    }

    @Override
    public void setSalario(double salario) {
        super.setSalario(salario);
    }
}
