package Ejer2;

public class Local {

        public int id;
        private String nombreLocal;
        private String categoria;
        private String horario;

    public Local(int id, String nombreLocal, String direccion) {
        this.id = id;
        this.nombreLocal = nombreLocal;
        this.categoria = direccion;
    }

        public int getId() {
        return id;
    }

        public void setId(int id) {
        this.id = id;
    }

        public String getNombreLocal() {
        return nombreLocal;
    }

        public void setNombreLocal(String nombreLocal) {
        this.nombreLocal = nombreLocal;
    }

    public String getcategoria() {
        return categoria;
    }

    public void setcategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Local: " + "\n"+
                "id: " + id + "\n"+
                "nombreLocal: " + nombreLocal + '\n' +
                "categoria: " + categoria + '\n' +
                "horario de presentación: " + horario + '\n';
    }
}

