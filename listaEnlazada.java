public class ListaEnlazada {

    Nodo cabeza;

    public void agregar(Curso curso) {

        if (buscar(curso.clave) != null) {
            System.out.println("Ya existe un curso con esa clave.");
            return;
        }

        Nodo nuevo = new Nodo(curso);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;

            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }

            actual.siguiente = nuevo;
        }
    }

    public void mostrar() {

        if (cabeza == null) {
            System.out.println("No hay cursos registrados.");
            return;
        }

        Nodo actual = cabeza;

        while (actual != null) {

            Curso c = actual.curso;

            System.out.println("---------------------------");
            System.out.println("Clave: " + c.clave);
            System.out.println("Nombre: " + c.nombre);
            System.out.println("Docente: " + c.docente);
            System.out.println("Inscritos: " + c.inscritos + "/" + c.cupoMaximo);

            actual = actual.siguiente;
        }
    }

    public Curso buscar(String clave) {

        Nodo actual = cabeza;

        while (actual != null) {

            if (actual.curso.clave.equals(clave)) {
                return actual.curso;
            }

            actual = actual.siguiente;
        }

        return null;
    }

    public boolean eliminar(String clave) {

        if (cabeza == null) {
            return false;
        }

        if (cabeza.curso.clave.equals(clave)) {
            cabeza = cabeza.siguiente;
            return true;
        }

        Nodo anterior = cabeza;
        Nodo actual = cabeza.siguiente;

        while (actual != null) {

            if (actual.curso.clave.equals(clave)) {
                anterior.siguiente = actual.siguiente;
                return true;
            }

            anterior = actual;
            actual = actual.siguiente;
        }

        return false;
    }


    public int contarCursos() {
        return contar(cabeza);
    }

    private int contar(Nodo nodo) {

        if (nodo == null) {
            return 0;
        }

        return 1 + contar(nodo.siguiente);
    }

    public Curso buscarRecursivo(String clave) {
        return buscarRec(cabeza, clave);
    }

    private Curso buscarRec(Nodo nodo, String clave) {

        if (nodo == null) {
            return null;
        }

        if (nodo.curso.clave.equals(clave)) {
            return nodo.curso;
        }

        return buscarRec(nodo.siguiente, clave);
    }

}
