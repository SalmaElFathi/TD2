package TD2;

public class EX6 {
    public static void main(String[] args) {
        banque  b=new banque(1,5000,"AB 1200");
        System.out.println(b.avoirInf());
        System.out.println("le solde est "+b.avoirSolde());
        b.deposer(500);
        System.out.println(b.avoirInf());
        System.out.println("le solde est "+b.avoirSolde());
        b.retirer(200);
        System.out.println(b.avoirInf());
        System.out.println("le solde est "+b.avoirSolde());

    }
}


class banque {
    int ncompt;
    float solde;
    String cin;

    public banque(int  ncompt,float solde, String cin){
        this.ncompt=ncompt;
        this.solde=solde;
        this.cin=cin;
    }
    public void deposer(float somme) {
    solde+=somme;
    }
    public boolean retirer(float somme)
    {if(solde-somme>=0)
    {solde-=somme;
    return true;}
    return false;
    }
    public float avoirSolde(){
        return solde;
    }

    public String avoirInf(){
        return  " numero de compte est "+ncompt+
                " le solde est  "+solde+
                " cin est "+cin ;
    }
}
