package Ejer2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class LocalMetodos implements ILocal{

    public List<Local> localList;

    public LocalMetodos() {
        this.localList = new ArrayList<>();
    }


    @Override
    public Local encontrarId(int id) {
        return localList.stream()
                .filter(local -> local.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Local> encontrarTodo() throws IOException, ClassNotFoundException {
        ObjectSerializer.readObjectFromFile("empleados.ax.txt");
        return localList;
    }

    @Override
    public void guardar(Local local) throws IOException, ClassNotFoundException {
        localList.add(local);
        ObjectSerializer.readObjectFromFile("empleados.ax.txt");
    }

    @Override
    public void actualizar(Local local) throws IOException, ClassNotFoundException {
        Local datosViejos = encontrarId(local.getId());
        if (datosViejos != null){
            localList.remove(datosViejos);
            localList.add(local);
            ObjectSerializer.readObjectFromFile("empleados.ax.txt");

        }
    }

    @Override
    public void borrar(Local local) throws IOException, ClassNotFoundException {
        localList.remove(local);
        ObjectSerializer.readObjectFromFile("empleados.ax.txt");

    }
}
