package com.example.truongthanhson.repository;
import com.example.truongthanhson.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface INhanVienRepository extends JpaRepository<NhanVien, Long>{
}
