package ex04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Ex04 {

	public static void main(String[] args) {
		Map<String, String> myCharacter = new HashMap<>();
        myCharacter.put("�г���", "���κ�Ƴ�");
        myCharacter.put("����", "������");
        myCharacter.put("����", "B");
        myCharacter.put("����", "38");
        
     // [{�г���=�г���1, ����=����, ����=5}, {�г���=�г���1, ����=����, ����=5}...]
        List<Map<String, String>> characters = new ArrayList<>();
        Map<String, String> character1 = new HashMap<>();
        character1.put("�г���", "���ڰ����");
        character1.put("����", "����");
        character1.put("����", "A");
        character1.put("����", "11");
        characters.add(character1);

        Map<String, String> character2 = new HashMap<>();
        character2.put("�г���", "�ϱ���");
        character2.put("����", "������");
        character2.put("����", "B");
        character2.put("����", "46");
        characters.add(character2);

        Map<String, String> character3 = new HashMap<>();
        character3.put("�г���", "�ٴ�");
        character3.put("����", "����");
        character3.put("����", "B");
        character3.put("����", "23");
        characters.add(character3);

        Map<String, String> character4 = new HashMap<>();
        character4.put("�г���", "�ʺ�");
        character4.put("����", "����");
        character4.put("����", "A");
        character4.put("����", "4");
        characters.add(character4);

        Map<String, String> character5 = new HashMap<>();
        character5.put("�г���", "����G");
        character5.put("����", "����");
        character5.put("����", "B");
        character5.put("����", "84");
        characters.add(character5);
        
        
        // todo
        String myServer = myCharacter.get("����");
        List<Map<String, String>> optimal = new ArrayList<>();
        characters.add(myCharacter);
        Iterator<Map<String, String>> iter = characters.iterator();
        while (iter.hasNext()) {
        	Map<String, String> character = iter.next();
//        	System.out.println(character);
        	if (character.containsValue(myServer) && character.containsValue("����")) {
        		System.out.println(character);
        		optimal.add(character);
        	}
        }
        
        int max = 0;
        Map<String, String> maxHealer = null;
        maxHealer.put("����", "0");
        for (Map<String, String> character : optimal ) {
        	int level = Integer.parseInt(character.get("����"));
        	if (maxHealer == null) {
        		maxHealer = character;
        		continue;
        	}
        	int maxLevel = Integer.parseInt(maxHealer.get("����"));
        	if (level > maxLevel) {
        		maxHealer = character;
        	}
        }
        System.out.println(maxHealer);
        
        
        
        
        
        
        
        
	}

}
