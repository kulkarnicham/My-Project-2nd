package in.learn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.learn.entity.State;

public interface StateRepo extends JpaRepository<State, Integer> {

	public List<State> findByCountryId(Integer countryId);

}
