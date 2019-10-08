public class StringFindStrCount {
/*
 * 	*A:画图演示
   *需求:统计大串中小串出现的次数
   *这里的大串和小串李勇自己根据情况给出
 */
	public static void main(String[] args) {
		//定义大串
		String max = "woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma";
		//定义小串;
		String min = "heima";
		System.out.println(max.indexOf(min));//小串第一次出现在大串中的位置

		//定义计数器变量
		int count = 0;
		//定义索引
		int index = 0;
		//定义循环,判断小串是否在大串中出现
		while((index = max.indexOf(min)) != -1) {
			count++;		//计数器自增
			max = max.substring(index+min.length());
		}
		System.out.println(count);
	}

}
