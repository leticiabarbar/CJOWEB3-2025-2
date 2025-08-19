package br.edu.ifspcjo.ads.web3.ifitness.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifspcjo.ads.web3.ifitness.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long>{ 

}
