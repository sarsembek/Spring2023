package kz.kbtu.basicws.model;

public class Greeting {
    long id;
    String content;
    Integer age;
    public Greeting(long id, String content, Integer age){
        this.id = id;
        this.age = age;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
