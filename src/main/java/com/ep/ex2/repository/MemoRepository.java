package com.ep.ex2.repository;

import com.ep.ex2.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<Memo, Long> {

}
