package com.example.truongthanhson.repository;
import com.example.truongthanhson.entity.PhongBan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPhongBanRepository extends JpaRepository<PhongBan, Long> {

}
