import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ex01 {

	public static void main(String[] args) {
		Map<String, String> ids = new HashMap<>();
		
		// 값 저장
		ids.put("jinwoo", "장진우");
		ids.put("yu", "유재석");
		
		System.out.println(ids);
		
		// 값 가져오기
		System.out.println(ids.get("jinwoo"));
		
		ids.put("yu", "박명수");
		System.out.println(ids.get("yu"));
		
		// 키가 존재하는지 확인
		if(ids.containsKey("yu")) {
			System.out.println(ids.get("yu"));
		}
		
		// 밸류, 값이 있는지 확인
		if(ids.containsValue("조세호")) {
			System.out.println("있다.");
		}
		
		// 값 추가
		// 다른 맵에 있는 모든 값 추가
		Map <String, String> newMap = new HashMap<>();
		newMap.put("lee", "이효리");
		newMap.put("rain", "정지훈");
		
		ids.putAll(newMap);
		
		// 값 지우기
		ids.remove("yu");
		System.out.println(ids);
		
		// 반복문을 통한 접근
		// 모든키 가져오기
		Set<String> keys = ids.keySet();
		
		// 향상된 for문
		for (String id : keys) {
			System.out.println(id + " : " + ids.get(id));
			
		}
		
		// Iterator
		Iterator<String> iter = ids.keySet().iterator();
		while(iter.hasNext()) {
			String id = iter.next();
			System.out.println(id + " : " + ids.get(id));
		}

	}

}
