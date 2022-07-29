package es.rf.tienda.dominio;

import java.util.Calendar;

public class Pedido {

	private int id_pedido;     //identificador de pedido
	private Integer id_usuario;     //Identificador cliente
	private String id_producto;     //Codigo producto pedido
	private int car_cantidad;     //Cantidad de productos que hay en una línea de producto
	private Double car_precio;     //Precio linea de  pedido
	private String car_envio;     //Datos de envio
	private String car_pago;     //Datos de pago
	private String car_tarjeta;     //Numero de la tarjeta de crédito/débito
	private Calendar car_feCadud;     //Fecha de caducidad de la tarjeta de crédito
	private int car_ccv;     //CCV de la tarjeta de crédito
	private String car_nombre;     //Nombre del titular de la tarjeta
	private int car_stat;     //Estado carro
	private String car_feCambio;     //Fechas Cambio
	public int getId_pedido() {
		return id_pedido;
	}
	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}
	public Integer getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getId_producto() {
		return id_producto;
	}
	public void setId_producto(String id_producto) {
		this.id_producto = id_producto;
	}
	public int getCar_cantidad() {
		return car_cantidad;
	}
	public void setCar_cantidad(int car_cantidad) {
		this.car_cantidad = car_cantidad;
	}
	public Double getCar_precio() {
		return car_precio;
	}
	public void setCar_precio(Double car_precio) {
		this.car_precio = car_precio;
	}
	public String getCar_envio() {
		return car_envio;
	}
	public void setCar_envio(String car_envio) {
		this.car_envio = car_envio;
	}
	public String getCar_pago() {
		return car_pago;
	}
	public void setCar_pago(String car_pago) {
		this.car_pago = car_pago;
	}
	public String getCar_tarjeta() {
		return car_tarjeta;
	}
	public void setCar_tarjeta(String car_tarjeta) {
		this.car_tarjeta = car_tarjeta;
	}
	public Calendar getCar_feCadud() {
		return car_feCadud;
	}
	public void setCar_feCadud(Calendar car_feCadud) {
		this.car_feCadud = car_feCadud;
	}
	public int getCar_ccv() {
		return car_ccv;
	}
	public void setCar_ccv(int car_ccv) {
		this.car_ccv = car_ccv;
	}
	public String getCar_nombre() {
		return car_nombre;
	}
	public void setCar_nombre(String car_nombre) {
		this.car_nombre = car_nombre;
	}
	public int getCar_stat() {
		return car_stat;
	}
	public void setCar_stat(int car_stat) {
		this.car_stat = car_stat;
	}
	public String getCar_feCambio() {
		return car_feCambio;
	}
	public void setCar_feCambio(String car_feCambio) {
		this.car_feCambio = car_feCambio;
	}

	
}
