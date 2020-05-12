
import com.thiagowill.services.Comparator;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thiago
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String[] lista = {"Thiago williAM Pompeu", "Natalia Amorim Lucas", "José wilLiam Marcos"};
        
        ArrayList<String> lista2 =  new ArrayList<>();
        
        for(String s : lista){
            if(Comparator.contaisIgnoreCase(s, "WiLLiam")){
                lista2.add(s);
            }
        }
        
        System.out.println(lista2);
        
       
    }
    
}
