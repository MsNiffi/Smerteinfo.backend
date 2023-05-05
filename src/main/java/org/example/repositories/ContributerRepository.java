package org.example.repositories;
import org.example.models.enteties.Contributer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContributerRepository extends JpaRepository<Contributer, Integer>{

}
