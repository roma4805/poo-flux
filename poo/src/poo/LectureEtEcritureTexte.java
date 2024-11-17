package poo;

import java.io.*;

public class LectureEtEcritureTexte {
    public static void main(String[] args) {

        try (
            BufferedReader br = new BufferedReader(new FileReader("livres.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("sortie.txt"))
        ) {
            String ligne;
            System.out.println("Lecture du fichier source et écriture dans le fichier destination...");
            while ((ligne = br.readLine()) != null) {
                bw.write(ligne); // Écrit chaque ligne dans le fichier de sortie
                bw.newLine();    // Ajoute un saut de ligne
            }
            System.out.println("Les données ont été copiées dans " + "sortie.txt");
        } catch (IOException e) {
            System.err.println("Erreur lors de la manipulation des fichiers : " + e.getMessage());
        }
    }
}

