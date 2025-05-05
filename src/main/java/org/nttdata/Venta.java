package org.nttdata;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Venta implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private Integer id;
    private java.util.Date periodo;
    private Integer linea;
    private Boolean isportacion;
    private Boolean isportacionefectiva;
    private String nombrealiado;
    private String nombreplan;
    private java.util.Date fechaventa;
    private java.util.Date fechalegalizacion;
    private Integer cedulaasesor;
    private Integer codpos;
    private Integer codsubpos;
    private String regional;
    private Integer mesliquidacion;
    private Double pagom0;
    private Double pagom1;
    private Double pagom2;
    private Double pagom3;
    private Double pagom4;
    private String tipolinea;
    private Boolean estadolinea;
    private java.util.Date fechafacturacion;
    private String estadosuspension;

    public Venta() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public java.util.Date getPeriodo() {
        return this.periodo;
    }

    public void setPeriodo(java.util.Date periodo) {
        this.periodo = periodo;
    }

    public Integer getLinea() {
        return this.linea;
    }

    public void setLinea(Integer linea) {
        this.linea = linea;
    }

    public Boolean getIsportacion() {
        return this.isportacion;
    }

    public void setIsportacion(Boolean isportacion) {
        this.isportacion = isportacion;
    }

    public Boolean getIsportacionefectiva() {
        return this.isportacionefectiva;
    }

    public void setIsportacionefectiva(Boolean isportacionefectiva) {
        this.isportacionefectiva = isportacionefectiva;
    }

    public String getNombrealiado() {
        return this.nombrealiado;
    }

    public void setNombrealiado(String nombrealiado) {
        this.nombrealiado = nombrealiado;
    }

    public String getNombreplan() {
        return this.nombreplan;
    }

    public void setNombreplan(String nombreplan) {
        this.nombreplan = nombreplan;
    }

    public java.util.Date getFechaventa() {
        return this.fechaventa;
    }

    public void setFechaventa(java.util.Date fechaventa) {
        this.fechaventa = fechaventa;
    }

    public java.util.Date getFechalegalizacion() {
        return this.fechalegalizacion;
    }

    public void setFechalegalizacion(java.util.Date fechalegalizacion) {
        this.fechalegalizacion = fechalegalizacion;
    }

    public Integer getCedulaasesor() {
        return this.cedulaasesor;
    }

    public void setCedulaasesor(Integer cedulaasesor) {
        this.cedulaasesor = cedulaasesor;
    }

    public Integer getCodpos() {
        return this.codpos;
    }

    public void setCodpos(Integer codpos) {
        this.codpos = codpos;
    }

    public Integer getCodsubpos() {
        return this.codsubpos;
    }

    public void setCodsubpos(Integer codsubpos) {
        this.codsubpos = codsubpos;
    }

    public String getRegional() {
        return this.regional;
    }

    public void setRegional(String regional) {
        this.regional = regional;
    }

    public Integer getMesliquidacion() {
        return this.mesliquidacion;
    }

    public void setMesliquidacion(Integer mesliquidacion) {
        this.mesliquidacion = mesliquidacion;
    }

    public Double getPagom0() {
        return this.pagom0;
    }

    public void setPagom0(Double pagom0) {
        this.pagom0 = pagom0;
    }

    public Double getPagom1() {
        return this.pagom1;
    }

    public void setPagom1(Double pagom1) {
        this.pagom1 = pagom1;
    }

    public Double getPagom2() {
        return this.pagom2;
    }

    public void setPagom2(Double pagom2) {
        this.pagom2 = pagom2;
    }

    public Double getPagom3() {
        return this.pagom3;
    }

    public void setPagom3(Double pagom3) {
        this.pagom3 = pagom3;
    }

    public Double getPagom4() {
        return this.pagom4;
    }

    public void setPagom4(Double pagom4) {
        this.pagom4 = pagom4;
    }

    public String getTipolinea() {
        return this.tipolinea;
    }

    public void setTipolinea(String tipolinea) {
        this.tipolinea = tipolinea;
    }

    public Boolean getEstadolinea() {
        return this.estadolinea;
    }

    public void setEstadolinea(Boolean estadolinea) {
        this.estadolinea = estadolinea;
    }

    public java.util.Date getFechafacturacion() {
        return this.fechafacturacion;
    }

    public void setFechafacturacion(java.util.Date fechafacturacion) {
        this.fechafacturacion = fechafacturacion;
    }

    public String getEstadosuspension() {
        return this.estadosuspension;
    }

    public void setEstadosuspension(String estadosuspension) {
        this.estadosuspension = estadosuspension;
    }

    public Venta(Integer id, java.util.Date periodo,
                 Integer linea, Boolean isportacion,
                 Boolean isportacionefectiva,
                 String nombrealiado, String nombreplan,
                 java.util.Date fechaventa, java.util.Date fechalegalizacion,
                 Integer cedulaasesor, Integer codpos,
                 Integer codsubpos, String regional,
                 Integer mesliquidacion, Double pagom0,
                 Double pagom1, Double pagom2,
                 Double pagom3, Double pagom4,
                 String tipolinea, Boolean estadolinea,
                 java.util.Date fechafacturacion, String estadosuspension) {
        this.id = id;
        this.periodo = periodo;
        this.linea = linea;
        this.isportacion = isportacion;
        this.isportacionefectiva = isportacionefectiva;
        this.nombrealiado = nombrealiado;
        this.nombreplan = nombreplan;
        this.fechaventa = fechaventa;
        this.fechalegalizacion = fechalegalizacion;
        this.cedulaasesor = cedulaasesor;
        this.codpos = codpos;
        this.codsubpos = codsubpos;
        this.regional = regional;
        this.mesliquidacion = mesliquidacion;
        this.pagom0 = pagom0;
        this.pagom1 = pagom1;
        this.pagom2 = pagom2;
        this.pagom3 = pagom3;
        this.pagom4 = pagom4;
        this.tipolinea = tipolinea;
        this.estadolinea = estadolinea;
        this.fechafacturacion = fechafacturacion;
        this.estadosuspension = estadosuspension;
    }

}

