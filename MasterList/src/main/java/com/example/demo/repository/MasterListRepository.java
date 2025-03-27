package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.MasterList;

@Repository
public interface MasterListRepository extends JpaRepository<MasterList,Long>  {

}