package multipleFunction;
import java.util.Scanner;


public class Switchdowhile {

	public static void main(String[] args) {
		Scanner myObj=new Scanner(System.in);
        // To Check and Print, Enter the Number 
        System.out.println("Enter the Number"+'\n');
        int inPut = myObj.nextInt();
       
        System.out.println("We will check Number "+inPut+" for diffrent cases"+'\n');
        System.out.println("Please entre the case no. to display their possible result"+'\n');
        System.out.println("Note: There are 4 cases to check, please enter accordingly"+'\n'+"(i.e)"+'\n'+ "1:Check for palindrome number"+'\n'+ "2:Prints the pattern of stars in decreasing order based on the input"+'\n'+"3:Check whether the input number is a prime number"+'\n'+"4:Print Fibonacci series of size as entered with first two numbers as 0, 1");
        
        int I;
        Scanner console = new Scanner(System.in);
        I = console.nextInt();
        switch(I){
            case 1:
                System.out.println("We will check weather "+inPut+" is Palindrome Number or not...."+'\n');
               int z,y=0,x;
               x = inPut;
               do{
               z = x % 10; 
               y=(y*10)+z;
               x=x/10;
                 }
                         while(x>0);
                         // if given number equal to sum than number is palindrome otherwise not palindrome
              	        	if(y==inPut)    
  	                     	{
               		     	  System.out.println(inPut+" is Palindrome Number "+'\n'); 
               	            	}
                   	         	else    
                  		    	System.out.println(inPut+" is not Palindrome Number"+'\n');
                                           break ;
                         
        case 2:
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
            System.out.println("case 2 is completed");
             break;
        case 3:
         
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
          System.out.println(inPut+"is Prime Number");
          else
          System.out.println(inPut+"is not Prime Number");
             break;
        case 4:
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
                         break;
                      default:System.out.println("Invalid case number!"); 
                      console.close();     
  }
 while(true){
     System.out.println("To continue with diffrent case if you want to contine,  Select: (Y/N) ");
  Scanner scanAgain = new Scanner(System.in);
          String input = scanAgain.nextLine();
          if (input.equals("Y"))
        	  
          {
          System.out.println("You have to select any case again");
          System.out.println("Please enter any Case number :");
          break;
            } else if(input.equals("N"))
            	scanAgain.close();	
            {
            System.out.println("Have a nice time"); 
            
            break;            
            }
    }
 myObj.close();
  }
  }
		

