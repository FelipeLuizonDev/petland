package com.petland.start;

import com.petland.cadastro.repository.AnimalRepository;
import com.petland.cadastro.repository.ClienteRepository;
import com.petland.cadastro.repository.ProdutoServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements ApplicationRunner {
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private AnimalRepository animalRepository;

    @Autowired
    ProdutoServicoRepository produtoServicoRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        /*
        ProdutoServico servico = new ProdutoServico();
        servico.setNome("Tosa");
        servico.setServico(true);
        servico.setValor(70.0);

        produtoServicoRepository.save(servico);
         */
    }
}
