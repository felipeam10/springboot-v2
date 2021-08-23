package br.com.forum.springbootv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.forum.springbootv2.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	Curso findByNome(String nome);

}
