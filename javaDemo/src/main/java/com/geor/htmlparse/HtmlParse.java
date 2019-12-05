package com.geor.htmlparse;

import java.io.File;
import java.util.HashMap;

import net.sf.json.JSONObject;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.geor.SecUtils;

public class HtmlParse {
	
	
	public static void main(String[] args) throws Exception {
		
//		parseHtmlPageByid();
//		
//		parseHtmlPageByClassName();
		
		accessName();
		
	}
	
	/**
	 * 通过id获取元素内容
	 * */
	public static void  parseHtmlPageByid() throws Exception{
		File baseInfo_file = new File("C:\\Users\\Administrator\\Desktop\\html\\jsgs\\BaseInfo.html");
		Document baseinfo_doc = null;
		if(baseInfo_file.exists()){
			baseinfo_doc = Jsoup.parse(baseInfo_file, "UTF-8");
		}
		HtmlElementEntity gs = parseJbGsBaseInfoFromJSGSFile(baseinfo_doc);
		
		System.out.println(gs);
	}
	/**
	 * 通过class获取元素内容
	 * */
	public static void  parseHtmlPageByClassName() throws Exception{
		File baseInfo_file = new File("C:\\Users\\Administrator\\Desktop\\html\\qgs\\BaseInfo.html");
		Document baseinfo_doc = null;
		if(baseInfo_file.exists()){
			baseinfo_doc = Jsoup.parse(baseInfo_file, "UTF-8");
		}
		
		HtmlElementEntity gs = parseJbGsBaseInfoFromFile(baseinfo_doc);
		
		System.out.println(gs);
		
	}
	
	public static  HtmlElementEntity parseJbGsBaseInfoFromJSGSFile(Document doc ) throws Exception{
		String xinyongdaima = null;
		String companyName = null;
		String gongsileixing = null;
		String farenmingcheng = null;
		String zhuceziben = null;
		String chengliriqi = null;
		String yingyeqixian = null;
		String dengjijiguan = null;
		String hezhunriqi = null;
		String jingyingzhuangtai = null;
		String qiyedizhi = null;
		String jingyingfanwei = null;
		// 2013-06-25 至 无固定期限  
		HtmlElementEntity jbgs = new HtmlElementEntity();
		// xinyongdaima
		try {
			xinyongdaima = doc.getElementById("REG_NO").text() ;
		} catch (Exception e) {
		}
		//companyName
		try {
			companyName = doc.getElementById("CORP_NAME").text() ;
		} catch (Exception e) {
		}
		if(StringUtils.isBlank(xinyongdaima) && StringUtils.isBlank(companyName)){
			return null;
		}
		//gongsileixing
		try {
			gongsileixing = doc.getElementById("ZJ_ECON_KIND").text() ;
		} catch (Exception e) {
		}
		//farenmingcheng
		try {
			farenmingcheng = doc.getElementById("OPER_MAN_NAME").text() ;
		} catch (Exception e) {
		}
		//zhuceziben
		try {
			zhuceziben = doc.getElementById("REG_CAPI").text() ;
		} catch (Exception e) {
		}
		if(StringUtils.isBlank(zhuceziben)){
			try {
				zhuceziben = doc.getElementById("REG_CAPI_WS").text() ;
			} catch (Exception e) {
				
			}
		}
		//chengliriqi
		try {
			chengliriqi = doc.getElementById("START_DATE").text() ;
		} catch (Exception e) {
		}
		if(StringUtils.isNotBlank(chengliriqi)){
			chengliriqi = chengliriqi.replace("年", "-").replace("月", "-").replace("日", "");
		}
		//yingyeqixianStrt
		String yingyeqixian_start = "";
		try {
			yingyeqixian_start = doc.getElementById("FARE_TERM_START").text() ;
		} catch (Exception e) {
		}
		if(StringUtils.isNotBlank(yingyeqixian_start)){
			yingyeqixian_start = yingyeqixian_start.replace("年", "-").replace("月", "-").replace("日", "");
		}
		String yingyeqixian_end = "";
		try {
			yingyeqixian_end = doc.getElementById("FARE_TERM_END").text() ;
		} catch (Exception e) {
		}
		if(StringUtils.isNotBlank(yingyeqixian_end)){
			yingyeqixian_end = yingyeqixian_end.replace("年", "-").replace("月", "-").replace("日", "");
		}
		if(StringUtils.isBlank(yingyeqixian_start)){
			yingyeqixian_start = "";
		}
		if(StringUtils.isBlank(yingyeqixian_end)){
			yingyeqixian_end = "";
		}
		yingyeqixian =yingyeqixian_start+" 至 "+yingyeqixian_end;
		//dengjijiguan
		try {
			dengjijiguan = doc.getElementById("BELONG_ORG").text() ;
		} catch (Exception e) {
		}
		//hezhunriqi
		try {
			hezhunriqi = doc.getElementById("CHECK_DATE").text() ;
		} catch (Exception e) {
		}
		if(StringUtils.isNotBlank(hezhunriqi)){
			hezhunriqi = hezhunriqi.replace("年", "-").replace("月", "-").replace("日", "");
		}
		//jingyingzhuangtai
		try {
			jingyingzhuangtai = doc.getElementById("CORP_STATUS").text() ;
		} catch (Exception e) {
		}
		//qiyedizhi
		try {
			qiyedizhi = doc.getElementById("ADDR").text() ;
		} catch (Exception e) {
		}
		if(StringUtils.isBlank(qiyedizhi)){
			try {
				qiyedizhi = doc.getElementById("FARE_PLACE").text() ;
			} catch (Exception e) {

			}
		}
//		jingyingfanwei
		try {
			jingyingfanwei = doc.getElementById("FARE_SCOPE").text() ;
		} catch (Exception e) {
		}
		if (StringUtils.isNotBlank(companyName) && StringUtils.isNotBlank(xinyongdaima)) {
			long curr_time = System.currentTimeMillis();
			jbgs.setId(SecUtils.getUUID());
			jbgs.setXinyongdaima(xinyongdaima);
			jbgs.setCompanyname(companyName);
			jbgs.setGongsileixing(gongsileixing);
			jbgs.setFarenmingcheng(farenmingcheng);
			jbgs.setZhuceziben(zhuceziben);
			jbgs.setChengliriqi(chengliriqi);
			jbgs.setYingyeqixian(yingyeqixian);
			jbgs.setDengjijiguan(dengjijiguan);
			jbgs.setHezhunriqi(hezhunriqi);
			jbgs.setJingyingzhuangtai(jingyingzhuangtai);
			jbgs.setQiyedizhi(qiyedizhi);
			jbgs.setJingyingfanwei(jingyingfanwei);
			jbgs.setUpdatetime(curr_time);
		}else{
			return null;
		}
//		System.out.println(jbgs);
		return jbgs;
	}
	
    public static HtmlElementEntity parseJbGsBaseInfoFromFile(Document doc) throws Exception{
		String companyName = null;
		HtmlElementEntity jbgs = null;
		//*[@id="Baseinfo"]/table/tbody/tr[1]
		try {
			companyName = doc.getElementById("company-top").getElementsByTag("div").get(0).getElementsByTag("div").get(1)
	    			.getElementsByTag("div").get(0).getElementsByTag("h1").get(0).text();
		} catch (Exception e) {
			
		}
		if (StringUtils.isEmpty(companyName)) {
			try {
				companyName = doc.getElementsByTag("h1").first().text();
			} catch (Exception e) {

			}
		}
		if (StringUtils.isEmpty(companyName)) {
			try {
				companyName = doc.getElementById("company-top").getElementsByTag("div").get(0).getElementsByTag("div").get(1)
		    			.getElementsByTag("div").get(0).text();
			} catch (Exception e) {

			}

		}
		String zhuangtai = null;
		if (StringUtils.isEmpty(companyName)) { // 社会组织
			try {
				String name = doc.select("[class='row title']").first().text() ;
				if (StringUtils.isNotBlank(name) && name.indexOf(" ") > -1) {
					String[] name_zhuangtai = name.split(" ");
					companyName = name_zhuangtai[0];
					zhuangtai = name_zhuangtai[1];
				}
			} catch (Exception e) {

			}
		}
		if (StringUtils.isNotBlank(companyName)
				&& companyName.indexOf(" ") > -1) {
			companyName = companyName.split(" ")[0];
		}
		// 工商信息
		Elements gsxx_trs = null;
		//*[@id="Baseinfo"]/table/tbody/tr[1]
		try {
			gsxx_trs = doc.getElementById("Cominfo").getElementsByTag("table").get(1).getElementsByTag("tbody").get(0).getElementsByTag("tr");
		} catch (Exception e) {

		}
		if(CollectionUtils.isEmpty(gsxx_trs)){
			try {
				gsxx_trs = doc.getElementById("Cominfo").getElementsByTag("table").get(0).getElementsByTag("tbody").get(0).getElementsByTag("tr");
			} catch (Exception e) {
			
			}
		}
		if(CollectionUtils.isEmpty(gsxx_trs)){
			try {
				gsxx_trs = doc.getElementById("Baseinfo").getElementsByTag("table").get(0).getElementsByTag("tbody").get(0).getElementsByTag("tr");
			} catch (Exception e) {
				
			}
		}
		if (CollectionUtils.isEmpty(gsxx_trs)) {
			gsxx_trs = doc.getElementById("registerInfo").getElementsByTag("table").get(0)
					.getElementsByTag("tbody").get(0).getElementsByTag("tr");
		}
		// 社会组织
		if(CollectionUtils.isEmpty(gsxx_trs)){
			try {
				gsxx_trs = doc.getElementById("Cominfo").getElementsByTag("table").get(0)
						.getElementsByTag("tbody").get(0).getElementsByTag("tr");
			} catch (Exception e) {

			}
		}		
		if (StringUtils.isNotBlank(companyName)
				|| CollectionUtils.isNotEmpty(gsxx_trs)) {
			long curr_time = System.currentTimeMillis();
			jbgs = new HtmlElementEntity();
			jbgs.setUpdatetime(curr_time);
			jbgs.setId(SecUtils.getUUID());
			jbgs.setCompanyname(companyName);
			jbgs.setJingyingzhuangtai(zhuangtai); // 首先填充值,避免后续页面结构不同，取不到公司经营状态
		}
		String faren = null;
		try {
			faren = doc.select("[class='bname']").text();
			if (faren == null) {
				faren =  doc.select("[class='bcom']").text();
			}
			if (StringUtils.isNotBlank(faren)) {
				jbgs.setFarenmingcheng(faren.trim());// 法人名称/合伙人名称
			}
		} catch (Exception e) {

		}
		for (Element gsxx_tr : gsxx_trs) {
			Elements tds = null;
			try {
				tds = gsxx_tr.getElementsByTag("td");
			} catch (Exception e) {
				continue;
			}
			if (CollectionUtils.isNotEmpty(tds)) {
				String td_name_1 = tds.get(0).text();
				String td_value_1 = tds.get(1).text();
				if (StringUtils.isNotBlank(td_name_1)
						&& td_name_1.contains("注册资本")) {
					jbgs.setZhuceziben(td_value_1);
				} else if (StringUtils.isNotBlank(td_name_1)
						&& td_name_1.contains("经营状态")) {
					jbgs.setJingyingzhuangtai(td_value_1);
				} else if (StringUtils.isNotBlank(td_name_1)
						&& td_name_1.contains("统一社会信用代码")) {
					jbgs.setXinyongdaima(td_value_1);
				} else if (StringUtils.isNotBlank(td_name_1)
						&& td_name_1.contains("注册号")) {
					jbgs.setZhucehao(td_value_1);
				} else if (StringUtils.isNotBlank(td_name_1)
						&& td_name_1.contains("公司类型")) {
					jbgs.setGongsileixing(td_value_1);
				} else if (StringUtils.isNotBlank(td_name_1)
						&& td_name_1.contains("核准日期")) {
					jbgs.setHezhunriqi(td_value_1);
				} else if (StringUtils.isNotBlank(td_name_1)
						&& td_name_1.contains("所属地区")) {
					jbgs.setSuoshudiqu(td_value_1);
				} else if (StringUtils.isNotBlank(td_name_1)
						&& td_name_1.contains("曾用名")) {
					jbgs.setCengyongming(td_value_1);
				} else if (StringUtils.isNotBlank(td_name_1)
						&& td_name_1.contains("人员规模")) {
					jbgs.setRenyuanguimo(td_value_1);
				} else if (StringUtils.isNotBlank(td_name_1)
						&& td_name_1.contains("企业地址")) {
					if (StringUtils.isNotBlank(td_value_1)) {
						td_value_1 = td_value_1.replace("查看地图", "");
						td_value_1 = td_value_1.replace("附近公司", "");
					}
					jbgs.setQiyedizhi(td_value_1);
				} else if (StringUtils.isNotBlank(td_name_1)
						&& td_name_1.contains("经营范围")) {
					jbgs.setJingyingfanwei(td_value_1);
				}
				// 兼容社会机构的页面结构
				else if (StringUtils.isNotBlank(td_name_1)
						&& td_name_1.contains("法人/负责人")) {
					jbgs.setFarenmingcheng(td_value_1);
				} else if (StringUtils.isNotBlank(td_name_1)
						&& td_name_1.contains("成立日期")) {
					jbgs.setChengliriqi(td_value_1);
				} else if (StringUtils.isNotBlank(td_name_1)
						&& td_name_1.contains("社会组织类型")) {
					jbgs.setGongsileixing(td_value_1);
				} else if (StringUtils.isNotBlank(td_name_1)
						&& td_name_1.contains("发证机关")) {
					jbgs.setDengjijiguan(td_value_1);
				} else if (StringUtils.isNotBlank(td_name_1)
						&& td_name_1.contains("业务范围")) {
					jbgs.setJingyingfanwei(td_value_1);
				} else if (StringUtils.isNotBlank(td_name_1)
						&& td_name_1.contains("住所")) {
					jbgs.setQiyedizhi(td_value_1);
				}
				// 兼容社会机构的页面结构 END
				// 兼容香港公司页面结构
				else if (StringUtils.isNotBlank(td_name_1)
						&& td_name_1.contains("董事长")) {
					jbgs.setFarenmingcheng(td_value_1);
				} else if (StringUtils.isNotBlank(td_name_1)
						&& td_name_1.contains("公司编号")) {
					jbgs.setZhucehao(td_value_1);
				} else if (StringUtils.isNotBlank(td_name_1)
						&& td_name_1.contains("备注")) {
					jbgs.setJingyingfangshi(td_value_1);
				} else if (StringUtils.isNotBlank(td_name_1)
						&& td_name_1.contains("重要事项")) {
					jbgs.setJingyingfanwei(td_value_1);
				}
				// 兼容基金会 基金会名称
				else if (StringUtils.isNotBlank(td_name_1)
						&& td_name_1.contains("基金会名称")) {
					jbgs.setCompanyname(td_value_1);
				}else if (StringUtils.isNotBlank(td_name_1)
						&& td_name_1.contains("英文名")) {
					jbgs.setYingwenming(td_value_1);
				}else if (StringUtils.isNotBlank(td_name_1)
						&& td_name_1.contains("信用代码")) {
					jbgs.setXinyongdaima(td_value_1);
				}else if (StringUtils.isNotBlank(td_name_1)
						&& td_name_1.contains("理事长")) {
					jbgs.setFarenmingcheng(td_value_1);
				}else if (StringUtils.isNotBlank(td_name_1)
						&& td_name_1.contains("业务范围")) {
					jbgs.setJingyingfanwei(td_value_1);
				}else if (StringUtils.isNotBlank(td_name_1)
						&& td_name_1.contains("基金会范围")) {
					jbgs.setSuoshudiqu(td_value_1);
				}else if (StringUtils.isNotBlank(td_name_1)
						&& td_name_1.contains("基金会地址")) {
					jbgs.setQiyedizhi(td_value_1);
				}
				// END 
				if (tds.size() >= 4) {
					String td_name_2 = tds.get(2).text();
					String td_value_2 = tds.get(3).text();
					if (StringUtils.isNotBlank(td_name_2)
							&& td_name_2.contains("实缴资本")) {
						jbgs.setShijiaoziben(td_value_2);
					} else if (StringUtils.isNotBlank(td_name_2)
							&& td_name_2.contains("成立日期")) {
						jbgs.setChengliriqi(td_value_2);
					} else if (StringUtils.isNotBlank(td_name_2)
							&& td_name_2.contains("纳税人识别号")) {
						jbgs.setNashuirenshibiehao(td_value_2);
					} else if (StringUtils.isNotBlank(td_name_2)
							&& td_name_2.contains("组织机构代码")) {
						jbgs.setZuzhijiegoudaima(td_value_2);
					} else if (StringUtils.isNotBlank(td_name_2)
							&& td_name_2.contains("所属行业")) {
						jbgs.setSuoshuhangye(td_value_2);
					} else if (StringUtils.isNotBlank(td_name_2)
							&& td_name_2.contains("登记机关")) {
						jbgs.setDengjijiguan(td_value_2);
					} else if (StringUtils.isNotBlank(td_name_2)
							&& td_name_2.contains("英文名")) {
						jbgs.setYingwenming(td_value_2);
					} else if (StringUtils.isNotBlank(td_name_2)
							&& td_name_2.contains("经营方式")) {
						jbgs.setJingyingfangshi(td_value_2);
					} else if (StringUtils.isNotBlank(td_name_2)
							&& td_name_2.contains("营业期限")) {
						jbgs.setYingyeqixian(td_value_2);
					}
					// 兼容社会机构
					else if (StringUtils.isNotBlank(td_name_2)
							&& td_name_2.contains("注册资本")) {
						jbgs.setZhuceziben(td_value_2);
					} else if (StringUtils.isNotBlank(td_name_2)
							&& td_name_2.contains("登记状态")) {
						jbgs.setJingyingzhuangtai(td_value_2);
					} else if (StringUtils.isNotBlank(td_name_2)
							&& td_name_2.contains("登记机关")) {
						jbgs.setDengjijiguan(td_value_2);
					} else if (StringUtils.isNotBlank(td_name_2)
							&& td_name_2.contains("证书有效期")) {
						jbgs.setYingyeqixian(td_value_2);
					}
					// 兼容社会机构 END
					// 兼容香港公司页面结构
					else if (StringUtils.isNotBlank(td_name_2)
							&& td_name_2.contains("股本")) {
						jbgs.setZhuceziben(td_value_2);
					} else if (StringUtils.isNotBlank(td_name_2)
							&& td_name_2.contains("公司类别")) {
						jbgs.setGongsileixing(td_value_2);
					} else if (StringUtils.isNotBlank(td_name_2)
							&& td_name_2.contains("公司现况")) {
						jbgs.setJingyingzhuangtai(td_value_2);
					}
					// 兼容基金会
					 else if (StringUtils.isNotBlank(td_name_2)
								&& td_name_2.contains("登记部门")) {
						jbgs.setDengjijiguan(td_value_2);
					} else if (StringUtils.isNotBlank(td_name_2)
							&& td_name_2.contains("原始基金")) {
						jbgs.setZhuceziben(td_value_2);
					}
					// END
				}
			}
		}
		return jbgs;
	}		
    
    
    
    // 泰州同事提供 
	public static void accessJsgs() throws Exception{
		String jiyanUrl = "http://www.jsgsj.gov.cn:58888/ecipplatform/jiangsu.jsp?org=D7AAF49ABDED20EA0E281524C450AE45&id=7165C0A9B69D2A073DC68312D6850450&seqId=CCA7EE407E7F65448684F2EBD6A63133&activeTabId=";
//		Connection geor_conn = Jsoup.connect(jiyanUrl);
//		geor_conn.method(Method.GET);
//		String content = null;
//		try {
//			content = geor_conn.timeout(10000).execute().
//		} catch (Exception e) {
//			System.out.println("请求 "+jiyanUrl+" 失败..");
//		}
//		FileUtils.writeToFile(content);

		try{
		    //建立请求客户端
		    CloseableHttpClient httpClient = HttpClients.createDefault();
		    //使用HttpGet方式请求网址
		    HttpGet httpGet = null;
		    //获取网址的返回结果
		    CloseableHttpResponse response = null;
//		    response = httpClient.execute(httpGet);
		    //获取返回结果中的实体
		    HttpEntity entity = null;

		    //将返回的实体转换成字符串形式	    
		    String responseStr = null;
//		    String messageStr = responseStr.substring(responseStr.indexOf("dataObj[\"org\"]")
//		    		, responseStr.indexOf("dataObj[\"tmp\"]"));
		    
		    //解析返回的字符串，获取相关信息
//		    String org = messageStr.substring(messageStr.indexOf("org")+7
//		    		, messageStr.indexOf("org")+7+32);
//		    String id = messageStr.substring(messageStr.indexOf("id")+6
//		    		, messageStr.indexOf("id")+6+32);
//		    String seqId = messageStr.substring(messageStr.indexOf("seqId")+9
//		    		, messageStr.indexOf("seqId")+9+32);
//		    String abnormal = "";
//		    String activeTabId = "";
//		    int tmp = (int) (Math.random()*100+1);
		    
		    // 发送二次请求
//		    requestUrl = "http://www.jsgsj.gov.cn:58888/ecipplatform/publicInfoQueryServlet.json?";
//		    String queryStr = requestUrl+"pageView=true&"+"org="+org+"&id="+id+"&seqId="+seqId+"&abnormal="+abnormal
//		    		+"&activeTabId="+activeTabId+"&tmp="+tmp;

		    httpGet = new HttpGet(jiyanUrl);
		    response = httpClient.execute(httpGet);
		    entity = response.getEntity();
		    responseStr = EntityUtils.toString(entity);
		    
		    // 解析返回的JSON字符串
		    JSONObject jsonObject = JSONObject.fromObject(responseStr);
		    
		    HashMap<String, String> companyInfoMap = new HashMap<String,String>();
		    companyInfoMap.put("CORP_NAME", (String)jsonObject.get("CORP_NAME")); //公司名称
		    companyInfoMap.put("REG_NO", (String)jsonObject.get("REG_NO")); //统一信用代码

		}catch(Exception e){
		}		
	}
	
	// 泰州同事提供 
	public static void accessName () throws Exception{
		try{
			String requestUrl = "http://www.jsgsj.gov.cn:58888/province/infoQueryServlet.json?pt&c=75B161B67BE862B1A6E1704489AFFD2BFD3CDD0C1C1A0DEFE8405030D3BC6172C559C67D0D8030BC5C8E1E813068134896674C0571A38745A1B7182234F3E58A";
		    //建立请求客户端
		    CloseableHttpClient httpClient = HttpClients.createDefault();
		    //使用HttpGet方式请求网址
		    HttpGet httpGet = new HttpGet(requestUrl);
		    //获取网址的返回结果
		    CloseableHttpResponse response = null;
		    response = httpClient.execute(httpGet);
		    //获取返回结果中的实体
		    HttpEntity entity = response.getEntity();

		    //将返回的实体转换成字符串形式	    
		    String responseStr = EntityUtils.toString(entity);
		    String messageStr = responseStr.substring(responseStr.indexOf("dataObj[\"org\"]")
		    		, responseStr.indexOf("dataObj[\"tmp\"]"));
		    
		    //解析返回的字符串，获取相关信息
		    String org = messageStr.substring(messageStr.indexOf("org")+7
		    		, messageStr.indexOf("org")+7+32);
		    String id = messageStr.substring(messageStr.indexOf("id")+6
		    		, messageStr.indexOf("id")+6+32);
		    String seqId = messageStr.substring(messageStr.indexOf("seqId")+9
		    		, messageStr.indexOf("seqId")+9+32);
		    String abnormal = "";
		    String activeTabId = "";
		    int tmp = (int) (Math.random()*100+1);
		    
		    // 发送二次请求
		    requestUrl = "http://www.jsgsj.gov.cn:58888/ecipplatform/publicInfoQueryServlet.json?";
		    String queryStr = requestUrl+"pageView=true&"+"org="+org+"&id="+id+"&seqId="+seqId+"&abnormal="+abnormal
		    		+"&activeTabId="+activeTabId+"&tmp="+tmp;

		    httpGet = new HttpGet(queryStr);
		    response = httpClient.execute(httpGet);
		    entity = response.getEntity();
		    responseStr = EntityUtils.toString(entity);
		    
		    // 解析返回的JSON字符串
		    JSONObject jsonObject = JSONObject.fromObject(responseStr);
		    
		    HashMap<String, String> companyInfoMap = new HashMap<String,String>();
		    companyInfoMap.put("CORP_NAME", (String)jsonObject.get("CORP_NAME")); //公司名称
		    companyInfoMap.put("REG_NO", (String)jsonObject.get("REG_NO")); //统一信用代码
		    System.out.println(companyInfoMap);
//			return JQReturn.ok(companyInfoMap);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
