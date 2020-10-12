package id.ac.ui.cs.mobileprogramming.usmansidiq.helloworld.models;

public class Person {

    private String name;
    private String birthplace;
    private String quote;

    public Person(String name, String birthplace, String quote) {
        this.name = name;
        this.birthplace = birthplace;
        this.quote = quote;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
