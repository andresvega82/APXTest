class Persist {
	public static int persistence(long num) {
		String s = Long.toString(num);
		  if (Long.toString(num).length() == 1) {
			    return 0;
			  }
			  int mult = 1;
			  String[] splitStr = s.split("");
			  for (int i = 0; i < splitStr.length; i++) {
			    mult *= Integer.parseInt(splitStr[i]);
			  }
			  return 1 + persistence(new Long(mult));
		}
}