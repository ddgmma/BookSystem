import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int id;
    String name;
    boolean borrowed; // flase=没被借走

    Book(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Main {
    static ArrayList<Book> books = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // 向 books 集合添加两个元素
        books.add(new Book(1, "语文"));
        books.add(new Book(2, "数学"));

        while (true) {
            System.out.println("1.显示图书 2.借书 3.还书 4.退出"); // 提示键位
            int cmd = scanner.nextInt();

            switch (cmd) {
                case 1:
                    for (int i = 0; i < books.size(); i++) {
                        Book num = books.get(i);
                        System.out.println(num.id + "|" + num.name);
                    }
                    break;
                case 2:
                    System.out.println("请输入图书 id");
                    int id = scanner.nextInt();
                    for (Book num : books) {
                        if (num.id == id) {
                            System.out.println("借书成功");
                            num.borrowed = true;
                        }
                    }
                    break;
                case 3:
                    System.out.println("请输入要还的书的 id：");
                    int id2 = scanner.nextInt();
                    for (int i = 0; i < books.size(); i++) {
                        Book num = books.get(i);
                        if (num.id == id2) {
                            System.out.println("还书成功");
                            num.borrowed = false;
                        }
                    }
                    break;
                case 4:
                    System.out.println("退出");
                    return;
                default:
                    return;
            }
        }
    }
}
