/*
 *This program takes input string from user and converts
 * it into a string of special characters.
 */

package traditionalciphers;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;






public class SpecialCharacterMagic {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter the String That You Want to Encode");
        String pt=(br.readLine()).toLowerCase();
        char ch[]=pt.toCharArray();
        char temp[]=new char[100];

      for(int i=0;i<ch.length;i++){
       if(ch[i]=='a')
               temp[i]='!';
       else
       if(ch[i]=='b')
               temp[i]='@';
       else
       if(ch[i]=='c')
               temp[i]='#';
       else
       if(ch[i]=='d')
               temp[i]='$';
       else
       if(ch[i]=='e')
               temp[i]='%';
       else
       if(ch[i]=='f')
               temp[i]='^';
       else
       if(ch[i]=='g')
               temp[i]='&';
       else
       if(ch[i]=='h')
               temp[i]='*';
       else
       if(ch[i]=='i')
               temp[i]='(';
       else
         if(ch[i]=='j')

               temp[i]=')';
       else
       if(ch[i]=='k')
               temp[i]='_';
       else
       if(ch[i]=='l')
               temp[i]='-';
       else
       if(ch[i]=='m')
               temp[i]='+';
       else
       if(ch[i]=='n')
               temp[i]='=';
       else
       if(ch[i]=='o')
               temp[i]='{';
       else
        if(ch[i]=='p')
               temp[i]='[';
       else
        if(ch[i]=='q')
               temp[i]='}';
       else
        if(ch[i]=='r')
               temp[i]=']';
       else
        if(ch[i]=='s')
               temp[i]='"';
       else
        if(ch[i]=='t')
               temp[i]='|';
       else
        if(ch[i]=='u')
               temp[i]=';';
       else
        if(ch[i]=='v')
               temp[i]=':';
       else
        if(ch[i]=='w')
               temp[i]='<';
       else
        if(ch[i]=='x')
               temp[i]='>';
       else
         if(ch[i]=='y')
               temp[i]=',';
       else
          temp[i]='.';


      }

        System.out.println("Corrosponding Cipher Text");
        for(int i=0;i<ch.length;i++)
             System.out.print(temp[i]);
             System.out.print("\n");

         System.out.println("Corrosponding Plain Text");
        for(int i=0;i<ch.length;i++)
             System.out.print(ch[i]);
             System.out.print("\n");

    }

}
