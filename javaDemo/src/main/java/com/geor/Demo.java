

package com.geor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
	
	
	static Map<String,String> i_m = new HashMap<String, String>() ;
	static  Map<String,String> m = Collections.unmodifiableMap(i_m) ;
	
	public static void main(String[] args) throws Exception{
		
//		int a = 'a';
		
		
		
//		System.out.println(a);
		
		
//		LinkedList<String> list = new LinkedList<String>();
//		
//		list.add("1");
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		
//		
//		while(list.peek()!=null){
//			System.out.println(list.remove(list.size()-1));
//		}
		
//		Map<String,String> map = new HashMap<String, String> ();
//		map.put("1", "1");
//		
//		
//		URL url = Demo.class.getClass().getResource("/log.txt");
//		
//		System.out.println(Demo.class.getName());
//		
//		System.out.println(url.getPath());
		
		
//		map.put("a", "b");
//		map.put("A", "B");
//		map.put("a", "11D");
//		map.put("1a", "1b");
		
//		System.out.println("\r".hashCode());
//		System.out.println("!="+("!".hashCode()));
//		System.out.println("1="+("1".hashCode()));
//		System.out.println("A="+("A".hashCode()));
//		System.out.println("Q="+("Q".hashCode()));
//		System.out.println("a="+("a".hashCode()));
//		System.out.println("q="+("q".hashCode()));
//		System.out.println("'="+"'".hashCode());
		
		
//		System.out.println(System.identityHashCode("a"));
//		System.out.println("a".hashCode());
//		System.out.println(Objects.hashCode("a"));
		
		
//		
//		System.out.println(map);
		
//		System.out.println(15 & "1".hashCode());
//		System.out.println(15 & "A".hashCode());
//		System.out.println("1a".hashCode());
		
		
		//		StringBuffer sb = new StringBuffer();
//		
//		sb.append("1211");
//		
//		sb.delete(0, 1);
//		System.out.println(sb.toString());
//		
//		System.out.println(sb.capacity());
		
		
//		createRandomSql();
		
//		System.out.println("hello".indexOf("ll"));
		
//		createRandomSql ();
		
//		parse9000Err(); 
		
		parseTime();
//		parseDirTime();
		
//		parseTimeString();
		
//		spiderAccount();
		
//		parseString(); 
		
//		for(String s:args){
//			System.out.println(s);
//		}
		
//		String string = "<appDesc>	<apps>		<app>			<name>ycsq</name>			<clsid>6390A85C-E173-4CA4-AA13-3BA751F35851</clsid>			"
//				+ "<version>1.0</version>		</app>			<app>			<name>xd</name>			<clsid>7CAEF55B-FA62-4D54-A9B6-67F8F42A67BA</clsid>			"
//				+ "<version>1.2</version>		</app>	</apps></appDesc>";
//	
//		
//		InputStream is = new ByteArrayInputStream(string.getBytes()) ;
//		
//		System.out.println();
		
		
//		File file = new File("C:\\Users\\Administrator\\Desktop\\db.properties");
//		
//		Properties pros = new Properties ();
//		
//		pros.load(new FileInputStream(file));
//		
//		System.out.println(pros.get("openoffice.home"));
		
		
//		
//		String s = new String("s");
//		String b = s;
//		s = null ;
//		System.out.println(s);
//		System.out.println(b);
		
//		yixingnianjian();
		
		
//		createSql();
		
		
		
//		System.out.println(new Integer(100) == new Integer(100));
		
		
		
//		List<String> list = new ArrayList<String> ();
//		
//		list.add("1");
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		
//		
//		Iterator<String> ite = list.iterator() ;
//		
//		while(ite.hasNext()){
//			String s = ite.next() ;
//			ite.remove();
//			list.add(s+"add");
//			
//			System.out.println("dele="+s+";add="+s+"add");
//		}
		
//		long ll = 1590716712000L;
//		
//		System.out.println(ll);
		
		
	}
	
	
	
	public static void yixingnianjian() throws Exception{
		File file = new File("C:\\Users\\Administrator\\Desktop\\宜兴.txt");
//		File file = new File("C:\\Users\\Administrator\\Desktop\\户名空白.txt");
		
		List<String> lines = FileUtils.readTxt(file);
		
		Set<String> set = new HashSet<String> ();
		List<String> repeatList = new ArrayList<String>();
		for(String line :lines){
			if(set.contains(line)){
				repeatList.add(line);
			}else{
				set.add(line);
			}
			
//			String [] strs = line.split("	");
//			if(strs.length==1){
//				System.out.println(strs[0]);
//			}
			
		}
		
		System.out.println("repeatList size:"+repeatList.size());
		System.out.println("set size:"+set.size());
		
		File ans = new File("D:/yixing.txt") ;
		ans.delete();
		
		for(String line :set){
			FileUtils.writeToFile(line, ans.getAbsolutePath());
		}
		
	}
	
	public static void spiderAccount() throws Exception{
		File file = new File("C:\\Users\\Administrator\\Desktop\\spiderAccount.txt");
		
		List<String> lines = FileUtils.readTxt(file) ;
		
		HashMap<String,Integer> accountCount = new HashMap<String, Integer>() ;
		for(String line:lines){
			Integer count = accountCount.get(line);
			count = count==null?0:count+1;
			accountCount.put(line, count);
		}
		
		for(Entry<String, Integer> entry:accountCount.entrySet()){
			System.out.println(entry.getKey()+"==="+entry.getValue());
		}
	}
	
	public static void parse9000Err() throws Exception{
		File file = new File("C:\\Users\\Administrator\\Desktop\\log\\罗山\\result.txt");
		
		List<String> lines = FileUtils.readTxt(file) ;
		
		Set<String> set = new HashSet<String> () ;
		for(String line :lines){
			set.add(line) ;
		}
		
		System.out.println(set.size());
		
		for(String s:set){
			System.out.println(s);
		}
		
	}
	
	
	public static void parseString (){
		String string = "fdasfsaf\r\nfldsajlf\r\nfdsafsafsaf\r\n";
		string = string.replace("\r", "").replace("\n", "") ;
		System.out.print(string);
	}
	
	public static void parseTimeString() throws Exception{
		File file = new File("C:\\Users\\Administrator\\Desktop\\2232.txt");
		
		List<String> lines = FileUtils.readTxt(file) ;
		
		Calendar cal = Calendar.getInstance() ;
		
		for(String line :lines){
			
			cal.setTimeInMillis(Long.parseLong(line));
			
			int year = cal.get(Calendar.YEAR) ;
			int month = cal.get(Calendar.MONTH)+1 ;
			int day = cal.get(Calendar.DAY_OF_MONTH) ;
			
			String date = String.format("%s%s%s", year,month>=10?month:"0"+month,day>=10?day:"0"+day) ;
			
			System.out.println(date);
			
		}
	}
	
	
	
	
	
	public static void parseGids () throws Exception{
		File file = new File("C:\\Users\\Administrator\\Desktop\\ssssss.txt");
		
		List<String> lines = FileUtils.readTxt(file) ;
		
		for(String s:lines){
			if(s.contains("values")){
				System.out.println(s);
			}
		}
		
	}
	
	
	public static void loadProp () throws Exception{
		
		Properties pro = new Properties();
		pro.load(new FileInputStream("E:\\hangzhou\\workspace\\gsxx\\src\\main\\webapp\\WEB-INF\\classes\\common.properties"));
		
		System.out.println(pro.get("threadsql"));
		
	}
	
	public static void digest() throws Exception{
		int [] weight = new int []{7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2,1};
		int [] checkDigit = new int []{1,0,'X',9,8,7,6,5,4,3,2};
		
		String idNo = "413026199712252745";
		
		int [] a = new int[17];
		
		String subIdNo = idNo.substring(0,17) ;
		
		System.out.println(subIdNo);
		
		int sum = 0 ;
		
		for(int i = 0 ;i<subIdNo.length();i ++){
//			a [i] = Integer.parseInt(String.valueOf(subIdNo.charAt(i)));
			
			sum = sum  + Integer.parseInt(String.valueOf(subIdNo.charAt(i))) * weight[i];
		}
		
		int rem = sum % 11 ;
		
		String dig = rem == 2?"X":String.valueOf(checkDigit[rem]) ;
		
		System.out.println(dig);
		
		
		
		
		
	}
	
	
	public static void createTime() throws Exception{
		File file = new File ("C:\\Users\\Administrator\\Desktop\\tims.txt");
		
		
		List<String> times = FileUtils.readTxt(file) ;
		
		Calendar cal = Calendar.getInstance() ;
		for(String t:times){
			Long l = Long.parseLong(t) ;
			
			cal.setTimeInMillis(l);
			
			System.out.println(String.format("%s-%s-%s %s:%s:%s", cal.get(Calendar.YEAR),cal.get(Calendar.MONTH)+1,
					cal.get(Calendar.DAY_OF_MONTH),
					cal.get(Calendar.HOUR_OF_DAY)>=10?cal.get(Calendar.HOUR_OF_DAY):"0"+cal.get(Calendar.HOUR_OF_DAY)
					,cal.get(Calendar.MINUTE)>=10?cal.get(Calendar.MINUTE):"0"+cal.get(Calendar.MINUTE),
					cal.get(Calendar.MINUTE)>=10?cal.get(Calendar.MINUTE):"0"+cal.get(Calendar.MINUTE)
					));
			
		}
	}
	
	
	public static void createArr() throws Exception {
		List<Double> doubleList = new ArrayList<Double> ();
		
//		doubleList.add(0.0d) ;
		doubleList.add(0.1d) ;
		doubleList.add(0.2d) ;
		doubleList.add(0.3d) ;
		doubleList.add(0.4d) ;
		doubleList.add(0.5d) ;
		doubleList.add(0.6d) ;
		doubleList.add(0.7d) ;
		doubleList.add(0.8d) ;
		doubleList.add(0.9d) ;
		
		List<Double []> list = new ArrayList<Double[]> ();
		
		for(int i = 0 ;i<doubleList.size() ;i ++){
			for(int j = 0;j<doubleList.size();j++){
				for(int k = 0;k<doubleList.size();k++){
					for(int l = 0;l<doubleList.size();l++){
						for(int m = 0;m<doubleList.size();m++){
							for(int n = 0;n<doubleList.size();n++){
								Double [] d = new Double[6];
								
								d[0] = doubleList.get(i) ;
								d[1] = doubleList.get(j) ;
								d[2] = doubleList.get(k) ;
								d[3] = doubleList.get(l) ;
								d[4] = doubleList.get(m) ;
								d[5] = doubleList.get(n) ;
								
								list.add(d) ;
								
//								System.out.println(d); 
								
							}
						}
					}	
				}	
			}
		}
		
		System.out.println(list.size());
		
		List<Double []> sumd = new ArrayList<Double[]> ();
		
		for(int i =0;i<list.size();i++){
			Double [] d = list.get(i) ;
			
			double sum = 0d;
			for(double ad :d){
				sum += ad ;
			}
			
			if(sum == 1){
				sumd .add(d) ;
				
				System.out.print(String.format("[%s,%s,%s,%s,%s,%s]", d));
				System.out.println();
				
			}
		}
		
		System.out.println(sumd.size());
		

	}
	
	
	
	public static void nio () throws Exception{
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\parse\\30.txt");
		
		FileChannel fisc = fis.getChannel() ;
		
		ByteBuffer fisby = ByteBuffer.allocate(1024 ) ;
		
		fisc.read(fisby) ;
		
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\parse\\30out.txt") ;
		
		FileChannel fosc = fos.getChannel() ;
		
		ByteBuffer fosby = ByteBuffer.allocate(1024) ;
		
	}
	
	public static int calc (int p){
		if (p <=2){
			return 1;
		}else{
			return calc(p-1)+calc(p-2);
		}
		
	}
	
	public static void compileTwoFiles() throws Exception{
		File file = new File("C:\\Users\\Administrator\\Desktop\\0909\\29882.txt");
		File file2 = new File("C:\\Users\\Administrator\\Desktop\\0909\\31208.txt");
		
		List<String> lines1= FileUtils.readTxt(file);
		List<String> lines2 = FileUtils.readTxt(file2) ;
		
		System.out.println("===============================");
		
		Set<String> set = new HashSet<String>() ;
		
		for(String line :lines2){
			if(!lines1.contains(line)){
				set.add(line);
//				System.out.println(line);
			}
		}
		
		
		System.out.println(set.size());
		
		for(String line:set){
			if(line.endsWith("委员会") || line.endsWith("户") || line.endsWith("中心") || line.endsWith("队") || line.endsWith("办公室") || line.endsWith("食堂")){
//				System.out.println(line);
			}else{
				System.out.println(line);
			}
		}
		
		
	}
	
	
	public static void parseJiangYinBuXiangFu() throws Exception{
		File f1728 = new File("C:\\Users\\Administrator\\Desktop\\parse\\1728.txt");
		File f116 = new File("C:\\Users\\Administrator\\Desktop\\parse\\1728.txt");
//		File databaseall = new File("C:\\Users\\Administrator\\Desktop\\parse\\databaseall.txt");
//		File jiangyinbuxiangfu = new File("C:\\Users\\Administrator\\Desktop\\parse\\jiangyinbuxiangfu.txt");
//		File dir = new File("C:\\Users\\Administrator\\Desktop\\parse\\dir.txt");
		
		
		Set<String> coms = new HashSet<String>();
		
//		List<String> dirs = FileUtils.readTxt(dir) ;
//		List<String> databasealls = FileUtils.readTxt(databaseall) ;
//		List<String> jiangyinbuxiangfus = FileUtils.readTxt(jiangyinbuxiangfu) ;
		
//		for(String s:jiangyinbuxiangfus){
//			coms.add(s) ;
//		}
//		
//		System.out.println(jiangyinbuxiangfus.size());
		
//		System.out.println(coms.size());
//		System.out.println(jiangyinbuxiangfus.size());
		
//		List<String> f1728s = FileUtils.readTxt(f1728) ;
//		
//		for(String s:jiangyinbuxiangfus){
//			if(!f1728s.contains(s)){
//				System.out.println(s);
//			}
//		}
		
//		for(String ){
//			
//		}
		
//		for(String line:jiangyinbuxiangfus){
//			if(databasealls.contains(line)){
//				if(line.endsWith("公司")){
////					System.out.println(line);
//				}
////				System.out.println(line);
//			}else{
//				System.out.println("不存在:"+line);
//			}
//		}
//		
	}
		public static void parseDirTime() throws Exception{
//			File file = new File("F:\\BaiduNetdiskDownload\\yixing2019\\jietu\\");
//			File [] firstDirs = file.listFiles() ;
//			for(File firstDir :firstDirs){
//				File [] subFiles = firstDir.listFiles() ;
//				for(File subFile:subFiles){
//					FileUtils.writeToFile(String.format("type=%s,path=%s", subFile.isDirectory()?"dir":"file",subFile.getAbsoluteFile()),
//							"D:/filepath.txt");
//				}
//			}
			
			File file = new File("F:\\BaiduNetdiskDownload\\yixing2019\\filepath.txt");
			
			List<String> lines = FileUtils.readTxt(file) ;
			
			for(String line:lines){
				
//				System.out.println(line.substring(line.lastIndexOf(File.separator)));
//				
//				File f = new File(line.substring(line.lastIndexOf(File.separator)));
//				
//				f.createNewFile() ;
//				
//				System.out.println(f.getAbsolutePath());
				
				FileUtils.writeToFile(line.substring(line.lastIndexOf(File.separator)+1).indexOf("_")>-1?
						line.substring(line.lastIndexOf(File.separator)+1).split("_")[1]:
							line.substring(line.lastIndexOf(File.separator)+1),"D:/dirTimes.txt");
			}
		}
		
		
		
		
		public static void parseTime() throws Exception{
//		File file = new File("C:\\Users\\Administrator\\Desktop\\2132.txt");
		File file = new File("D:/dirTimes.txt");
		
		List<String> lines = FileUtils.readTxt(file) ;
		
		
		Map<String,Integer> mapCount = new HashMap<String, Integer>();
		
		for(String line:lines){
			Long l = Long.parseLong(line) ;
			Calendar cal = Calendar.getInstance() ;
			cal.setTimeInMillis(l);
			
			int year = cal.get(Calendar.YEAR) ;
			int month = cal.get(Calendar.MONTH)+1 ;
			int day = cal.get(Calendar.DAY_OF_MONTH) ;
			
			String date = String.format("%s%s%s", year,month>=10?month:"0"+month,day>=10?day:"0"+day) ;
			
			if(mapCount.get(date)==null){
				mapCount.put(date, 0);
			}
			
			Integer count = mapCount.get(date) ;
			
			count += 1;
			
			mapCount.put(date, count) ;
			
		}
		
		List<String> dateList = new ArrayList<String> ();
		for(Entry<String, Integer> en:mapCount.entrySet()){
		
			dateList.add(en.getKey()) ;
			
//			System.out.println(en.getKey()+":"+en.getValue());
		}
		
		Collections.sort(dateList);
		
		int all = 0 ;
		
		for(String s:dateList){
			
			all += mapCount.get(s) ;
			System.out.println(s+":"+mapCount.get(s));
		}
		
		System.out.println(all);
		
		
	} 
	
	
	public static String [] arr = {"0","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	
	public static String findNextSeqNo(String seq){
		
		seq = seq.toUpperCase() ;
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		for(int index = 0;index <arr.length;index ++){
			map.put(arr[index],index) ;
		}
		boolean isNum = isNumeric(seq) ;
		if(isNum){
			Integer numberSeq = Integer.parseInt(seq);
			numberSeq ++ ;
			if(numberSeq<=9999){
				String returnSeq = String.valueOf(numberSeq) ;
				int length = String.valueOf(numberSeq).length() ;
				
				for(int preIndex =0;preIndex<seq.length()-length;preIndex++){
					returnSeq = "0"+returnSeq ;
				}
				
				return returnSeq ;
			}else{ // >9999
				return "000A";
			}
		}else{
			
			String preStr = seq.substring(0,seq.length()-1);
			String lastLetter = seq.substring(seq.length()-1) ;
			
			int index = map.get(lastLetter) ;
			
			if(index<arr.length-1){
				return preStr+arr[++index];
			}
			
			char [] charArr = preStr.toCharArray() ;
			for(int i=charArr.length-1;i>=0;i--){ // 倒序获取最后一个,如果最后一个为Z,则依次获取前一个
				String last = String.valueOf(charArr[i]) ;
				index = map.get(last) ;
				index += 1 ;
				if(index>arr.length-1){
					continue ;
				}
				String now = arr[index];
				String nowPre = preStr.substring(0, i) ; // 前边几位字符串
				
				String houZhui = "";
				for(int hz =0;hz<seq.length()-1-i;hz++){
					houZhui += "0";
				}
				
				return nowPre +now+houZhui;
			}
		}
		return "max" ;
	}
	
	/**
	 * integer [0, MAX), only numeric
	 */
	public final static String REGEX_NUMERIC = "^\\d+$"; //$NON-NLS-1$
	
	private static boolean isMatch(String regex, String orginal) {
		if (orginal == null || orginal.trim().equals("")) { //$NON-NLS-1$
			return false;
		}
		Pattern pattern = Pattern.compile(regex);
		Matcher isNum = pattern.matcher(orginal);
		return isNum.matches();

	}
	

	/**
	 * 非负整数[0,MAX)
	 * @param orginal
	 * @return boolean
	 */
	public static boolean isNumeric(String orginal) {
		return isMatch(REGEX_NUMERIC, orginal);
	}
	
	public static void getDirName(){
		File file = new File("C:\\Users\\Administrator\\Desktop\\caijishibai");
		
		File [] fs = file.listFiles() ;
		
		for(File f :fs){
			if(f.isDirectory()){
				File [] files = f.listFiles() ;
				
				if(files!=null && files.length==1){
					if(files[0].getName().equals("查询失败.txt")){
						System.out.println(f.getName().substring(0,f.getName().indexOf("_")));
					}
				}
			}
		}
	}
	
	public static void getZNComName() throws Exception{
		
		File file = new File("C:\\Users\\Administrator\\Desktop\\jiangyin\\an.txt");
		
		List<String> lines = FileUtils.readTxt(file) ;
		
		for(String line:lines){
			if(line.endsWith(".zip")){
				continue;
			}
			if(!line.contains("_")){
				continue;
			}
			String [] names = line.split("_");
			
			String comName = names[0];
			String time = names[1];
			
			if(Long.parseLong(time)>1563584763000L){
				System.out.println(comName);
			}
			
			
			
			
		}
	}
	
	public static void createSql() throws Exception{
//		File file = new File("C:\\Users\\Administrator\\Desktop\\0909\\sql.txt");
		File file = new File("D:\\yixing.txt");

//		String sql = "INSERT INTO `gsxx`.`t_qcc_query_keyword_baseinfo` (`id`, `querykeyword`, `queryurl`, `parentkeyword`, `queryaccount`, `type`, `worktype`, `xinxiweidu`, `time`, `zhuangtai`, `deep`, `updatetime`) VALUES "
//				+ "('%s', '%s', NULL, NULL, 'jiangyin', 'name', 'queryinfo', 'baseinfo', '2656949000', '0', NULL, '%s');";
		
		String sql = "INSERT INTO `t_qcc_query_keyword` (`id`, `querykeyword`, `queryurl`, `parentkeyword`, `queryaccount`, `type`, `worktype`, `xinxiweidu`, `time`, `zhuangtai`, `deep`, `updatetime`, `inserttime`, "
				+ "`batchno`) VALUES ('%s', '%s', NULL, NULL, 'yixing', 'name', 'shortcutyixing', NULL, '2599941000', '0', NULL, '%s', NULL, null);";
		
		List<String> lines = FileUtils.readTxt(file) ;
		
		File c_f = new File("D:/sql.sql");
		
		c_f.delete() ;
		
		for(String line :lines){
			
			String content = String.format(sql, SecUtils.getUUID(),line,System.currentTimeMillis()) ;
			
			FileUtils.writeToFile(content, c_f.getAbsolutePath());
			
			Thread.sleep(2); 
			
		}
	}
	public static void createRandomSql() throws Exception{
		
		String sql = "INSERT INTO `t_qcc_query_keyword_baseinfo` (`id`, `querykeyword`, `queryurl`, `parentkeyword`, `queryaccount`, `type`, `worktype`, `xinxiweidu`, `time`, `zhuangtai`, `deep`, `updatetime`) VALUES "
				+ "('%s', '%s', NULL, NULL, 'jiangyin', 'name', 'queryinfo', 'baseinfo', '2656949000', '0', NULL, '%s');";
		
//		String sql = "INSERT INTO `t_qcC_QUERY_KEYWORD` (`ID`, `QUERYKEYWORD`, `QUERYURL`, `PARENTKEYWORD`, `QUERYACCOUNT`, `TYPE`, `WORKTYPE`, `XINXIWEIDU`, `TIME`, `ZHUANGTAI`, `DEEP`, `UPDATETIME`, `INSERTTIME`, "
//				+ "`BATCHNO`) VALUES ('%S', '%S', NULL, NULL, 'GEORS', 'CODE', 'SHORTCUT', NULL, '2599941000', '0', NULL, '%S', NULL, NULL);";
		
		File c_f = new File("D:/randomSql.sql");
		
		c_f.delete() ;
		
		for(int i=0;i<12000;i++){
			
			String content = String.format(sql, SecUtils.getUUID(),SecUtils.getUUID().substring(0, "91320206761015581N".length()).toUpperCase(),
					System.currentTimeMillis()) ;
			
			FileUtils.writeToFile(content, c_f.getAbsolutePath());
			
//			Thread.sleep(2); 
			
		}
	}
	
	public static void compairDirs() throws Exception{
		File jiangyinjietu_0826_0857 = new File("C:\\Users\\Administrator\\Desktop\\jiangyin_jietu\\jiangyinjietu_0826_0857\\jiangyinjietu");
		File jiangyinjietu0819_2341 = new File("C:\\Users\\Administrator\\Desktop\\jiangyin_jietu\\jiangyinjietu0819_2341\\jiangyinjietu");
		
		File []  jiangyinjietu_0826_0857_files = jiangyinjietu_0826_0857.listFiles() ;
		
//		File [] jiangyinjietu0819_2341_files = jiangyinjietu0819_2341.listFiles() ;
		
		
		for(File j0826:jiangyinjietu_0826_0857_files){
			if(j0826.isDirectory()){
				
				File [] sub_files = j0826.listFiles() ;
				
				if(sub_files!=null && sub_files.length>0){
					for(File s :sub_files){
						String [] sub_file_paths = s.getAbsolutePath().split("\\\\");
						
						String parent_dir = sub_file_paths[sub_file_paths.length-2];
						
						File early = new File(jiangyinjietu0819_2341.getAbsolutePath()+File.separator+parent_dir);
						
						if(early.exists()){
							FileUtils.writeToFile(s.getAbsolutePath(), "D:/deletefile.txt");
//							s.delete();
						}
					}
					sub_files = j0826.listFiles() ;
					
					if(sub_files==null || sub_files.length==0){
						FileUtils.writeToFile(j0826.getAbsolutePath(), "D:/deletefile.txt");
						j0826.delete() ;
					}
					
					
				}else{
					FileUtils.writeToFile(j0826.getAbsolutePath(), "D:/deletefile.txt");
					j0826.delete() ; // 空文件夹
				}
				
			}else{
				String [] sub_file_paths = j0826.getAbsolutePath().split("\\\\");
				
				String parent_dir = sub_file_paths[sub_file_paths.length-2];
				
				File early = new File(jiangyinjietu0819_2341.getAbsolutePath()+File.separator+parent_dir);
				
				if(early.exists()){
					FileUtils.writeToFile(j0826.getAbsolutePath(), "D:/deletefile.txt");
//					j0826.delete();
				}
			}
		}
		
	}
	
}
