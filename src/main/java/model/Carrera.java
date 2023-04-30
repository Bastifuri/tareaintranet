
package Model;
import java.util.ArrayList;
/**
 *
 * @author Basti
 */
public class Carrera {
    private String nomCarrera;
    private String codigo;
    private int numSemes;
    private ArrayList<Estudiante> arraycarrera;

    public Carrera(String nomCarrera, String codigo, int numSemes, ArrayList<Estudiante> arraycarrera) {
        this.nomCarrera = nomCarrera;
        this.codigo = codigo;
        this.numSemes = numSemes;
        this.arraycarrera = arraycarrera;
    }

    public String getNomCarrera() {
        return nomCarrera;
    }

    public void setNomCarrera(String nomCarrera) {
        this.nomCarrera = nomCarrera;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumSemes() {
        return numSemes;
    }

    public void setNumSemes(int numSemes) {
        this.numSemes = numSemes;
    }

    public ArrayList<Estudiante> getArraycarrera() {
        return arraycarrera;
    }

    public void setArraycarrera(ArrayList<Estudiante> arraycarrera) {
        this.arraycarrera = arraycarrera;
    }

    public void agregarEstudiante(Estudiante estudiante){
        arraycarrera.add(estudiante);
    }

    public void eliminarEstudiante(Estudiante estudiante){
        arraycarrera.remove(estudiante);
    }


}