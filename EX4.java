package TD2;

public class EX4 {
    public static void main(String[] args) {
       temps t3=new temps(3,25,47) ;
       t3.ajouterm(300) ;
       t3.ajouters(3600) ;

      System.out.println(t3.toString());
    }
}
 class temps {
    private int h;
    private int m;
    private int s;

      temps() {
     }


         temps(int h) {
         this.h = h;
     }

     temps(int h, int m) {
         this(h);
         this.m = m;
     }

     temps(int h, int m, int s) {
         this(h, m);
         this.s = s;
     }

     temps(temps t) {
         this(t.getS(), t.getM(), t.getH());
     }

     public int getH() {
         return this.h;
     }

     public int getM() {
         return this.m;
     }

     public int getS() {
         return this.s;
     }

     public void setH(int h) {
         this.h = h;
     }

     public void setM(int m) {
         this.m = m;
     }

     public void setS(int s) {
         this.s = s;
     }

     public void ajouterh(int h) {
         this.setH(this.getH() + h);
     }
     public void ajouterm(int m) {

         m += this.getM();
         ajouterh(m/60);
         this.setM(m % 60);
     }
     public void ajouters(int s) {

         s += this.getS();
         ajouterm(s/60);
         this.setS(s % 60);
     }

     @Override
     public String toString() {
         return "temps{" +
                 "h=" + h +
                 ", m=" + m +
                 ", s=" + s +
                 '}';
     }
 }