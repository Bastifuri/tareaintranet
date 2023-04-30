
package Model;
import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String rut;
    private String numMatri;

    public Estudiante(String nombre, String apellido, String rut, String numMatri) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.numMatri = numMatri;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNumMatri() {
        return numMatri;
    }

    public void setNumMatri(String numMatri) {
        this.numMatri = numMatri;
    }
}