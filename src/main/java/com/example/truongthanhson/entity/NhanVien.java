package com.example.truongthanhson.entity;

import jakarta.persistence.*;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name = "nhanVien")


public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "image")
    private String image;

    @Column(name = "place")
    private String place;

    @Column(name = "price")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "phongBan_id")
    //@ValidCategoryId
    private PhongBan phongBan;
}