
package casopractica4;

import java.util.Vector;
import javax.swing.JOptionPane;

public class Participantes {
    
        String name;
        String age;
        String number;
        String estimatedTime;
        String realTime;
        String category;

    public Participantes(String name, String age, String number, String estimatedTime, String realTime, String category) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.estimatedTime = estimatedTime;
        this.realTime = realTime;
        this.category = category;
    }
    
    
    public void adding () {
        this.name = JOptionPane.showInputDialog("Indique el nombre del participante: ");
        this.age = JOptionPane.showInputDialog("Indique la edad del participante: ");
        this.number = JOptionPane.showInputDialog("Indique el numero del participante: ");
        this.estimatedTime = JOptionPane.showInputDialog("Indique el tiempo estimado del participante: ");
        this.realTime = JOptionPane.showInputDialog("Indique el tiempo real del participante: ");
        this.category = categorying(this.age);
    }
    
    
    public String categorying (String age) {
        if (age == null) {
            return "";
        }
        String level = null;
        if (Integer.parseInt(age) < 18) {
            level = "Juvenil";
        } else if (Integer.parseInt(age) <= 40) {
            level = "Adulto";
        } else {
            level = "Master";
        }
        return level;
    }
    
    public void participanteInfo (Participantes list ) {
        JOptionPane.showConfirmDialog(null, "Nombre: "+list.name+"\nEdad: "+list.age+"\nNumero: "+list.number+"\nTiempo Estimada: "+list.estimatedTime+"\nTiempo Real: "+list.realTime+"\nCategoria: "+list.category);
    }
    
    public void searchingByNumber (Vector<Participantes> listaParticipantes) {
        if (listaParticipantes == null) {
            return;
        }
        String inputNumber = JOptionPane.showInputDialog("Indique el numero del participante que desea localizar: ");
        for (int i = 0; i < listaParticipantes.size(); i++) {
            if (listaParticipantes.get(i).number.equals(inputNumber)) {
                Participantes list = listaParticipantes.get(i);
                this.participanteInfo(list);
            }
        }
    }
    
    public void list (Vector<Participantes> listaParticipantes) {
        if (listaParticipantes == null) {
            return;
        }
        String inputCategory = JOptionPane.showInputDialog("""
                                                           Indique seccion de participantes esta tratando de ubicar basados en su categoria: 
                                                           
                                                           1.Juvenil
                                                           2.Adulto
                                                           3.Master""");
        for (int i = 0; i < listaParticipantes.size(); i++) {
            Participantes list;
            switch (inputCategory) {
                case "1" -> {
                    if (listaParticipantes.get(i).category.equals("Juvenil")) {
                        list = listaParticipantes.get(i);
                        this.participanteInfo(list);
                    }
                }
                case "2" -> {
                    if (listaParticipantes.get(i).category.equals("Adulto")) {
                        list = listaParticipantes.get(i);
                        this.participanteInfo(list);
                    }
                }
                case "3" -> {
                    if (listaParticipantes.get(i).category.equals("Master")) {
                        list = listaParticipantes.get(i);
                        this.participanteInfo(list);
                    }
                }
            }
        }
    }
    
    public void delete (Vector<Participantes> listaParticipantes) {
        String deleteOption = JOptionPane.showInputDialog("Indique el numero del participante a eliminar: ");
        if (deleteOption == null) {
            return;
        }
        if (listaParticipantes == null) {
            return;
        }
        for (int i = 0; i < listaParticipantes.size(); i++) {
            if (listaParticipantes.get(i).number.equals(deleteOption)) {
                Participantes list = listaParticipantes.get(i);
                JOptionPane.showConfirmDialog(null, "Informacion eliminada: ");
                participanteInfo(list);
                listaParticipantes.remove(listaParticipantes.get(i));
            }
        }
    }

    
    
}

