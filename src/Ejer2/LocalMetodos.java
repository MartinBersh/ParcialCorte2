package Ejer2;

import java.util.ArrayList;
import java.util.List;

public class LocalMetodos {

    private List<Local> localList;

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
    public List<Local> encontrarTodo() {
        return localList;
    }

    @Override
    public void guardar(Local local) {
        localList.add(local);

    }

    @Override
    public void actualizar(Local local) {
        Local datosViejos = encontrarId(local.getId());
        if (datosViejos != null){
            localList.remove(datosViejos);
            localList.add(local);
        }
    }

    @Override
    public void borrar(Local local) {
        localList.remove(local);
    }

}
