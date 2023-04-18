package Ejer1;

import java.io.Closeable;
import java.io.IOException;

enum E_Ropa {
    BLUSA("Blusa amarilla", "Blusa amarilla con botones talla M", 12){
        public String mostrarDescripciónPrenda() {
            return toString();
        }
    },

    JEAN("Jean negro","Jean negro con rotos en las rodillas talla L",34){
        public String mostrarDescripciónPrenda() {
            return toString();
        }
    },

    CAMISETA("Camiseta Polo", "Camiseta talla S", 1){
        public String mostrarDescripciónPrenda() {
            return toString();
        }
    },
    CAMISA("Camisa de GEF", "Camisa de botones manga larga con lineas talla L", 3){
        public String mostrarDescripciónPrenda() {
            return toString();
        }
    };

    private String nombre;
    private String descripcion;
    private int numEstante;

    E_Ropa(String nombre, String descripcion, int numEstante) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numEstante = numEstante;
    }

    @Override
    public String toString() {
        return "Descripcion prenda: " +"\n"+
                "nombre: " + nombre + '\n' +
                "descripcion: " + descripcion + '\n' +
                "numEstante: " + numEstante;
    }
}
