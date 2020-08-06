package Modelo;

public class Autor {
    private int idautor;
    private String nombre;
    private String sexo;
    private String f_nacimiento;
    private int edad;
    private String estado;

    public Autor() {
    }

    public Autor(int idautor, String nombre, String sexo, String f_nacimiento, int edad, String estado) {
        this.idautor = idautor;
        this.nombre = nombre;
        this.sexo = sexo;
        this.f_nacimiento = f_nacimiento;
        this.edad = edad;
        this.estado = estado;
    }

    public int getIdautor() {
        return idautor;
    }

    public void setIdautor(int idautor) {
        this.idautor = idautor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(String f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    

          
}
