package practica01;

import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) throws IOException {
        Ex03 ex03 = new Ex03();
        Process process = Runtime.getRuntime().exec("gedit");
        System.out.println(process);
    }
}

