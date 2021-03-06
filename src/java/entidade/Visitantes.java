package entidade;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Visitantes {

    private Integer idVisitas;
    private Integer idDetento;
    private String visitante;
    private String rg;

    public Integer getIdVisitas() {
        return idVisitas;
    }

    public void setIdVisitas(Integer idVisitas) {
        this.idVisitas = idVisitas;
    }

    public Integer getIdDetento() {
        return idDetento;
    }

    public void setIdDetento(Integer idDetento) {
        this.idDetento = idDetento;
    }


    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getVisitante() {
        return visitante;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

  

}
