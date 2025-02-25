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
@Table(name = "type_of_tool")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypeOfTool.findAll", query = "SELECT t FROM TypeOfTool t")
    , @NamedQuery(name = "TypeOfTool.findById", query = "SELECT t FROM TypeOfTool t WHERE t.id = :id")
    , @NamedQuery(name = "TypeOfTool.findByTypeOfTool", query = "SELECT t FROM TypeOfTool t WHERE t.typeOfTool = :typeOfTool")})
public class TypeOfTool implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "type_of_tool")
    private String typeOfTool;

    public TypeOfTool() {
    }

    public TypeOfTool(Integer id) {
        this.id = id;
    }

    public TypeOfTool(Integer id, String typeOfTool) {
        this.id = id;
        this.typeOfTool = typeOfTool;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeOfTool() {
        return typeOfTool;
    }

    public void setTypeOfTool(String typeOfTool) {
        this.typeOfTool = typeOfTool;
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
        if (!(object instanceof TypeOfTool)) {
            return false;
        }
        TypeOfTool other = (TypeOfTool) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TypeOfTool[ id=" + id + " ]";
    }
    
}
