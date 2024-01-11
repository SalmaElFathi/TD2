package TD2;

public class EX3 {
    public static void main(String[] args) {
        livre l1=new livre();
        livre l2=new livre("one piece");
        livre l3=new livre("hunter","togashi");
        livre l4=new livre("attack on titan","isayama",45.2);
        livre l5=new livre("death note","oba",78.3,1998);
        livre l6=new livre(l5);

        System.out.println(l1.toString());
        System.out.println(l2.toString());
        System.out.println(l3.toString());
        System.out.println(l4.toString());
        System.out.println(l5.toString());
        System.out.println(l6.toString());

        l1.setTitre("La Peste");
        l1.setAuteur("Albert Camus");
        l1.setPrix(8.99);
        l1.setAnne(1947);
        System.out.println(l1.toString());
}}
    class livre{
         private String titre;
         private String auteur;
         private double prix;
         private int anne;

        livre(){}
        livre(String titre){
            this.titre=titre;
        }
        livre(String titre,String auteur){
        this(titre);
        this.auteur=auteur;
        }
        livre(String titre,String auteur,double prix){
        this(titre,auteur);
        this.prix=prix;
        }
        livre(String titre,String auteur,double prix,int anne ){
            this(titre,auteur,prix);
        this.anne=anne;
        }
        livre(livre l){
            this(l.getTitre(), l.getAuteur(),l.getPrix(), l.getAnne());
        }

        public String getTitre() {
            return titre;
        }

        public void setTitre(String titre) {
            this.titre = titre;
        }

        public String getAuteur() {
            return auteur;
        }

        public void setAuteur(String auteur) {
            this.auteur = auteur;
        }

        public double getPrix() {
            return prix;
        }

        public void setPrix(double prix) {
            this.prix = prix;
        }

        public int getAnne() {
            return anne;
        }

        public void setAnne(int anne) {
            this.anne = anne;
        }
        @Override
        public String toString() {
            return "livre{" +
                    "titre=" + titre +
                    ", auteur=" + auteur +
                    ", prix=" + prix +
                    ", anne=" + anne +
                    '}'; }}
