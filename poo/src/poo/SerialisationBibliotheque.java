package poo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SerialisationBibliotheque {
    public static void main(String[] args) {
        // Création de la liste de livres
        List<Livre> bibliotheque = new ArrayList<>();
        bibliotheque.add(new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 1943));
        bibliotheque.add(new Livre("1984", "George Orwell", 1949));
        bibliotheque.add(new Livre("L'Alchimiste", "Paulo Coelho", 1988));

        // Sérialisation dans un fichier
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bibliotheque.ser"))) {
            oos.writeObject(bibliotheque);
            System.out.println("Liste des livres sauvegardée dans bibliotheque.ser.");
        } catch (IOException e) {
            System.err.println("Erreur lors de la sérialisation : " + e.getMessage());
        }
    }
}
