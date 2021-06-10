import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ex01 {

	public static void main(String[] args) {
		Map<String, String> ids = new HashMap<>();
		
		// �� ����
		ids.put("jinwoo", "������");
		ids.put("yu", "���缮");
		
		System.out.println(ids);
		
		// �� ��������
		System.out.println(ids.get("jinwoo"));
		
		ids.put("yu", "�ڸ��");
		System.out.println(ids.get("yu"));
		
		// Ű�� �����ϴ��� Ȯ��
		if(ids.containsKey("yu")) {
			System.out.println(ids.get("yu"));
		}
		
		// ���, ���� �ִ��� Ȯ��
		if(ids.containsValue("����ȣ")) {
			System.out.println("�ִ�.");
		}
		
		// �� �߰�
		// �ٸ� �ʿ� �ִ� ��� �� �߰�
		Map <String, String> newMap = new HashMap<>();
		newMap.put("lee", "��ȿ��");
		newMap.put("rain", "������");
		
		ids.putAll(newMap);
		
		// �� �����
		ids.remove("yu");
		System.out.println(ids);
		
		// �ݺ����� ���� ����
		// ���Ű ��������
		Set<String> keys = ids.keySet();
		
		// ���� for��
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
