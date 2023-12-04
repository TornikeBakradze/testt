package com.example.learndoe.repository;

import com.example.learndoe.Entity.TESTDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustumerRepo  extends JpaRepository<TESTDB,Long> {

}
