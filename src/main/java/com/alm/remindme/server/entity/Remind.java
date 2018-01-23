package com.alm.remindme.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name ="remind")
public class Remind {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "incrementor",strategy = "increment")
    private long id;
    @Column(name = "title",nullable = false,length = 50)
    private String title;
    @Column(name = "remin_date",nullable = false)
    private Date temindDate;

    public Remind() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getTemindDate() {
        return temindDate;
    }

    public void setTemindDate(Date temindDate) {
        this.temindDate = temindDate;
    }
}
