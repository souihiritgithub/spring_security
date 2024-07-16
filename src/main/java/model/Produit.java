package model;

public class Produit {
	private int id;
	private String nomP;
	private Categorie cat ;
	private double prix ;
	public Produit(int id, String nomP, Categorie cat, double prix) {
		super();
		this.id = id;
		this.nomP = nomP;
		this.cat = cat;
		this.prix = prix;
	}
	public Produit() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomP() {
		return nomP;
	}
	public void setNomP(String nomP) {
		this.nomP = nomP;
	}
	public Categorie getCat() {
		return cat;
	}
	public void setCat(Categorie cat) {
		this.cat = cat;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
	

}
