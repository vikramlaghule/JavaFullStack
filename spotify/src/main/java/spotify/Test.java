package spotify;

public class Test {
    public static void main(String[] args) {
	
    	
    	int john=3;
    	int peter=4;
    	for(int i=1;i<=100;i++)
    	{
    		
    		int solvedByJohn=i*john;
    		int solvedBypetr=0;
    		if(i>3)
    		{
    			solvedBypetr=(i-3)*peter;
    		}
    		
    		if(solvedBypetr>solvedByJohn)
    		{
    			
    	        System.out.println("Peter overtakes on day: " + i);

    			break;
    		}
    	}
    	
   
    	
    	
    }
}
