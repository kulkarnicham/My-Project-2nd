package in.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.learn.entity.Country;

public interface CountryRepo extends JpaRepository<Country, Integer> {

}
