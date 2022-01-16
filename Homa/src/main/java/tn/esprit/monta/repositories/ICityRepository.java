package tn.esprit.monta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.monta.entities.City;
@Repository
public interface ICityRepository extends JpaRepository<City,Long> {

}
