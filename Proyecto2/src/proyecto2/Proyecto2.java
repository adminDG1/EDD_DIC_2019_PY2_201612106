/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author chana
 */
import com.fasterxml.jackson.core.JsonFactory;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Map.Entry;

public class Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JsonProcessingException, IOException, Exception {
        // TODO code application logic here
       // Log login = new Log();
       // login.setVisible(true);
        
      /*  ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        String json = "{" +
            "  \"THU\" : 5," +
            "  \"TUE\" : 3," +
            "  \"WED\" : 4," +
            "  \"SAT\" : 7," +
            "  \"FRI\" : 6," +
            "  \"MON\" : 2," +
            "  \"SUN\" : 1" +
            "}";

        @SuppressWarnings("unchecked")
        Map < String, Integer > days = mapper.readValue(json, Map.class);

        for (Entry < String, Integer > day: days.entrySet()) {
            System.out.println(day.getKey() + "=" + day.getValue());
        }
        
        
        ////////////////////////////
        // Create ObjectMapper object.
        ObjectMapper mapper1 = new ObjectMapper();
        mapper1.enable(SerializationFeature.INDENT_OUTPUT);

        String json1 = "[ \"C\", \"C++\", \"Java\", \"Java EE\", \"Python\", \"Scala\", \"JavaScript\" ]";

        Set < String > progLangs = new HashSet < > ();
        progLangs = mapper.readValue(json1, Set.class);

        for (Iterator < String > iterator = progLangs.iterator(); iterator.hasNext();) {
            String progLang = (String) iterator.next();
            System.out.println(progLang);
        }

        */
      
    
      String getDatos = readFileAsString("Usuarios.json");
        System.out.println(getDatos);
    } // fin main
    
      public static String readFileAsString(String fileName)throws Exception 
  { 
    String data = ""; 
    data = new String(Files.readAllBytes(Paths.get(fileName))); 
    return data; 
  } 
    
}
