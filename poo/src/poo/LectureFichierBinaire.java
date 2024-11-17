package poo;

import java.io.FileInputStream;
import java.io.IOException;

public class LectureFichierBinaire {
    public static void main(String[] args) {
    

        try (FileInputStream fis = new FileInputStream("fichier.txt")) {
            int octet= fis.read();
            while (octet  != -1) {
            	octet= fis.read();
                System.out.println(octet); 
            }
            System.out.println("\nLecture terminée.");
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
    }
}

