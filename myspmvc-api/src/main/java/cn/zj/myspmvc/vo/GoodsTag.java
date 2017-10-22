package cn.zj.myspmvc.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class GoodsTag implements Serializable {
	private Long gid;
	private Long tid;
	public Long getGid() {
		return gid;
	}
	public void setGid(Long gid) {
		this.gid = gid;
	}
	public Long getTid() {
		return tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}
	@Override
	public String toString() {
		return "GoodsTag [gid=" + gid + ", tid=" + tid + "]";
	}
	
}	
