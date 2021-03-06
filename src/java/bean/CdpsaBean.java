/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.CdpsaDao;
import entidade.Detento;
import entidade.ListaJumbo;
import entidade.Produtos;
import entidade.Visitantes;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import util.ErroSistema;

/**
 *
 * @author Tic_Cdpsa
 */
@Named
@ViewScoped
public class CdpsaBean implements Serializable {

    @Inject
    private ListaJumbo listJumbo;
    private List<Produtos> listProdutos;
    private CdpsaDao cdpsaDao;
    private Detento detento;
    private Visitantes visitantes;
    private Produtos produtos;
    private List<Detento> listDetentos;
    private List<Visitantes> listVisitantes;

    @PostConstruct
    public void init() {
        System.out.println("Entoru no bean");
        cdpsaDao = new CdpsaDao();
        detento = new Detento();
        visitantes = new Visitantes();
        listProdutos = listJumbo.getProdutos();
        produtos = new Produtos("", "");
    }
    private final StreamedContent file;

    public CdpsaBean() {
        file = DefaultStreamedContent.builder()
                .name("jumbo.pdf")
                .contentType("application/pdf")
                .stream(() -> FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("/resources/arquivos/jumbos.pdf"))
                .build();
    }

   
    public StreamedContent getFile() {
        return file;
    }

    public String home() {

        return "/?faces-redirect=true";

    }

    public String paginaRol() {
        String pagina;
        boolean documentos = true;
        if (documentos) {
            pagina = "rol?faces-redirect=true";

        } else {
            pagina = "documentos?faces-redirect=true";
        }
        return pagina;
    }

    public String buscarDetentoPelaMatricula() throws ErroSistema {
        try {
            listDetentos = cdpsaDao.buscarDetentoPelaMatricula(detento);
            if (listDetentos == null || listDetentos.size() < 1) {
                adicionarMensagem("Detento não encontrado!", FacesMessage.SEVERITY_ERROR);
            } else {
                listVisitantes = cdpsaDao.buscarVisitaPeloRg(visitantes, detento);
                if (listVisitantes == null || listVisitantes.size() < 1) {
                    adicionarMensagem("Não há registros no rol de visitas!", FacesMessage.SEVERITY_ERROR);
                } else {
                    return "setores?faces-redirect=true";
                }
            }
        } catch (ErroSistema ex) {
            Logger.getLogger(CdpsaBean.class.getName()).log(Level.SEVERE, null, ex);
            adicionarMensagem(ex.getMessage(), FacesMessage.SEVERITY_ERROR);
        }
        return null;
    }

    public void adicionarMensagem(String mensagem, FacesMessage.Severity tipoErro) {
        FacesMessage fm = new FacesMessage(tipoErro, mensagem, null);
        FacesContext.getCurrentInstance().addMessage(null, fm);
    }

    public CdpsaDao getCdpsaDao() {
        return cdpsaDao;
    }

    public Detento getDetento() {
        return detento;
    }

    public List<Detento> getListDetentos() {
        return listDetentos;
    }

    public List<Visitantes> getListVisitantes() {
        return listVisitantes;
    }

    public Visitantes getVisitantes() {
        return visitantes;
    }

    public void setVisitantes(Visitantes visitantes) {
        this.visitantes = visitantes;
    }

    public ListaJumbo getListJumbo() {
        return listJumbo;
    }

    public List<Produtos> getListProdutos() {
        return listProdutos;
    }

    public Produtos getProdutos() {
        return produtos;
    }

}
