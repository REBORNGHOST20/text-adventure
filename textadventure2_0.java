import java.util.Scanner;

public class textadventure2_0
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("you find your self in a maze.");
        System.out.println("there is a sign that reads: THIS IS THE IMPOSSIBLE MAZE.");
        System.out.println("there is another sign. it reads:SECTOR ONE.");
        System.out.println("you enter sector one.");
       	System.out.println("sector level: easy.");
       	System.out.println("the path to the left is blocked.");
      	System.out.println("choose a direction.");
       	String direction = scan.next();
        
        if(direction.equals("forward"))
        {
        		System.out.println("you have chose to go forward.");
        		System.out.println("the path to the right is blocked.");
        		System.out.println("choose a direction.");
        		String direction3 = scan.next();
        		
        		if(direction3.equals("left"))
        	    {
        			System.out.println("you have chose to go left.");
        			System.out.println("the path going forward is blocked.");
        			System.out.println("choose a direction.");
        			String direction9 = scan.next();
        			
        			if(direction9.equals("left"))
        	        {
        				System.out.println("you have chose to go left.");
        				System.out.println("the path to the right is blocked.");
        				System.out.println("choose a direction.");
        				String direction14 = scan.next();
        				
        				if(direction14.equals("left"))
        	            {
        					System.out.println("you have chose to go left.");
        					System.out.println("the path to the left is blocked.");
        					System.out.println("choose a direction.");
        					String direction15 = scan.next();
        					
        					if(direction15.equals("forward"))
        	    			{
        						System.out.println("you have chose to go forward.");
        						System.out.println("you have reached a dead end. please try again.");
        	   			    }
        	   			    if(direction15.equals("right"))
        	   			    {
        	   			    	System.out.println("you have chose to go right.");
        	   			    	System.out.println("you have hit a dead end. please try again.");
        	   			    }
        	            }
        	            if(direction14.equals("forward"))
        	            {
        	            	System.out.println("you have chose to go forward.");
        	            	System.out.println("you have hit a dead end. please try again.");
        	            }
        	        }
        	        if(direction9.equals("right"))
        	        {
        	        	System.out.println("you have chose to go right.");
        	        	System.out.println("you have hit a dead end. please try again.");
        	        }
        	    }
        	    if(direction3.equals("forward"))
               	{
        			System.out.println("you have chose to go forward.");
        			System.out.println("the path going right is blocked.");
        			System.out.println("choose a direction.");
        			String direction10 = scan.next();
        			
        			if(direction10.equals("left"))
        	        {
        				System.out.println("you have chose to go forward.");
        				System.out.println("the path going forward is blocked.");
        				System.out.println("choose a direction.");
        				String direction12 = scan.next();
        				
        				if(direction12.equals("left"))
        	            {
        					System.out.println("you have chose to go left.");
        					System.out.println("the path to the right is blocked.");
        					System.out.println("choose a direction.");
        					String direction16 = scan.next();
        					
        					if(direction12.equals("left"))
        	                {
        						System.out.println("you have chose to go left.");
        						System.out.println("the path to the right is blocked.");
        						System.out.println("choose a direction.");
        						String direction17 = scan.next();
        						
        						if(direction17.equals("left"))
        	                    {
        							System.out.println("you have chose to go left.");
        							System.out.println("you have hit a dead end. please try again.");
        	                    }
        	                }
        	                if(direction16.equals("forward"))
        	                {
        	                	
        	                }
        	            }
             	    }
         	    }
        	    if(direction.equals("right"))
            	{
        			System.out.println("you have chose to go right.");
        			System.out.println("the path going forward is blocked.");
        			System.out.println("choose a direction.");
        			String direction6 = scan.next();
        		
        			if(direction6.equals("left"))
         	    	{
        				System.out.println("you have chose to go forward.");
        				System.out.println("the path to the left is blocked.");
        				System.out.println("choose a direction.");
        				String direction11 = scan.next();
        				
        				if(direction11.equals("forward"))
        				{
        					System.out.println("you have chose to go forward.");
        					System.out.println("you have hit a ded end. please try again.");
        				}
        				if(direction11.equals("right"))
        				{
        					System.out.println("you have chose to go right.");
        					System.out.println("you have hit a dead end. please try again.");
        				}
         	    	}
            	}
            	if(direction.equals("forward"))
        	    {
        			System.out.println("you have chose to go forward.");
        			System.out.println("all three paths are open.");
        			System.out.println("choose a direction.");
        			String direction12 = scan.next();
        			
        			if(direction12.equals("right"))
        			{
        				System.out.println("you have chose to go right.");
        				System.out.println("congradulations. you have found the exit.");
        				System.out.println("you wake up to find you were dreaming the whole time.");
        			}
            	}
        	}
       }
    }
  
