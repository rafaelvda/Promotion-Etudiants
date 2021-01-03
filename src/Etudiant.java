public class Etudiant {

    private String nom, dateNaissance;
    private double moyenne;

    //public Etudiant(String nom, String dateNaissance, double moyenne) {
     //   this.nom = nom;
     //   this.dateNaissance = dateNaissance;
    //    this.moyenne = moyenne;
   // }

    public Etudiant() {
        nom = Saisie.lire_String("Entrez un nom d'étudiant :");
        dateNaissance = Saisie.lire_String("Entrez la date de naissance :");
        moyenne = Saisie.lire_double("Entrez la moyenne :");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    public void modifierMoyenne() {
        double note = Saisie.lire_double("Quel est la moyenne de cette étudiant :");
        moyenne = note;
    }

    public void saisirEtudiant() {

    }

    public void afficher() {
        System.out.println("Le nom de l'étudiant est : " + nom);
        System.out.println("Sa date de naissance est : " + dateNaissance);
        System.out.println("Sa moyenne est de : " + moyenne);
        System.out.println();
    }
}
