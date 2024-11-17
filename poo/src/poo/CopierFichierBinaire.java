package poo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopierFichierBinaire {
    public static void main(String[] args) {


        try (
            FileInputStream fis = new FileInputStream("fichier.txt");
            FileOutputStream fos = new FileOutputStream("file.txt")
        ) {
            byte[] buffer = new byte[1024]; // Tampon pour la lecture
            int nbOctetsLus;

            while ((nbOctetsLus = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, nbOctetsLus); // Écriture des octets lus
            }
            System.out.println("Copie terminée. Le fichier est enregistré à " + "file.txt");
        } catch (IOException e) {
            System.err.println("Erreur lors de la copie du fichier : " + e.getMessage());
        }
    }
}
