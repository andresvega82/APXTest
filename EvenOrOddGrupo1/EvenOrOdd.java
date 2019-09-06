public class EvenOrOdd {
    public static String even_or_odd(int number) {
        
		String resp = "";
		if(number%2 == 0){
			resp = "Even";
		}else{
			resp = "Odd";
		}
        return resp;
    }
}