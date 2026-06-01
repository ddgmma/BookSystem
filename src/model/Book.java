package model;

public class Book {

    private int id;
    private String 书名; //书名
    private String 作者;
    private boolean 借阅状态; //借阅状态, true 表示可借阅

    public Book() {
    }

    public Book(int id, String 书名, String 作者, boolean 借阅状态) {
        this.id = id;
        this.书名 = 书名;
        this.作者 = 作者;
        this.借阅状态 = 借阅状态;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String get书名() {
        return 书名;
    }

    public void set书名(String 书名) {
        this.书名 = 书名;
    }

    public String get作者() {
        return 作者;
    }

    public void set作者(String 作者) {
        this.作者 = 作者;
    }

    public boolean is借阅状态() {
        return 借阅状态;
    }

    public void set借阅状态(boolean 借阅状态) {
        this.借阅状态 = 借阅状态;
    }
}
