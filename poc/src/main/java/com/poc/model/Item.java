package com.poc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Item")
@Entity
@Data
@AllArgsConstructor
public class Item {
    @Id
    @NonNull
    @Column(name = "ItemId")
    private int id;

    @Column(name = "ItemName")
    @NonNull
    private String name;

    @Column(name = "ItemDesc")
    @NonNull
    private String desc;

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
