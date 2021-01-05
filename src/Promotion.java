import java.util.ArrayList;
import java.util.ListIterator;

public class Promotion {

    private ArrayList<Etudiant> Promotion;
    private int nbEtudiant;

    public Promotion(ArrayList<Etudiant> promotion) {
        Promotion = promotion;
    }

    public Promotion() {
        Promotion = new ArrayList<Etudiant>();
    }

    //public void initialisationTab(){
    //   Promotion = new ArrayList<Etudiant>();
    //}

    public ArrayList<Etudiant> getPromotion() { return Promotion; }

    public void setPromotion(ArrayList<Etudiant> promotion) { Promotion = promotion; }

    public int getNbEtudiant() {
        return Promotion.size();
    }

    public void setNbEtudiant(int nbEtudiant) {
        this.nbEtudiant = nbEtudiant;
    }

    public void modifierMoyenne(String nvMoyenne) {

    }

    //public void ajouterEtudiant(int n) {
    //    for(int i=0;i<n;i++)
    //    {
    //        Etudiant nouvelleEleve = new Etudiant();
    //        Promotion.add(nouvelleEleve);
    //    }
    //}

    public void ajouterEtudiant(Etudiant unEtudiant) {
        Promotion.add(unEtudiant);
    }

    public void calculMoyenneGeneral () {

    }

    @Override
    public String toString() {
        return "Promotion{" +
                "Promotion=" + Promotion +
                '}';
    }

    public void afficher() {
        System.out.println("Voici la liste des étudiants : ");

        for (Object Obj : Promotion) {
            Promotion PP = (Promotion) Obj;
            PP.afficher();
        }
    }
}
