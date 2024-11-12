package org.example;

public class TestHttpStatusChecker {
    public static void main(String[] args) {
        HttpStatusChecker checker = new HttpStatusChecker();
        try {
            System.out.println(checker.getStatusImage(200)); // Повинно повернути https://http.cat/200.jpg
            System.out.println(checker.getStatusImage(404)); // Повинно повернути https://http.cat/404.jpg
            System.out.println(checker.getStatusImage(10000)); // Повинно викинути виключення
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
