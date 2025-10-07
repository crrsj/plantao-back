package br.com.plantao.servico;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.plantao.entidade.PassagemPlantao;
import br.com.plantao.repositorio.PassagemPlantaoRepo;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PassagemPlantaoServico {
	
	private final PassagemPlantaoRepo passagemPlantaoRepo;
	
	public PassagemPlantao criarPlantao(PassagemPlantao passagemPlantao) {
		return passagemPlantaoRepo.save(passagemPlantao);
	}

	public List<PassagemPlantao> ListarPassagem() {
		return passagemPlantaoRepo.findAll();
	}

	public void excluir(Long id){passagemPlantaoRepo.deleteById(id);}



}

