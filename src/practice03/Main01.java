package practice03;

public class Main01 {
    public static void main(String[] args) {
        RatoliRun mickey = new RatoliRun("Mickey");
        RatoliRun minnie = new RatoliRun("Minnie");
        RatoliRun jerry = new RatoliRun("Jerry");
/*
        mickey.menja();
        minnie.menja();
        jerry.menja();
*/
        //with RatoliRun
/*
        mickey.start();
        minnie.start();
        jerry.start();
*/
        Thread tmickey = new Thread();
        Thread tminnie= new Thread();
        Thread tjerry= new Thread();
        tmickey.start();
        tminnie.start();
        tjerry.start();
        new Thread(tmickey).start();
        new Thread(tminnie).start();
        new Thread(tjerry).start();
    }
}
