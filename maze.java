java.util.Scanner;

 public class c321013 {

	
	public static void main(String[]args){
	Scanner scan = new Scanner(System.in);
	 char [][] maze = new char[][]{
				
				{'|','|','|','|','|','|','|','|','|','|'},
				{' ','.',' ',' ',' ',' ',' ',' ','|','|'},
				{'|','|',' ','|','|',' ','|',' ','|','|'},			
				{'|','|',' ','|','|',' ','|',' ','.','|'},			
				{'|','|',' ',' ','.',' ','|','|','|','|'},	
				{'|','|','|',' ','|','|','|',' ','.','|'},
				{'|',' ',' ',' ',' ',' ','|','O','|','|'},
				{'|',' ','|','O','|','|','|',' ','|','|'},
				{'|','.',' ',' ',' ',' ',' ',' ',' ','X'},
				{'|','|','|','|','|','|','|','|','|','|'},
				}; 
	boolean found;
	 char startmark = '*';
	 char goal = 'X', food = '.',trap = 'O', walls = '|';
	 int r = 1, c = 0;
	 int score = 0;
	 
	maze[r][c]='*';
  
	for(int i = 0;i < maze.length;i++){
		for(int j = 0;j < maze.length;j++){
        	  System.out.print(maze[i][j]);
          }
		System.out.println();
		}
	
	while(true){
		 
		
		System.out.println("Enter key for movement: valid keys are l = left,r = right, u = up, d = down"
				 +"\n Score = " + score); 
		
		 String x = scan.next();
	     
		
	   if(x.equals("q")){
	   
		System.exit(0);
	   }     
	   else if (x.equals("l")){
		  try{ if ( maze[r][c-1] == ' '){
		    c = c-1;
		    }
		  else if (maze[r][c-1] == walls){
		    
		    }else if (maze[r][c-1] == food){
		    	maze[r][c] =' ';
		       c = c-1;
		    	score++;
		   maze[r][c] =' ';
		    } else if (maze[r][c-1] == trap){
			       c = c-1;
		    	score--;
		    	}else{}
		  }
		  catch(java.lang.ArrayIndexOutOfBoundsException e){
			  System.out.println(" Cannot GO out Of bound");
		  }
		
	   }
	  
	   
	   
	   else if(x.equals("r")){
	    if ( maze[r][c+1] == ' '){
	       c = c+1;
	    }
	    else if (maze[r][c+1] == walls){
	    
	    }else if (maze[r][c+1] == food){
	       c = c+1;
	    	score++;
	    maze[r][c] =' ';
	    } else if (maze[r][c+1] == trap){
	    	c=c+1;
	    	score--;
	    }else if(maze[r][c+1] == goal){
	    	c = c+1;
	    		//System.out.println("YOU WON");
	    		//System.exit(0);
	    	}else{}
	   }
	   
	   
	   else if(x.equals("u")){
		   if ( maze[r-1][c] == ' '){
		    	r = r-1 ;
		    }
		   else if (maze[r-1][c] == walls){
		    
		    }else if (maze[r-1][c] == food){
		    	r = r-1 ;
		    	score++;
		    maze[r][c] =' ';
		    } else if (maze[r-1][c] == trap){
		    	r=r-1;
		    	score--;
		    	}
		    else{}
		   
	   }
	   
	   else if(x.equals("d")){
		   if ( maze[r+1][c] == ' '){
		    	r = r+1 ;
		    }
		   else if (maze[r+1][c] == walls){
		    
		    }else if (maze[r+1][c] == food){
		    	r = r+1 ;
		    	score++;
		    maze[r][c] =' ';
		    }else if (maze[r+1][c] == trap){
		    	r=r+1;
		    	score--;
		    	}else{}

	   }
		
	   else{
			System.out.println("Ignored");
	   }
	
	 
		 for(int i = 0;i < maze.length;i++){
				
				for(int j = 0;j < maze.length;j++){
				
	             if (maze[i] == maze[r] && maze[j] == maze[c]){
	              System.out.print(startmark);
	              }else
	              {
	            	  System.out.print(maze[i][j]);
	              }
	            	  
				}
				System.out.println();
				}		 
	if (maze[r][c] == 'X'){
		System.out.println("YOU WON");
		System.exit(0);
	} 
	 }
}}

	 
	
