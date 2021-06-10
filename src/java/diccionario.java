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
    private String palabraEspanol;
    private String palabraIngles;
    private String concepto;

    public diccionario() {
    
    }

    public String getPalabraEspanol() {
        return palabraEspanol;
    }

    public void setPalabraEspanol(String palabraEspanol) {
        this.palabraEspanol = palabraEspanol;
    }

    public String getPalabraIngles() {
        return palabraIngles;
    }

    public void setPalabraIngles(String palabraIngles) {
        this.palabraIngles = palabraIngles;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    
    
    public void guardarPalabraNueva(String path, String palabraEspanol,String palabraIngles, String concepto) throws IOException{
        BufferedWriter bw = null;
                FileWriter fw = null;
                //String data = "Hola stackoverflow.com...";
                File file = new File(path);
                // Si el archivo no existe, se crea!
                if (!file.exists()) {
                    file.createNewFile();
                }
                // flag true, indica adjuntar información al archivo.
                fw = new FileWriter(file.getAbsoluteFile(), true);
                bw = new BufferedWriter(fw);
                bw.write("\r\n" + palabraEspanol + ", " + palabraIngles + ", " + concepto);
                //System.out.println("información agregada!");
                try {
                    //Cierra instancias de FileWriter y BufferedWriter
                    if (bw != null) {
                        bw.close();
                    }
                    if (fw != null) {
                        fw.close();
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
    }
}
