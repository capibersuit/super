package ar.gov.chris.client.pantallas;


import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Button;

public class PantallaInicio extends Pantalla {

	Button btn_productos;
	Button btn_listas;
	
	public PantallaInicio() {
		super();
		pantalla_principal();
		// TODO Auto-generated constructor stub
	}

	private void pantalla_principal() {
		
		btn_productos= new Button("Productos");
		btn_listas= new Button("Listas");
		panel.add(btn_productos);
		panel.add(btn_listas);
		agregar_listener();
	}

	private void agregar_listener() {
		btn_listas.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				panel.clear();
				History.newItem("PantallaListas");}
		});
		btn_productos.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				panel.clear();
				History.newItem("PantallaProductos");}
		});
		
	}
	
	

}
