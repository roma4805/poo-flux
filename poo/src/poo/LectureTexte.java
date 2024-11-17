package poo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectureTexte {
    public static void main(String[] args) {

   try (BufferedReader br = new BufferedReader(new FileReader("livres.txt"))) {
            String ligne;
            System.out.println("Contenu du fichier :");
            while ((ligne = br.readLine()) != null) {
                System.out.println(ligne); // Affiche chaque ligne
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
    }
}

