package com.github.paulobruni.citiesapi.states.repository;

import com.github.paulobruni.citiesapi.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
