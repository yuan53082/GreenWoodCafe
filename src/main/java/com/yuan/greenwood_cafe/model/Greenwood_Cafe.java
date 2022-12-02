package com.yuan.greenwood_cafe.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @avthor yuan
 * @Date 2022/11/28
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Greenwood_Cafe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String date;
    private String time;
    private String name;
    private String phone;
    private Integer people;
    private Integer table_num;

    public Greenwood_Cafe(Integer ID, String date, String time, String name, String phone, Integer people, Integer table_num) {
        this.ID = ID;
        this.date = date;
        this.time = time;
        this.name = name;
        this.phone = phone;
        this.people = people;
        this.table_num = table_num;
    }

    @Override
    public String toString() {
        return "greenwood_cafe{" +
                "ID=" + ID +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", people=" + people +
                ", table_num=" + table_num +
                '}';
    }
}
