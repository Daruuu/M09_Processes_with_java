package practica01.escriptorLector;

import java.io.*;

public class Lector {
    public static void main(String[] args) {
        String javaCmd;
        String param1;
        String param2;
        String param3;

        javaCmd = "/home/daruuu/.jdks/corretto-11.0.20.1/bin/java";
        param1 = "-classpath";
//        param2 = "-classpath /home/daruuu/IdeaProjects/M09_Processes_with_java/out/production/M09_Processes_with_java practica01.escriptorLector.Lector";
        param2 = "/home/daruuu/IdeaProjects/M09_Processes_with_java/out/production/M09_Processes_with_java";
        param3 = "practica01.escriptorLector.Descriptor";

//        ProcessBuilder processBuilder = new ProcessBuilder(javaCmd, params);
        ProcessBuilder processBuilder = new ProcessBuilder(javaCmd, param1, param2, param3);
        try {
            Process processEscriptor = processBuilder.start();
            System.out.println(processEscriptor.pid());
            System.out.println(processEscriptor.info());
            // read number en descriptor
            OutputStream out = processEscriptor.getOutputStream();
            BufferedWriter bufOut = new BufferedWriter(new OutputStreamWriter(out));
            bufOut.newLine();
            bufOut.flush();

            InputStream in = processEscriptor.getInputStream();
            BufferedReader buffIn = new BufferedReader(new InputStreamReader(in));
            String message = buffIn.readLine();
            System.out.println("el escriptor dice: " + message);

            bufOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}