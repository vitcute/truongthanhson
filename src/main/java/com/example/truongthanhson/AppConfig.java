package com.example.truongthanhson;



import com.example.truongthanhson.entity.NhanVien;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public List<NhanVien> getNhanVien() {
        List<NhanVien> nhanVien = new ArrayList<>();
        NhanVien nhanvien1 = new NhanVien();
        nhanvien1.setId(1L);
        nhanvien1.setName("Trương Thanh Sơn");
        nhanvien1.setGender("Nam");
        nhanvien1.setImage("");
        nhanvien1.setPlace("Hồ Chí Minh");
        nhanvien1.setPrice(100.000);
//        nhanvien1.setPhongBan("Tài Chính");
        nhanVien.add(nhanvien1);

        NhanVien nhanvien2 = new NhanVien();
        nhanvien2.setId(1L);
        nhanvien2.setName("Trương Thanh Sơn");
        nhanvien2.setGender("Nam");
        nhanvien2.setImage("");
        nhanvien2.setPlace("Hồ Chí Minh");
        nhanvien2.setPrice(100.000);
//        nhanvien2.setPhongBan("Tài Chính");
        nhanVien.add(nhanvien2);
        return nhanVien;
    }
}