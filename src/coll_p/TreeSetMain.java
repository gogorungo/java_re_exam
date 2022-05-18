package coll_p;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class AAA implements Comparable<AAA>{
	int a; 
	String b;
	
	
	public AAA(int a, String b) {
		super();
		this.a = a;
		this.b = b;
	}


	@Override
	public String toString() {
		return "AAA [a=" + a + ", b=" + b + "]";
	}


	@Override
	public int compareTo(AAA o) {
		 // TreeSet은 add 할때마다 기존에 있던 것과 자기자신을 비교한다 
		System.out.println(this+":"+o);
		int res = a - o.a;
		
		if(res == 0) {
			res = b.compareTo(o.b);
//			res = b.compareTo(o.b) * -1; 역순
		}
		
		return res;
		
//		return a - o.a; // a로 비교
//		return b.compareTo(o.b); // 이름순서대로
//		return b.compareTo(o.b) * -1; // 이름 역순서대로
//		return 0; 이면 삭제 -1 이면 앞에 1이면 뒤에 
	}
	
	
	
}

public class TreeSetMain {

	public static void main(String[] args) {
		
		String [] arr = "현빈,원빈,김우빈,투빈,골빈,장희빈,커피빈,젤리빈,현빈,텅빈,미스터빈,터빈,자바빈,유즈빈,현빈".split(",");
		
		// set은 중복이 허용되지 않는다
		HashSet<String> ss1 = new HashSet(); // 순서가 지맘대로
		LinkedHashSet<String> ss2 = new LinkedHashSet(); // 순서대로
		TreeSet<String> ss3 = new TreeSet(); // 오름차순 정렬
		
		for (String tt : arr) {
			ss1.add(tt);
			ss2.add(tt);
			ss3.add(tt);
		}
		
		System.out.println("ss1:"+ss1);
		System.out.println("ss2:"+ss2);
		System.out.println("ss3:"+ss3);
		
		HashSet<AAA> ss4 = new HashSet(); // 순서가 지맘대로
		LinkedHashSet<AAA> ss5 = new LinkedHashSet(); // 순서대로
		TreeSet<AAA> ss6 = new TreeSet(); // 오름차순 정렬
		
		AAA a = new AAA(10, "이효리");
		
		AAA[] arr2 = {
			new AAA(3, "한가인"),
			a,
			new AAA(6, "두가인"),
			new AAA(9, "삼가인"),
			a,
			new AAA(3, "사가인"),
			new AAA(3, "오가인"),
			a,
			new AAA(3, "육가인")
		};
		
		for (AAA aa : arr2) {
			ss4.add(aa);
			ss5.add(aa);
			ss6.add(aa); // TreeSet은 add 할때마다 비교한다
		}
		
		System.out.println("ss4:"+ss4);
		System.out.println("ss5:"+ss5);
		System.out.println("ss6:"+ss6); // Comparable 로 변형할 수 없으므로 에러난다
	}

}
