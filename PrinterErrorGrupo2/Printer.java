public class Printer {
    
    public static String printerError(String s) {
        Integer count = 0;
		for (int i = 0; i < s.length(); i++) {			
			if(s.charAt(i)>'m'){
				count += 1;
			}
		}
		return count +"/"+s.length();
    }
}