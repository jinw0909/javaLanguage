package ex03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		// 01
		Map<String, Map<String, String>> bookMap = new HashMap<>();
		
		Map<String, String> map1 = new HashMap<>();
		
        map1.put("�� �غ�", "�̼���,ȫ�ֿ�");
        map1.put("�� �׸�", "������");
        map1.put("�޸��� ����", "������ ����");

        Map<String, String> map2 = new HashMap<>();
        map2.put("�����", "�������丮");
        map2.put("�Ƹ��", "�տ���");
        map2.put("���̾� ��ȭ���� ����", "�����ó� ���̰�");
        map2.put("�غ��� ī��ī", "����ī�� �Ϸ�Ű");

        Map<String, String> map3 = new HashMap<>();
        map3.put("�ð��� �帣�� �ʴ´�", "ī���� �κ���");
        map3.put("�ڽ���", "Į ���̰�");
        map3.put("�������", "��ġ�� ī��");

        bookMap.put("�ڱ���", map1);
        bookMap.put("�Ҽ�", map2);
        bookMap.put("����", map3);
        System.out.println(bookMap);
		
        Scanner scan = new Scanner(System.in);
        System.out.print("å�̸��� �Է����ּ���: ");
        String searchBook = scan.nextLine();
        
//        Set<String> bookGenres = bookMap.keySet();
//        for (String genre : bookGenres) {
//        	Set<String> bookTitles = bookMap.get(genre).keySet();
//        	for (String title : bookTitles) {
//        		if (title.equals(searchBook)) {
//        			System.out.println(title + "�� �۰����� " + bookMap.get(genre).get(title));
//        		}
//        	}
//        }
        
//	      Set<String> bookGenres = bookMap.keySet();
//	      for (String genre : bookGenres) {
//	      	if ((bookMap.get(genre)).containsKey(searchBook)) {
//	      		System.out.println(searchBook + "�� �۰��� " + bookMap.get(genre).get(searchBook));
//	      		break;
//	      	} 
//	      }
	      
	      Set<String> bookGenres = bookMap.keySet();
	      for (String genre : bookGenres) {
	      	Map<String, String> booksMap = bookMap.get(genre);
	      }
	}

}
