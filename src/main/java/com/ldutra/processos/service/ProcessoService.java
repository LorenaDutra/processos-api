package com.ldutra.processos.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.ldutra.processos.model.entity.Processo;
import com.ldutra.processos.model.enums.StatusProcesso;

public interface ProcessoService {

	Processo salvar(Processo lancamento);
	
	Processo atualizar(Processo lancamento);
	
	void deletar(Processo lancamento);
	
	List<Processo> buscar( Processo lancamentoFiltro );
	
	void atualizarStatus(Processo lancamento, StatusProcesso status);
	
	void validar(Processo lancamento);
	
	Optional<Processo> obterPorId(Long id);
	
}
