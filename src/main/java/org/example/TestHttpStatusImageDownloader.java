package org.example;

public class TestHttpStatusImageDownloader {
    public static void main(String[] args) {
        HttpStatusChecker checker = new HttpStatusChecker();
        HttpStatusImageDownloader downloader = new HttpStatusImageDownloader(checker);

        try {
            downloader.downloadStatusImage(200); // Завантажує https://http.cat/200.jpg
            downloader.downloadStatusImage(404); // Завантажує https://http.cat/404.jpg
            downloader.downloadStatusImage(10000); // Викидає виключення, оскільки зображення немає
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
