public class MaxProduct {
  public int adjacentElementsProduct(int[] array) {
    Integer resp = 0;
		
		Integer i = 0;
		while(i < array.length-1){
			if(i == 0){
				resp = array[i]*array[i+1];
			}
			if((array[i]*(array[i+1]))>resp){
				resp = array[i]*array[i+1];
			}
			i+=1;
		}
    
    return resp;
  }
}