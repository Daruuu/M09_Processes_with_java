package practica01;

import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) throws IOException {
        Ex03 ex03 = new Ex03();
/*
        Process process = Runtime.getRuntime().exec("gedit");
        System.out.println(process);
*/
//        ex03.openProgramWithRuntime();
//        ex03.openTwoPrograms();
        ex03.openTwoProgramsProcessBuilder();
    }

    public void openProgramWithRuntime() {
        try {
            Runtime rt = Runtime.getRuntime();
            Process process = rt.exec("google-chrome");
//            Process process = rt.exec("zeal");
            int exitVal = process.exitValue();
            System.out.println("Process exitValue: " + exitVal);
        } catch (Exception e)
        {
            e.printStackTrace();    //display the exception on the console.
        }
    }

    public void openTwoPrograms() {

        String program01 = "google-chrome";
        String program02 = "zeal";
        String url = "https://github.com";

        try {
            Runtime rt = Runtime.getRuntime();
            Process process01 = rt.exec(program01 + " " + url);
            Process process02 = rt.exec(program02);

            int exitVal1 = process01.waitFor();
            int exitVal2 = process02.waitFor();
            process01.destroy();

            System.out.println("Process 1: (google chrome) " + exitVal1);
            System.out.println("Process 2: (zeal) " + exitVal2);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void openTwoProgramsProcessBuilder()
    {
        Runtime rt = Runtime.getRuntime();
        String program01 = "google-chrome";
        String program02 = "zeal";
        String url = "https://github.com";

        try {
            ProcessBuilder processBuilder = new ProcessBuilder(program01) ;
            Process process = processBuilder.start();
            int exit = process.waitFor();
            System.out.println(exit);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}