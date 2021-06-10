package test01;

public class Product {
	String name;
	int price;
	String expirationDate;
	
	int calcPrice(int count) {
		return price * count;  
	}
	int stringToInt(String date) {
		int result = Integer.parseInt(date.replace("-", ""));
		return result;
	}
	boolean expireChk(String date) {

		String[] limitDate = expirationDate.split("-");
		String[] todayDate = date.split("-");
		
		int limitYear = Integer.parseInt(limitDate[0]);
		int limitMonth = Integer.parseInt(limitDate[1]);
		int limitDay = Integer.parseInt(limitDate[2]);
		
		int todayYear = Integer.parseInt(todayDate[0]);
		int todayMonth = Integer.parseInt(todayDate[1]);
		int todayDay = Integer.parseInt(todayDate[2]);
		
		// 년이 2021년 보다 크다면
		if (limitYear > todayYear) {
			return true;
		} else if (limitYear == todayYear) {
			if (limitMonth > todayMonth) {
				return true;
			} else if (limitMonth == todayMonth) {
				if (limitDay > todayDay) {
					return true;
				}
			}
		}
		
		return false;
	}
}
