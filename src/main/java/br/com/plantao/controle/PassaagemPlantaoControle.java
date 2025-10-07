package br.com.plantao.controle;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.plantao.entidade.PassagemPlantao;
import br.com.plantao.servico.PassagemPlantaoServico;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/plantoes")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class PassaagemPlantaoControle {

	private final PassagemPlantaoServico passagemPlantaoServico;
	
	@PostMapping
	public ResponseEntity<PassagemPlantao>criarPlantao(@RequestBody PassagemPlantao passagemPlantao){
		var criar = passagemPlantaoServico.criarPlantao(passagemPlantao);
		return new ResponseEntity<>(criar, HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<PassagemPlantao>>listarPlantoes(){
		var listar = passagemPlantaoServico.ListarPassagem();
		return new ResponseEntity<>(listar, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void>excluir(@PathVariable Long id){
		passagemPlantaoServico.excluir(id);
		return ResponseEntity.noContent().build();
	}
}
