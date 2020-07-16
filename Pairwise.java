public class Pairwise{
	
	public static int pairwise(int array[], int number){
		int count1 = 0;     //temporary counter to make return easier
		int finalCount = 0;  //the return value
		
		for(int i=0; i< array.length; i++){
			for(int j=0; j< array.length; j++){  //nested loop to test all cases
				int sum1 = (array[i]+array[j]);  //temporart counter for future comparison
				 if((sum1 == number) && !(i == j )){  
						count1 = i + j;	
						finalCount = (finalCount + count1);				
					}
			}
			
		}
		//System.out.println(+count+);
		System.out.format("%d", finalCount/2); //divided in two to avoid repetition
		return finalCount;
	}
	
	public static void main(String args[]){
		int testA[] = {7,9,11,13,15};  //used a test case
		int numA = 20;
		pairwise(testA, numA);
	}
	
}

/*
1. create test array (short)
2.nested loop (check if each combo adds up to number)
3. if yes, add up index
4. if no, check next case
5. output sum of indeces
*/
