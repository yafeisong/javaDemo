package com.geor.htmlparse;


import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * TODO 在此加入类描述
 * @copyright {@link }
 * @author geor.syf<Auto generate>
 * @version  2018-07-11 18:01:12
 * @see org.springrain.gsxx.entity.HtmlElementEntity
 */
public class HtmlElementEntity {
	
	/**
	 * 编号
	 */
	private java.lang.String id;
	/**
	 * 公司名称
	 */
	private java.lang.String companyname;
	/**
	 * 注册资本
	 */
	private java.lang.String zhuceziben;
	/**
	 * 实缴资本
	 */
	private java.lang.String shijiaoziben;
	/**
	 * 经营状态
	 */
	private java.lang.String jingyingzhuangtai;
	/**
	 * 成立日期
	 */
	private java.lang.String chengliriqi;
	/**
	 * 统一社会信用代码
	 */
	private java.lang.String xinyongdaima;
	/**
	 * 纳税人识别号
	 */
	private java.lang.String nashuirenshibiehao;
	/**
	 * 注册号
	 */
	private java.lang.String zhucehao;
	/**
	 * 组织结构代码
	 */
	private java.lang.String zuzhijiegoudaima;
	/**
	 * 公司类型
	 */
	private java.lang.String gongsileixing;
	/**
	 * 所属行业
	 */
	private java.lang.String suoshuhangye;
	/**
	 * 核准日期
	 */
	private java.lang.String hezhunriqi;
	/**
	 * 登记机关
	 */
	private java.lang.String dengjijiguan;
	/**
	 * 所属地区
	 */
	private java.lang.String suoshudiqu;
	/**
	 * 英文名
	 */
	private java.lang.String yingwenming;
	/**
	 * 曾用名
	 */
	private java.lang.String cengyongming;
	/**
	 * 经营方式
	 */
	private java.lang.String jingyingfangshi;
	/**
	 * 人员规模
	 */
	private java.lang.String renyuanguimo;
	/**
	 * 营业期限
	 */
	private java.lang.String yingyeqixian;
	/**
	 * 企业地址
	 */
	private java.lang.String qiyedizhi;
	/**
	 * 经营范围
	 */
	private java.lang.String jingyingfanwei;
	/**
	 * 更新时间
	 */
	private java.lang.Long updatetime;
	/**
	 * 法人名称
	 */
	private java.lang.String farenmingcheng;
	//columns END 数据库字段结束
	
	//concstructor

	public HtmlElementEntity(){
	}

	public HtmlElementEntity(
		java.lang.String id
	){
		this.id = id;
	}

	//get and set
		/**
		 * 编号
		 */
	public void setId(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.id = value;
	}
	
	
	
	/**
	 * 编号
	 */
	public java.lang.String getId() {
		return this.id;
	}
		/**
		 * 公司名称
		 */
	public void setCompanyname(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.companyname = value;
	}
	
	
	
	/**
	 * 公司名称
	 */
	public java.lang.String getCompanyname() {
		return this.companyname;
	}
		/**
		 * 注册资本
		 */
	public void setZhuceziben(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.zhuceziben = value;
	}
	
	
	
	/**
	 * 注册资本
	 */
	public java.lang.String getZhuceziben() {
		return this.zhuceziben;
	}
		/**
		 * 实缴资本
		 */
	public void setShijiaoziben(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.shijiaoziben = value;
	}
	
	
	
	/**
	 * 实缴资本
	 */
	public java.lang.String getShijiaoziben() {
		return this.shijiaoziben;
	}
		/**
		 * 经营状态
		 */
	public void setJingyingzhuangtai(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.jingyingzhuangtai = value;
	}
	
	
	
	/**
	 * 经营状态
	 */
	public java.lang.String getJingyingzhuangtai() {
		return this.jingyingzhuangtai;
	}
		/**
		 * 成立日期
		 */
	public void setChengliriqi(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.chengliriqi = value;
	}
	
	
	
	/**
	 * 成立日期
	 */
	public java.lang.String getChengliriqi() {
		return this.chengliriqi;
	}
		/**
		 * 统一社会信用代码
		 */
	public void setXinyongdaima(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.xinyongdaima = value;
	}
	
	
	
	/**
	 * 统一社会信用代码
	 */
	public java.lang.String getXinyongdaima() {
		return this.xinyongdaima;
	}
		/**
		 * 纳税人识别号
		 */
	public void setNashuirenshibiehao(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.nashuirenshibiehao = value;
	}
	
	
	
	/**
	 * 纳税人识别号
	 */
	public java.lang.String getNashuirenshibiehao() {
		return this.nashuirenshibiehao;
	}
		/**
		 * 注册号
		 */
	public void setZhucehao(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.zhucehao = value;
	}
	
	
	
	/**
	 * 注册号
	 */
	public java.lang.String getZhucehao() {
		return this.zhucehao;
	}
		/**
		 * 组织结构代码
		 */
	public void setZuzhijiegoudaima(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.zuzhijiegoudaima = value;
	}
	
	
	
	/**
	 * 组织结构代码
	 */
	public java.lang.String getZuzhijiegoudaima() {
		return this.zuzhijiegoudaima;
	}
		/**
		 * 公司类型
		 */
	public void setGongsileixing(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.gongsileixing = value;
	}
	
	
	
	/**
	 * 公司类型
	 */
	public java.lang.String getGongsileixing() {
		return this.gongsileixing;
	}
		/**
		 * 所属行业
		 */
	public void setSuoshuhangye(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.suoshuhangye = value;
	}
	
	
	
	/**
	 * 所属行业
	 */
	public java.lang.String getSuoshuhangye() {
		return this.suoshuhangye;
	}
		/**
		 * 核准日期
		 */
	public void setHezhunriqi(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.hezhunriqi = value;
	}
	
	
	
	/**
	 * 核准日期
	 */
	public java.lang.String getHezhunriqi() {
		return this.hezhunriqi;
	}
		/**
		 * 登记机关
		 */
	public void setDengjijiguan(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.dengjijiguan = value;
	}
	
	
	
	/**
	 * 登记机关
	 */
	public java.lang.String getDengjijiguan() {
		return this.dengjijiguan;
	}
		/**
		 * 所属地区
		 */
	public void setSuoshudiqu(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.suoshudiqu = value;
	}
	
	
	
	/**
	 * 所属地区
	 */
	public java.lang.String getSuoshudiqu() {
		return this.suoshudiqu;
	}
		/**
		 * 英文名
		 */
	public void setYingwenming(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.yingwenming = value;
	}
	
	
	
	/**
	 * 英文名
	 */
	public java.lang.String getYingwenming() {
		return this.yingwenming;
	}
		/**
		 * 曾用名
		 */
	public void setCengyongming(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.cengyongming = value;
	}
	
	
	
	/**
	 * 曾用名
	 */
	public java.lang.String getCengyongming() {
		return this.cengyongming;
	}
		/**
		 * 经营方式
		 */
	public void setJingyingfangshi(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.jingyingfangshi = value;
	}
	
	
	
	/**
	 * 经营方式
	 */
	public java.lang.String getJingyingfangshi() {
		return this.jingyingfangshi;
	}
		/**
		 * 人员规模
		 */
	public void setRenyuanguimo(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.renyuanguimo = value;
	}
	
	
	
	/**
	 * 人员规模
	 */
	public java.lang.String getRenyuanguimo() {
		return this.renyuanguimo;
	}
		/**
		 * 营业期限
		 */
	public void setYingyeqixian(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.yingyeqixian = value;
	}
	
	
	
	/**
	 * 营业期限
	 */
	public java.lang.String getYingyeqixian() {
		return this.yingyeqixian;
	}
		/**
		 * 企业地址
		 */
	public void setQiyedizhi(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.qiyedizhi = value;
	}
	
	
	
	/**
	 * 企业地址
	 */
	public java.lang.String getQiyedizhi() {
		return this.qiyedizhi;
	}
		/**
		 * 经营范围
		 */
	public void setJingyingfanwei(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.jingyingfanwei = value;
	}
	
	
	
	/**
	 * 经营范围
	 */
	public java.lang.String getJingyingfanwei() {
		return this.jingyingfanwei;
	}
		/**
		 * 更新时间
		 */
	public void setUpdatetime(java.lang.Long value) {
		this.updatetime = value;
	}
	
	
	
	/**
	 * 更新时间
	 */
	public java.lang.Long getUpdatetime() {
		return this.updatetime;
	}
		/**
		 * 法人名称
		 */
	public void setFarenmingcheng(java.lang.String value) {
		    if(StringUtils.isNotBlank(value)){
			 value=value.trim();
			}
		this.farenmingcheng = value;
	}
	
	
	
	/**
	 * 法人名称
	 */
	public java.lang.String getFarenmingcheng() {
		return this.farenmingcheng;
	}
	@Override
	public String toString() {
		return new StringBuilder()
			.append("编号[").append(getId()).append("],")
			.append("公司名称[").append(getCompanyname()).append("],")
			.append("注册资本[").append(getZhuceziben()).append("],")
			.append("实缴资本[").append(getShijiaoziben()).append("],")
			.append("经营状态[").append(getJingyingzhuangtai()).append("],")
			.append("成立日期[").append(getChengliriqi()).append("],")
			.append("统一社会信用代码[").append(getXinyongdaima()).append("],")
			.append("纳税人识别号[").append(getNashuirenshibiehao()).append("],")
			.append("注册号[").append(getZhucehao()).append("],")
			.append("组织结构代码[").append(getZuzhijiegoudaima()).append("],")
			.append("公司类型[").append(getGongsileixing()).append("],")
			.append("所属行业[").append(getSuoshuhangye()).append("],")
			.append("核准日期[").append(getHezhunriqi()).append("],")
			.append("登记机关[").append(getDengjijiguan()).append("],")
			.append("所属地区[").append(getSuoshudiqu()).append("],")
			.append("英文名[").append(getYingwenming()).append("],")
			.append("曾用名[").append(getCengyongming()).append("],")
			.append("经营方式[").append(getJingyingfangshi()).append("],")
			.append("人员规模[").append(getRenyuanguimo()).append("],")
			.append("营业期限[").append(getYingyeqixian()).append("],")
			.append("企业地址[").append(getQiyedizhi()).append("],")
			.append("经营范围[").append(getJingyingfanwei()).append("],")
			.append("更新时间[").append(getUpdatetime()).append("],")
			.append("法人名称[").append(getFarenmingcheng()).append("],")
			.toString();
	}
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof HtmlElementEntity == false){
			return false;
		}
			
		if(this == obj){
			return true;
		}
		
		HtmlElementEntity other = (HtmlElementEntity)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

	
