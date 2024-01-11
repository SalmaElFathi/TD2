package TD2;

public class EX1 {

    public static void main(String[] args) {
        point p=new point('a',5.0);
        p.affich();
        p.translate(2);
        p.affich();

    }}
    class point {
        char nom;
        double abscice;

        public point(char nom, double abscice) {
            this.nom = nom;
            this.abscice = abscice;
        }

        public void affich() {
            System.out.println("le nom du point est  " + nom + "  et l'abscice est  " +abscice);
        }
        public void translate(double dx){
            abscice+=dx;
        }

    }













