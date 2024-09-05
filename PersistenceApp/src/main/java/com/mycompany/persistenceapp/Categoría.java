/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.persistenceapp;

import javax.persistence.*;
import java.util.List;

@Entity
public class Categoría {
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCat;
    private String denominacionCat;

    @ManyToMany(mappedBy = "categorias")
    private List<Articulo> articulos;

    // Getters y setters

    public Long getIdCat() {
        return idCat;
    }

    public void setIdCat(Long idCat) {
        this.idCat = idCat;
    }

    public String getDenominacionCat() {
        return denominacionCat;
    }

    public void setDenominacionCat(String denominacionCat) {
        this.denominacionCat = denominacionCat;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    @Override
    public String toString() {
        return "Categor\u00eda{" + "idCat=" + idCat + ", denominacionCat=" + denominacionCat + ", articulos=" + articulos + '}';
    }
    
}
