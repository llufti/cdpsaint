/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author Tic_Cdpsa
 */
@Named
@ApplicationScoped
public class ListaJumbo {
    
    List<Produtos> produtos;
    
      @PostConstruct
    public void init() {
        produtos = new ArrayList<>();
        produtos.add(new Produtos("01 kg", "Açúcar"));
        produtos.add(new Produtos("01 unid", "Agulha pequena e linha para costura"));
        produtos.add(new Produtos("500 ml", "Amaciante (embalagem transparente)"));
        produtos.add(new Produtos("250 grs", "Bala (tipo SOFT)"));
        produtos.add(new Produtos("5 unids", "Bermudas (exceto JEANS,ZÍPER, Time, Forro)"));
        produtos.add(new Produtos("02 unids", "Blusa (SEM CAPUZ, FORRO, ZÍPER. Exceto PRETA)"));
        produtos.add(new Produtos("5 unids", "Barbeadores (exceto tipo Mach 3)"));
        produtos.add(new Produtos("500 grs", "Bolachas (SEM RECHEIO) NO TOTAL"));
        produtos.add(new Produtos("02 unids", "Bolo (tipo Pullman, sem recheio)"));
        produtos.add(new Produtos("01 unid", "Caderno brochura (capa fina)"));
        produtos.add(new Produtos("200 grs", "Café solúvel (tipo nescafé)"));
        produtos.add(new Produtos("01 unid", "Calça Padrão (Bege/Caqui s/ bolso lateral, de sarja)"));
        produtos.add(new Produtos("03 unids", "Canetas (exceto azul e preta)"));
        produtos.add(new Produtos("01 unid", "Chinelo de dedo (tipo havaianas)"));
        produtos.add(new Produtos("03 unids", "Chocolate (barra, pedaços pequenos)"));
        produtos.add(new Produtos("10 unids", "Cigarro (maço) ou Fumo desfiado (tipo arapiraca)"));
        produtos.add(new Produtos("01 unid", "Cobertor (s/ forro, barra ou de time. Exceto preto)"));
        produtos.add(new Produtos("01 unid", "Condicionador (embalagem transparente)"));
        produtos.add(new Produtos("01 unid", "Cortador de unha (pequeno, sem lixa)"));
        produtos.add(new Produtos("01 kg", "Açúcar"));
        produtos.add(new Produtos("01 unid", "Agulha pequena e linha para costura"));
        produtos.add(new Produtos("500 ml", "Amaciante (embalagem transparente)"));
        produtos.add(new Produtos("250 grs", "Bala (tipo SOFT)"));
        produtos.add(new Produtos("5 unids", "Bermudas (exceto JEANS,ZÍPER, Time, Forro)"));
        produtos.add(new Produtos("02 unids", "Blusa (SEM CAPUZ, FORRO, ZÍPER. Exceto PRETA)"));
        produtos.add(new Produtos("5 unids", "Barbeadores (exceto tipo Mach 3)"));
        produtos.add(new Produtos("500 grs", "Bolachas (SEM RECHEIO) NO TOTAL"));
        produtos.add(new Produtos("02 unids", "Bolo (tipo Pullman, sem recheio)"));
        produtos.add(new Produtos("01 unid", "Caderno brochura (capa fina)"));
        produtos.add(new Produtos("200 grs", "Café solúvel (tipo nescafé)"));
        produtos.add(new Produtos("01 unid", "Calça Padrão (Bege/Caqui s/ bolso lateral, de sarja)"));
        produtos.add(new Produtos("03 unids", "Canetas (exceto azul e preta)"));
        produtos.add(new Produtos("01 unid", "Chinelo de dedo (tipo havaianas)"));
        produtos.add(new Produtos("03 unids", "Chocolate (barra, pedaços pequenos)"));
        produtos.add(new Produtos("10 unids", "Cigarro (maço) ou Fumo desfiado (tipo arapiraca)"));
        produtos.add(new Produtos("01 unid", "Cobertor (s/ forro, barra ou de time. Exceto preto)"));
        produtos.add(new Produtos("01 unid", "Condicionador (embalagem transparente)"));
        produtos.add(new Produtos("01 unid", "Cortador de unha (pequeno, sem lixa)"));
        

    }

    public List<Produtos> getProdutos() {
        return produtos;
    }

    
    
}
