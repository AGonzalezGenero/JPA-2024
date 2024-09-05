/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.persistenceapp;

import javax.persistence.*;

@Entity
public class DetalleFactura {
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetalle;
    private Integer cantidadDet;
    private Double subtotal;

    @ManyToOne
    @JoinColumn(name = "articulo_id")
    private Articulo articulo;

    @ManyToOne
    @JoinColumn(name = "factura_id")
    private Factura factura;

    // Getters y setters

    public Long getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Long idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Integer getCantidadDet() {
        return cantidadDet;
    }

    public void setCantidadDet(Integer cantidadDet) {
        this.cantidadDet = cantidadDet;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    @Override
    public String toString() {
        return "DetalleFactura{" + "idDetalle=" + idDetalle + ", cantidadDet=" + cantidadDet + ", subtotal=" + subtotal + ", articulo=" + articulo + ", factura=" + factura + '}';
    }
    
}
