package model;

import java.util.List;

public class LignePanier {
	private int idpan;
	private Produit pp;
	private Double prixUt;
	private int quantite;
	private double total;
	
	public LignePanier() {
		super();
	}

	public LignePanier(int idpan, Produit pp, Double prixUt, int quantite, double total) {
		super();
		this.idpan = idpan;
		this.pp = pp;
		this.prixUt = prixUt;
		this.quantite = quantite;
		this.total = total;
	}

	public int getIdpan() {
		return idpan;
	}

	public void setIdpan(int idpan) {
		this.idpan = idpan;
	}

	public Produit getPp() {
		return pp;
	}

	public void setPp(Produit pp) {
		this.pp = pp;
	}

	public Double getPrixUt() {
		return prixUt;
	}

	public void setPrixUt(Double prixUt) {
		this.prixUt = prixUt;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	
	
	

}
