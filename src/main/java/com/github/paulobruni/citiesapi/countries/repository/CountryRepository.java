package com.github.paulobruni.citiesapi.countries.repository;

import com.github.paulobruni.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
