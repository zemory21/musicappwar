/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author zemor
 */
@Entity
@Table(name = "evaluations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Evaluations.findAll", query = "SELECT e FROM Evaluations e")
    , @NamedQuery(name = "Evaluations.findById", query = "SELECT e FROM Evaluations e WHERE e.id = :id")
    , @NamedQuery(name = "Evaluations.findByEstimation", query = "SELECT e FROM Evaluations e WHERE e.estimation = :estimation")})
public class Evaluations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "estimation")
    private String estimation;

    public Evaluations() {
    }

    public Evaluations(Integer id) {
        this.id = id;
    }

    public Evaluations(Integer id, String estimation) {
        this.id = id;
        this.estimation = estimation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstimation() {
        return estimation;
    }

    public void setEstimation(String estimation) {
        this.estimation = estimation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evaluations)) {
            return false;
        }
        Evaluations other = (Evaluations) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Evaluations[ id=" + id + " ]";
    }
    
}
