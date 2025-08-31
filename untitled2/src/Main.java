public class Main {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Для MySQL 8.x
            System.out.println("Драйвер знайдено!");
        } catch (ClassNotFoundException e) {
            System.err.println("Помилка: драйвер MySQL не знайдено!");
            e.printStackTrace();
        }
    }

}