package Ejer2;

import java.io.IOException;
import java.util.List;

public interface ILocal {
    Local encontrarId(int id);

    List<Local> encontrarTodo() throws IOException, ClassNotFoundException;

    void guardar(Local local) throws IOException, ClassNotFoundException;

    void actualizar(Local local) throws IOException, ClassNotFoundException;

    void borrar(Local local) throws IOException, ClassNotFoundException;

}
