package br.com.artigo.livro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.artigo.livro.entity.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{

}