package multipleFunction;
import java.util.Scanner;


public class Switchdowhile {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Reply="YES";// TO RUN WHOLE LOOP AGAIN
        while(Reply.equals("YES"))
        {
		System.out.println("Enter the Number"+'\n');
		Scanner myObj=new Scanner(System.in);
        int inPut = myObj.nextInt();
        int I;
         
         String reply="Y";// TO RUN ONLY SWITCH CASE AGAIN
         while(reply.equals("Y"))
         {

        System.out.println("We will check Number "+inPut+" for diffrent cases"+'\n');
        System.out.println("Please entre the case no. to display their possible result"+'\n');
        System.out.println("Note: There are 4 cases to check, please enter accordingly"+'\n'+"(i.e)"+'\n'+ "1:Check for palindrome number"+'\n'+ "2:Prints the pattern of stars in decreasing order based on the input"+'\n'+"3:Check whether the input number is a prime number"+'\n'+"4:Print Fibonacci series of size as entered with first two numbers as 0, 1");
        System.out.println('\n'+"Note: Whenever ask for (Y/N or YES/NO), you have to type case sensitively Y or YES accordingly "); 
        Scanner console = new Scanner(System.in);
        I = console.nextInt();
        switch(I){
            case 1:
            {
            	System.out.println("We will check weather "+inPut+" is Palindrome Number or not...."+'\n');
               int z,y=0,x;
               x = inPut;
               do{
               z = x % 10; 
               y=(y*10)+z;
               x=x/10;
                 }while(x>0);
                         // if given number equal to sum than number is palindrome otherwise not palindrome
              	        	if(y==inPut)    
  	                     	{
               		     	  System.out.println(inPut+" is Palindrome Number "+'\n'+"Do you want to continue checking results with the different cases(Y/N)"); 
               	            	}
                   	         	else {   
                  		    	System.out.println(inPut+" is not Palindrome Number"+'\n'+"Do you want to continue checking results with the different cases(Y/N)");
                   	         	}  break ;
            }
        case 2:
        {
        	int row=1,column=inPut;
              int k;
              do{
                 k=column;
                 do{
                   System.out.print("");
                   k--;
                    }while(k>=row);
                          column=inPut;
                          do{
                             System.out.print("*"+" ");
                             column--;
                            }while(column>=row);
                             System.out.println(" ");
                             row++;
                            }while (row<=inPut);
            System.out.println("Do you want to continue checking results with the different cases(Y/N)");
             break;
        }
        case 3:
        {
            int q,r=0;
             q=1;
            do{
               if(inPut%q==0)
               r++;
               if(r>2)
               break;
               q++;
              }while(q<=inPut);
           if(r==2)
          System.out.println(inPut+" is Prime Number"+'\n'+"Do you want to continue checking results with the different cases(Y/N)");
          else
          System.out.println(inPut+" is not Prime Number"+'\n'+"Do you want to continue checking results with the different cases(Y/N)");
             break;
        }
        case 4:
        {
            System.out.println("Fibonacci number of "+inPut+'\n');
             int m1=0,m2=1,m3,n;
                 System.out.print(m1+" "+m2+" ");
                  n=2;//array count
                   do
                     {               	   
                       m3=m1+m2;
                        System.out.print(" "+m3+" ");                          
                       ++n;
                       m1=m2;
                        m2=m3;                        
                        }while(n<inPut);
                         System.out.print("");
                         System.out.println('\n'+"Do you want to continue checking results with the different cases(Y/N)");
                         break;
        }
             
          default:System.out.println("Invalid case number!"+'\n'); 
          System.out.println("Do you want to continue with the ABOVE cases (Y/N) if Y then please select from 1/2/3/4 only");             

}// End of Switch
        
        reply = console.next();
        
}//case while end       
       System.out.println("Out of Cases");
       System.out.println("TYPE (YES) TO CONTINUE WITH NEW NUMBER & (NO) TO END");
       Reply = myObj.next();
       
	}//Number loop	
	System.out.println("THE END");

  }
  }
		

