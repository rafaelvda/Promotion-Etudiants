public class UseEtudiant {

    public static void main(String[] args) {

        Etudiant eleve1 = new Etudiant("raf", "29", 12);
        Etudiant eleve2 = new Etudiant("sentha", "23", 12);

        Promotion sio = new Promotion();

        sio.ajouterEtudiant(eleve1);

        eleve1.afficher();
        eleve2.afficher();

        eleve1.setMoyenne(15.13);

        eleve1.afficher();

    }
}