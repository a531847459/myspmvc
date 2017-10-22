package cn.zj.myspmvc.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Goods implements Serializable {
	private Long gid;
	private String name;
	private double price;
	private String photo;
	private int dflag;
	private Long iid;
	public Long getGid() {
		return gid;
	}
	public void setGid(Long gid) {
		this.gid = gid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public int getDflag() {
		return dflag;
	}
	public void setDflag(int dflag) {
		this.dflag = dflag;
	}
	public Long getIid() {
		return iid;
	}
	public void setIid(Long iid) {
		this.iid = iid;
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", name=" + name + ", price=" + price + ", photo=" + photo + ", dflag=" + dflag
				+ ", iid=" + iid + "]";
	}
	
}
