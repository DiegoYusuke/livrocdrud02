package br.com.artigo.livro.controller;

import br.com.artigo.livro.entity.Livro;
import br.com.artigo.livro.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @GetMapping
    public List<Livro> listar() {
        List<Livro> livros = livroRepository.findAll();
        return livros;
    }

    @PostMapping()
    public void salvar(@RequestBody Livro livro) {

        livroRepository.save(livro);
    }

    @PutMapping()
    public void atualizar(@RequestBody Livro livro) {

        livroRepository.save(livro);

    }

    @DeleteMapping(path = "/{isbn}")
    public void deletar(@PathVariable Long isbn) {

        livroRepository.deleteById(isbn);

    }


}