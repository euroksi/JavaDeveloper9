package org.example;

public class TestHttpImageStatusCli {
    public static void main(String[] args) {
        HttpStatusChecker checker = new HttpStatusChecker();
        HttpStatusImageDownloader downloader = new HttpStatusImageDownloader(checker);
        HttpImageStatusCli cli = new HttpImageStatusCli(downloader);

        cli.askStatus();
    }
}
