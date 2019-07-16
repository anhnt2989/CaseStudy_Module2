package com.codegym.model;

import javax.persistence.*;

//Liên kết giữa đối tượng Note và table "notes" trong database
@Entity

//Tạo table tên "notes" trong database. Có thể có hoặc không !
@Table(name = "notes")
public class Note {


    // Tự generate cột ID trong database mà không cần nhập tay
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String content;

    //Liên kết với bảng "types" với many <=> notes và one <=> types
    @ManyToOne
    @JoinColumn(name = "type_Id")
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }


    public Note() {
    }

    public Note(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
