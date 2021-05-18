/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author Ruben
 */
public class diccionario {
    private String palabraEspañol;
    private String palabraIngles;
    private String definicionEspañol;
    private String definicionIngles;

    public diccionario() {
    
    }

    public String getPalabraEspañol() {
        return palabraEspañol;
    }

    public void setPalabraEspañol(String palabraEspañol) {
        this.palabraEspañol = palabraEspañol;
    }

    public String getPalabraIngles() {
        return palabraIngles;
    }

    public void setPalabraIngles(String palabraIngles) {
        this.palabraIngles = palabraIngles;
    }

    public String getDefinicionEspañol() {
        return definicionEspañol;
    }

    public void setDefinicionEspañol(String definicionEspañol) {
        this.definicionEspañol = definicionEspañol;
    }

    public String getDefinicionIngles() {
        return definicionIngles;
    }

    public void setDefinicionIngles(String definicionIngles) {
        this.definicionIngles = definicionIngles;
    }
    public ArrayList obtenertodasLasLineas() throws FileNotFoundException, IOException{
        File fichero = new File("C://Users//Ruben//Desktop//JAVA//Diccionario//src//java//datosDiccionario.txt");
        FileReader preparar = new FileReader(fichero);
        BufferedReader leer = new BufferedReader(preparar);
        //leer todo el documento de hasta que ya no haya registros 
        ArrayList linea = null;
        String raw;
        while((raw=leer.readLine()) != null){
            linea.add(raw);
        }
        return linea;
    }
    
    public void guardarPalabraNueva(String palabraEspañol,String palabraIngles, String definicionEspañol, String definicionIngles) throws IOException{
        FileWriter fichero = new FileWriter("C://Users//Ruben//Desktop//JAVA//Diccionario//src//java//datosDiccionario.txt");
        PrintWriter escribir = new PrintWriter(fichero);
        escribir.print(palabraEspañol + palabraIngles + definicionEspañol + definicionIngles);
        fichero.close();
    }
    
    public ArrayList imprimir() throws FileNotFoundException, IOException{
        ArrayList arr = null;
        String cadena;
        FileReader f = new FileReader("C://Users//Ruben//Desktop//JAVA//Diccionario//src//java//datosDiccionario.txt");
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            arr.add(cadena);
        }
        b.close();
        return arr;
      }
}
