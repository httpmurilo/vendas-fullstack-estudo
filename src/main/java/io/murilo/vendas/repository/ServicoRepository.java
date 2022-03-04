package io.murilo.vendas.repository;

import io.murilo.vendas.model.Entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
