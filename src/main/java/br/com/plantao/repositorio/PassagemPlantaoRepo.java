package br.com.plantao.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.plantao.entidade.PassagemPlantao;

public interface PassagemPlantaoRepo extends JpaRepository<PassagemPlantao, Long> {

}
