import java.io.*;
public class minesweeper
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
char m[][]={{'*','*','*','*','*'},{'*','*','*','*','*'},{'*','*','*','*','*'},{'*','*','*','*','*'},{'*','*','*','*','*'}};
 //global variables   
 int points=0;   
    
 public void play()throws IOException
    { 
        
        char p;
     
     do
     {
         
        System.out.println("enter row index");
        
     int r=Integer.parseInt(br.readLine());
     System.out.println("enter column index");
     int c=Integer.parseInt(br.readLine());
     if(((r+c)==6)||((r+c)==7))
             {
                 System.out.println("oops!");
                 finish();
                 break;
               
                }
                else 
                {
                    System.out.println("correct!!!!");
                   points++;
                }
                System.out.println("do you wish to continue playing");
            System.out.println("press y to continue playing and n to quit");
                p=(char)(br.read());
            p=Character.toUpperCase(p);
            br.readLine();
        }
            while(p!='N');
        
    }
            
                 
             
     

   public void check3()
    {
       
        System.out.println("Given below is your grid ; you need to enter the row and then the column for accesing the  element where you want to try");
       
        System.out.println("All the best");
        int i,j;       for(i=0;i<5;i++)
     {
         for(j=0;j<5;j++)
         {
             System.out.print(m[i][j]+" ");
            }
   System.out.println();
    }
}
    
public void finish()
{
    System.out.println("Sorry you lose");
    System.out.println("Thank you for playing");
System.out.println(" Your points are"+points);
}

public void display()
{
    int s,t,s1,t1;
    char n[][]=new char[5][5]; 
  System.out.println("have a good day");
    
    System.out.println("The mines were at place");
    for(s=0;s<5;s++)
    {
        s1=s+1;
        for(t=0;t<5;t++)
        {
            t1=t+1;
            if(((s1+t1)==7)||((s1+t1)==4))
            {
                
                n[s][t]='#';
                System.out.print(n[s][t]+" ");
}
else
{
    n[s][t]='*';
    System.out.print(n[s][t]+" ");

    }
    
}
System.out.println(" ");
}
}
}

import java.io.*; 
public class check2
{
 BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));


   
public static void main()throws IOException
    {
        System.out.println("MINESWEEPER GAME##########  WELCOMES YOU  ##################");
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("how many players");
        int num=Integer.parseInt(bu.readLine());
        minesweeper ob1[]=new minesweeper[num];
        minesweeper ob2=new minesweeper();
        for(int i=0;i<num;i++)
        {
            System.out.println("player"+(i+1));
           ob1[i]=new minesweeper();
            ob1[i].check3();
        ob1[i].play();
    
    }
    ob2.display();
}
}
