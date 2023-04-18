package Ejer2;

import java.util.List;

public interface Ilocal {
    {

        Local encontrarId(int id);
        List<Local> encontrarTodo();
        void guardar(Local);
        void actualizar(Local );
        void borrar(Local local);

    }
}
