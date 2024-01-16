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
            Componente c1 = new Componente(json);
            discoDuro dd = new discoDuro(json);
            procesador p1 = new procesador(json);
            Raton r1 = new Raton();
            Teclado t1= new Teclado();


            t1=gson.fromJson(json,Teclado.class);
            r1=gson.fromJson(json,Raton.class);
            p1=gson.fromJson(json, procesador.class);
            c1= gson.fromJson(json,Componente.class);
            dd=gson.fromJson(json, discoDuro.class);
            o1 = gson.fromJson(json, Ordenador.class);

            
            //Ordenador ordenador = gson.fromJson(json, null);

            System.out.println(dd.toString());
            System.out.println(o1.toString());
            System.out.println(c1.toString());
            System.out.println(p1.toString());
            System.out.println(t1.toString());
            System.out.println(r1.toString());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
