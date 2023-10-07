package practice03;

public class RatoliRunnable implements Runnable{
    private String nom;

    public RatoliRunnable(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void menja() {
        System.out.println("El ratolí " + nom + " ha començat a menjar");
        System.out.println("El ratolí " + nom + " està menjant");
        System.out.println("El ratolí " + nom + " ha acabat de menjar");
    }

    //funcion overrride para poder crear un thread de este objeto
    @Override
    public void run() {
//        super.run();
        this.menja();
    }
}

