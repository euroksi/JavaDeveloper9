package org.example;

import java.util.Scanner;

public class HttpImageStatusCli {

    private final HttpStatusImageDownloader downloader;

    public HttpImageStatusCli(HttpStatusImageDownloader downloader) {
        this.downloader = downloader;
    }

    public void askStatus() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter HTTP status code: ");
            String input = scanner.nextLine();

            int statusCode;
            try {
                statusCode = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid number");
                continue;
            }

            try {
                downloader.downloadStatusImage(statusCode);
            } catch (Exception e) {
                System.out.println("There is no image for HTTP status " + statusCode);
            }
        }
    }
}
