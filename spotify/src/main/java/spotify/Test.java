package spotify;

public class Test {
    public static void main(String[] args) {
	
    	
    	int john=3;
    	int peter=4;
    	for(int i=1;i<=100;i++)
    	{
    		int solvedBypetr=i*john;
    		int solvedByJohn=0;
    		if(i>3)
    		{
    			 solvedByJohn=(i-3)*peter;
    		}
    		
    		if(solvedBypetr<solvedByJohn)
    		{
    			
    	        System.out.println("Peter overtakes on day: " + i);

    			break;
    		}
    	}
    	
    	
    }
}
