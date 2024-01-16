package org.example;


import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JSON_MAIN {
    public static void main(String[] args) {
        File file = new File("Ordenador.json");

        try (FileReader fr = new FileReader(file);
             BufferedReader bfr = new BufferedReader(fr)) {

            StringBuilder jsonBuilder = new StringBuilder();
            String line;
            while ((line = bfr.readLine()) != null) {
                jsonBuilder.append(line);
            }

            String json = jsonBuilder.toString();
            Gson gson = new Gson();
            
            Ordenador o1 = new Ordenador();

            o1 = gson.fromJson(json, Ordenador.class);

            
            //Ordenador ordenador = gson.fromJson(json, null);

            System.out.println(o1.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
