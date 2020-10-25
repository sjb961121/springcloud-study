package eureka_client.entity;

public class Book {
    private String sn;
    private String name;
    private String desc;

    public Book() {
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Book(String sn, String name, String desc) {
        this.sn = sn;
        this.name = name;
        this.desc = desc;
    }
}
