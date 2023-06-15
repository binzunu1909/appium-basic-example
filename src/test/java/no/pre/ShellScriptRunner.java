package no.pre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ShellScriptRunner {
    public static void runBashShell() {
        String bashFilePath = "/Users/admin/Downloads/android-appium/startDevice.sh";
        String bashCommand = "/bin/bash";

        try {
            // Xác định lệnh để chạy tệp tin bash
            ProcessBuilder processBuilder = new ProcessBuilder(bashCommand, bashFilePath);

            // Chạy tiến trình
            Process process = processBuilder.start();

            // Đọc đầu ra từ tiến trình
            InputStream inputStream = process.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Đợi tiến trình hoàn thành
            int exitCode = process.waitFor();
            System.out.println("Tiến trình đã kết thúc với mã trạng thái: " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

