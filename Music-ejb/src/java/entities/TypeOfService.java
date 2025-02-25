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
@Table(name = "type_of_service")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypeOfService.findAll", query = "SELECT t FROM TypeOfService t")
    , @NamedQuery(name = "TypeOfService.findById", query = "SELECT t FROM TypeOfService t WHERE t.id = :id")
    , @NamedQuery(name = "TypeOfService.findByTypeOfService", query = "SELECT t FROM TypeOfService t WHERE t.typeOfService = :typeOfService")})
public class TypeOfService implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "type_of_service")
    private String typeOfService;

    public TypeOfService() {
    }

    public TypeOfService(Integer id) {
        this.id = id;
    }

    public TypeOfService(Integer id, String typeOfService) {
        this.id = id;
        this.typeOfService = typeOfService;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
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
        if (!(object instanceof TypeOfService)) {
            return false;
        }
        TypeOfService other = (TypeOfService) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TypeOfService[ id=" + id + " ]";
    }
    
}
