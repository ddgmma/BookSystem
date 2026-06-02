import model.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 创建一个books集合，用于存放图书
        ArrayList<Book> books = new ArrayList<>();

        // 创建图书对象
        Book book = new Book(1, "语文", "张三", true);
        Book book1 = new Book(2, "数学", "李四", true);

        // 添加图书
        books.add(book);
        books.add(book1);

//        // 遍历图书
//        for (int i = 0; i < books.size(); i++) {
//            Book b = books.get(i);
//            System.out.println(b.getId() + "|" + b.get书名() + "|" + b.get作者());
//        }

        // 提示：
        System.out.println("\t欢迎使用图书管理系统！");
        System.out.println("=====================================");

        // 提示用户输入
//        @SuppressWarnings("resource") // 抑制资源泄露警告
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入： |  1  |   2  |  3  |  4  |");
        System.out.println("功能： | 查询 | 借书 | 还书 | 退出 |");
        System.out.println("-------------------------------------");

        // 选择功能
        while (true) {
            switch (scanner.nextInt()) {
                case 1:
                    // 遍历 图书库
                    System.out.println("---------------查询结果---------------"); //分割线
                    for (Book b : books) {
                        System.out.println(b.getId() + "|" + b.get书名() + "|" + b.get作者() + "|" + b.is借阅状态());
                    }
                    System.out.println("-------------------------------------");
                    break;

                case 2:
                    System.out.print("请输入要借书的编号：");
                    int id2 = scanner.nextInt();
                    System.out.println("———————————————借阅状态-------------");
                    for (Book b : books) {
                        if (id2 == b.getId()) {
                            b.set借阅状态(false);
                            System.out.println("已借出：" + b.getId() + "|" + b.get书名() + "|" + b.get作者());
                        }
                    }
                    System.out.println("--------------------------------------");
                    break;

                case 3:
                    System.out.print("请输入要还书的编号：");
                    int id3 = scanner.nextInt();
                    System.out.println("———————————————归还状态-------------");
                    for (Book b : books) {
                        if (id3 == b.getId()) {
                            b.set借阅状态(true);
                            System.out.println("已归还：" + b.getId() + "|" + b.get书名() + "|" + b.get作者());
                        }
                    }
                    System.out.println("--------------------------------------");
                    break;

                case 4:
                    return;

                default:
                    System.out.println("输入错误，请重新输入！");
                    System.out.println("--------------------------------------");
            }
        }

// 匹配 类 和 主函数 的大括号
    }
}