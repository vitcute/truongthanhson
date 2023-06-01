package com.example.truongthanhson.entity;
import lombok.Data;
import jakarta.persistence.*;

import java.util.List;

@Data
@Entity
@Table(name = "phongBan")
public class PhongBan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy ="phongBan" , cascade = CascadeType.ALL )
    private List<NhanVien> nhanVien;
}
