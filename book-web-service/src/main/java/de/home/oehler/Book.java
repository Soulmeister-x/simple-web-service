package de.home.oehler;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

public class Book {

    private int id;
    private String name;
    private String author;
    private String link;
    
    
    
    

    

    public Book() {
    }
    
    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }
    public Book(int id, String name, String author, String link) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.link = link;
    }

    

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Book [id="+id+", name="+name+", author="+author+", link="+link+"]";
    }

    public JsonObject toJsonObject() {
        JsonObjectBuilder j = Json.createObjectBuilder();

        j.add("id", this.getId());
        j.add("name", this.getName());
        j.add("author", this.getAuthor());
        j.add("link", this.getLink());
        
        return j.build();
    }
    
}
