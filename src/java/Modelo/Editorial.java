package Modelo;
public class Editorial {
    private int ideditorial;
    private String nombre;
    private String estado;
    private int inicioed;
    private String reseñas;
    private String convenios;
    

    public Editorial() {
    }

    public Editorial(int ideditorial, String nombre, String estado, int inicioed, String reseñas, String convenios) {
        this.ideditorial = ideditorial;
        this.nombre = nombre;
        this.estado = estado;
        this.inicioed = inicioed;
        this.reseñas = reseñas;
        this.convenios = convenios;
    }

    public int getIdeditorial() {
        return ideditorial;
    }

    public void setIdeditorial(int ideditorial) {
        this.ideditorial = ideditorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getInicioed() {
        return inicioed;
    }

    public void setInicioed(int inicioed) {
        this.inicioed = inicioed;
    }

    public String getReseñas() {
        return reseñas;
    }

    public void setReseñas(String reseñas) {
        this.reseñas = reseñas;
    }

    public String getConvenios() {
        return convenios;
    }

    public void setConvenios(String convenios) {
        this.convenios = convenios;
    }

}
