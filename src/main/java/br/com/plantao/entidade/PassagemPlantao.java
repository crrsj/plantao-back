package br.com.plantao.entidade;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import br.com.plantao.enums.AbastecimentoStatus;
import br.com.plantao.enums.AutoCustoStatus;
import br.com.plantao.enums.ComandaStatus;
import br.com.plantao.enums.ControleStatus;
import br.com.plantao.enums.DevolucaoStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tb_plantões")
@Data
@NoArgsConstructor
public class PassagemPlantao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String dataHora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
	private String colaborador;
	@Enumerated(EnumType.STRING)
    private ComandaStatus comanda;
	@Enumerated(EnumType.STRING)
    private AutoCustoStatus autoCusto;
	@Enumerated(EnumType.STRING)
    private ControleStatus tempSatelite;
	@Enumerated(EnumType.STRING)
    private ControleStatus tempCaf;
	@Enumerated(EnumType.STRING)
    private ControleStatus tempEstoque;
	@Enumerated(EnumType.STRING)
    private ControleStatus tempControlados;	
    private int kitsMontadosHermo;	
    private int kitsLiberadosHermo;	
    private int psbLiberados;	
    private int psbDevolvidos;
    private int psbReposto;
    private int kitsReservaHemo;
    @Enumerated(EnumType.STRING)
    private AbastecimentoStatus abastecimento;
   // @Enumerated(EnumType.STRING)
//    private DevolucaoStatus devolucao;
  //  private ControleStatus pgc;
    private ControleStatus limpezaCaixaTransporte;
    private String avariasSetor;
    private String estoqueCritico;
    private String estoqueZerado;
    private String observacoesGerais;
}
