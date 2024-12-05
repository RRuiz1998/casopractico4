
package casopractica4;

import java.util.Vector;
import javax.swing.JOptionPane;

public class CasoPractica4 {

    public static void main(String[] args) {
        
        Vector<Participantes> listaParticipantes = new Vector<>();
        
        
        OUTER:
        while (true) {
            
            String name = null;
            String age = null;
            String number = null;
            String estimatedTime = null;
            String realTime = null;
            String category = null ;
            
            Participantes participante = new Participantes(name, age, number, estimatedTime, realTime, category);

                    
            String option = JOptionPane.showInputDialog("""
                                                        Bienvenido al sistema de registro de participantes de la Marathon 2024
                                                        Indique la opcion que desea realizar:
                                                        
                                                        1.Registro de nuevos participantes
                                                        2.Busqueda por numero de corredor
                                                        3.Listar participantes
                                                        4.Eliminar participantes""");
            
            
            switch (option) {
                case "1" -> {
                    participante.adding();
                    listaParticipantes.add(participante);
                }
                case "2" -> participante.searchingByNumber(listaParticipantes);
                case "3" -> participante.list(listaParticipantes);
                case "4" -> participante.delete(listaParticipantes);
                
            }
                                    
            
            
            
            
            
            
            
            
            
            
            
            
            String agregarParticipante = JOptionPane.showInputDialog("Desea realizar otra gestion: \n1. Si\n2. No");
            switch (agregarParticipante) {
                case "2" -> {break OUTER;}
            }
        }
        
        

    }
    
}
