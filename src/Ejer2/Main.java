package Ejer2;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String num = "1";
        ILocal loc = new LocalMetodos();
        while (num != "6"){
            Scanner s = new Scanner(System.in);
            System.out.println("\"Menu \n 1. Add  \n 2. Get all \n 3. Edit" +
                    "                    \n 4. Delete  \n 5. Get by id \n 6. Leave");
            num = s.next();
            switch (num){
                case "1":{
                    System.out.println("local id: ");
                    Integer id = s.nextInt();
                    System.out.println(" Local name: ");
                    String nombreLocal = s.next();
                    System.out.println(" Local category: ");
                    String categoria = s.next();
                    System.out.println("Presentation schedule: ");
                    String horario = s.next();
                    loc.guardar(new Local(id,nombreLocal,categoria, horario));
                    break;
                }
                case "2":{
                    List<Local> localList = loc.encontrarTodo();
                    localList.forEach(System.out::println);
                    break;
                }
                case "3":{
                    System.out.println("EDIT");
                    System.out.println("New Local id: ");
                    Integer id = s.nextInt();
                    System.out.println("New local name: ");
                    String nombreLocal = s.next();
                    System.out.println("Local category: ");
                    String categoria = s.next();
                    System.out.println("Presentation schedule: ");
                    String horario = s.next();
                    loc.actualizar(new Local(id,nombreLocal,categoria, horario));
                    break;
                }
                case "4":{
                    System.out.println("DELETE");
                    System.out.println("Write the id ypu want to delete: ");
                    Integer id = s.nextInt();
                    loc.borrar(loc.encontrarId(id));
                    break;
                }

                case "5":{
                    System.out.println("FIND BY ID");
                    System.out.println("Write the id you want to find");
                    Integer id = s.nextInt();
                    System.out.println(loc.encontrarId(id));
                    break;
                }

                case "6":{
                    num = "6";
                    break;
                }
            }
        }
    }

}
