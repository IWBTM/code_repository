package backjoon.기하;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        String result = String.valueOf(A * B);
        bw.write(result);

        bw.flush();
        closeBuffer(br, bw);
    }

    public static void closeBuffer(BufferedReader br, BufferedWriter bw) throws IOException {
        bw.close();
        br.close();
    }
}
