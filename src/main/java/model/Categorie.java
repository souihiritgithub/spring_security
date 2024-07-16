package model;

import java.util.List;

public class Categorie {
	
	private int idc;
	private String nomc;
	private List<Produit> p;
	public Categorie() {
		super();
	}
	public Categorie(int idc, String nomc, List<Produit> p) {
		super();
		this.idc = idc;
		this.nomc = nomc;
		this.p = p;
	}
	public int getIdc() {
		return idc;
	}
	public void setIdc(int idc) {
		this.idc = idc;
	}
	public String getNomc() {
		return nomc;
	}
	public void setNomc(String nomc) {
		this.nomc = nomc;
	}
	public List<Produit> getP() {
		return p;
	}
	public void setP(List<Produit> p) {
		this.p = p;
	}
	
	
	
	
	

}
