public class Curso {

    String clave;
    String nombre;
    String docente;
    int cupoMaximo;
    int inscritos;

    public Curso(String clave, String nombre, String docente, int cupoMaximo) {
        this.clave = clave;
        this.nombre = nombre;
        this.docente = docente;
        this.cupoMaximo = cupoMaximo;
        this.inscritos = 0;
    }

    // Getters
    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocente() {
        return docente;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public int getInscritos() {
        return inscritos;
    }

    // Métodos para modificar inscritos
    public void inscribir() {
        if (inscritos < cupoMaximo) {
            inscritos++;
        }
    }

    public void darBaja() {
        if (inscritos > 0) {
            inscritos--;
        }
    }

    @Override
    public String toString() {
        return "Clave: " + clave +
               "\nNombre: " + nombre +
               "\nDocente: " + docente +
               "\nInscritos: " + inscritos + "/" + cupoMaximo;
    }
}
