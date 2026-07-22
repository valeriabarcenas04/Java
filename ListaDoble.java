public class ListaDoble {

    NodoDoble inicio;
    NodoDoble fin;
    NodoDoble actual;

    public void agregar(Curso curso) {

        NodoDoble nuevo = new NodoDoble(curso);

        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
            actual = nuevo;
        } else {
            fin.siguiente = nuevo;
            nuevo.anterior = fin;
            fin = nuevo;
        }
    }

    public void mostrarInicioFin() {

        if (inicio == null) {
            System.out.println("No hay cursos registrados.");
            return;
        }

        NodoDoble aux = inicio;

        while (aux != null) {

            Curso c = aux.curso;

            System.out.println("---------------------------");
            System.out.println("Clave: " + c.clave);
            System.out.println("Nombre: " + c.nombre);
            System.out.println("Docente: " + c.docente);
            System.out.println("Inscritos: " + c.inscritos + "/" + c.cupoMaximo);

            aux = aux.siguiente;
        }
    }

    public void mostrarFinInicio() {

        if (fin == null) {
            System.out.println("No hay cursos registrados.");
            return;
        }

        NodoDoble aux = fin;

        while (aux != null) {

            Curso c = aux.curso;

            System.out.println("---------------------------");
            System.out.println("Clave: " + c.clave);
            System.out.println("Nombre: " + c.nombre);
            System.out.println("Docente: " + c.docente);
            System.out.println("Inscritos: " + c.inscritos + "/" + c.cupoMaximo);

            aux = aux.anterior;
        }
    }

    public void mostrarActual() {

        if (actual == null) {
            System.out.println("No hay cursos registrados.");
            return;
        }

        Curso c = actual.curso;

        System.out.println("\n=== CURSO ACTUAL ===");
        System.out.println("Clave: " + c.clave);
        System.out.println("Nombre: " + c.nombre);
        System.out.println("Docente: " + c.docente);
        System.out.println("Inscritos: " + c.inscritos + "/" + c.cupoMaximo);
    }

    public void siguiente() {

        if (actual == null) {
            System.out.println("No hay cursos.");
            return;
        }

        if (actual.siguiente != null) {
            actual = actual.siguiente;
        } else {
            System.out.println("Ya estás en el último curso.");
        }
    }

    public void anterior() {

        if (actual == null) {
            System.out.println("No hay cursos.");
            return;
        }

        if (actual.anterior != null) {
            actual = actual.anterior;
        } else {
            System.out.println("Ya estás en el primer curso.");
        }
    }

}
