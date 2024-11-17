package poo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.List;

public class DeserialisationBibliotheque {
    public static void main(String[] args) {
        // Désérialisation de la liste des livres
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bibliotheque.ser"))) {
            List<Livre> bibliotheque = (List<Livre>) ois.readObject();
            System.out.println("Liste des livres désérialisée :");
            for (Livre livre : bibliotheque) {
                System.out.println(livre);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erreur lors de la désérialisation : " + e.getMessage());
        }
    }
}
