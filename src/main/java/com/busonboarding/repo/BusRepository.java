package com.busonboarding.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.busonboarding.domain.Bus;

public interface BusRepository extends JpaRepository<Bus, Integer> {

}
