package Questions;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

//紀錄面試時遇到的上機測驗題目
//2025.03.04
public class JavaProgrammer {

	public static void main(String[] args) {

		// Q1:將["D","E","G","Z","B","Q","A","Y"]放入List和MapList，按照A-Z排序

		// 原始陣列直接排序
		String[] s1 = { "D", "E", "G", "Z", "B", "Q", "A", "Y" };
		System.out.println("原始陣列 : " + Arrays.toString(s1));
		Arrays.sort(s1);
		System.out.println("原始陣列直接排序 : " + Arrays.toString(s1));

		// 要求一 : 放入List
		List<String> s1List = new ArrayList<>(Arrays.asList(s1));
		Collections.sort(s1List);
		System.out.println("放入List排序 : " + s1List);

		// 要求二 : 放入MapList
		Map<Integer, String> mapList = new TreeMap<>();
		for (int i = 0; i < s1List.size(); i++) {
			mapList.put(i, s1List.get(i));
		}
		System.out.println("放入MapList排序 : " + mapList);
		System.out.println("----------");

		// Q2:印出菱形

		int n = 5; // 菱形的行數
		int mid = n / 2; // 菱形的中心
		// 印出菱形上半部分
		for (int i = 0; i <= mid; i++) {
			for (int j = 0; j < mid - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 印出菱形下半部分
		for (int i = mid - 1; i >= 0; i--) {
			for (int j = 0; j < mid - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------");

		// Q3:[2,4,8,6,9,7,7,2,8,4]剔除重複的數字

		int[] i1 = { 2, 4, 8, 6, 9, 7, 7, 2, 8, 4 };
		System.out.println("原始數字陣列 : " + Arrays.toString(i1));
//		Set<Integer> l1 = new HashSet<>(); // 會重新排序
		Set<Integer> l1 = new LinkedHashSet(); // 按照原本排序

		for (int num : i1) {
			l1.add(num);
		}
		System.out.println("剔除重複數字後陣列 : " + l1);
		System.out.println("----------");

		// Q4:[2,4,6,8,10]用stream().map將每個數字加一

		// 方法一 : 陣列
		int[] intArray = { 2, 4, 6, 8, 10 };
		System.out.println("原始陣列為 : " + Arrays.toString(intArray));
		int[] streamInt = Arrays.stream(intArray).map(b -> b + 1).toArray();
		System.out.println("數字+1後的陣列為 : " + Arrays.toString(streamInt));

		// 方法二 : List
		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
		System.out.println("原始List為 : " + list);
		List<Integer> list2 = list.stream().map(c -> c + 1).collect(Collectors.toList());
		System.out.println("數字+1後的List為 : " + list2);
		System.out.println("----------");

		// Q5: 將 874528520000 這串數字,轉成日期格式，可用SimpDateFormat (這一題在這次面試前我沒有遇到過...)
		
		Long t1 = 874528520000L;
		Date date = new Date(t1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String dateFin = sdf.format(date);
		System.out.println("轉換後日期 : " + dateFin);

	}

}
