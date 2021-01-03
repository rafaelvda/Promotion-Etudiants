import java.util.ArrayList;
import java.util.ListIterator;

public class Promotion {

    private ArrayList<Etudiant> Promotion;
    private int nbEtudiant = 40;

    public void initialisationTab(){
        Promotion = new ArrayList<Etudiant>();
    }

    public ArrayList<Etudiant> getPromotion() {
        return Promotion;
    }

    public void setPromotion(ArrayList<Etudiant> promotion) {
        Promotion = promotion;
    }

    public int getNbEtudiant() {
        return nbEtudiant;
    }

    public void setNbEtudiant(int nbEtudiant) {
        this.nbEtudiant = nbEtudiant;
    }

    public void modifierMoyenne(String nvMoyenne) {

    }

    public void ajouterEtudiant(int n) {
        for(int i=0;i<n;i++)
        {
            Etudiant nouvelleEleve = new Etudiant();
            Promotion.add(nouvelleEleve);
        }
    }

    public void CompteObjet() {
        int Taille;
        Taille = Promotion.size();
        System.out.println("Il y a " + Taille + " élèves qui ont étaient créer.");
    }

    public void afficher() {
        System.out.println("Voici la liste des étudiants : ");
        ListIterator it = Promotion.listIterator();

        while(it.hasNext())
        {
            Object Obj = it.next();
            Promotion PP = (Promotion) Obj;
            PP.afficher();
        }
    }
}
