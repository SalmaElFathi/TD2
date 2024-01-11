package TD2;

public class EX5 {
    public static void main(String[] args) {
        rectangle r1=new rectangle (5,4);
        System.out.println(r1);
    }}
    class rectangle {
    double largeur,longueur;
        public rectangle(){}
        public rectangle(double largeur,double longueur) {
            this.largeur = largeur;
            this.longueur = longueur;
        }
        public rectangle(rectangle r){
            this(r.getLongueur(),r.getLargeur());
                   }

        public double getLargeur() {
            return largeur;
        }

        public void setLargeur(double largeur) {
            if (largeur >= 0)
                this.largeur = largeur;
            else  this.largeur = 0;
        }

        public double getLongueur() {
            return longueur;
        }

        public void setLongueur(double longueur) {
            if (longueur >= 0)
                this.longueur = longueur;
            else this.longueur = 0;
        }

        public double getperimeter(){
         return 2 * (longueur + largeur);
        }
        public double getaire(){
            return longueur *largeur;}
         public boolean iscaree(){
          return largeur==longueur;}

        @Override
        public String toString() {
            return "rectangle{" +
                    " largeur=" + largeur +
                    ", longueur=" + longueur +
                    " ,iscaree = "+ (iscaree() ? " oui":" non")+
                    " , le perimetre = "+getperimeter()+
                    " ,l'aire = "+getaire()+
                    '}';
        }
    }


