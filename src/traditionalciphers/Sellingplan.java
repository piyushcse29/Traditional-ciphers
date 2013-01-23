/*
 *This progarm depicts the market scenario of selling any commodity
 * they convert the price of any commodity into their corrosponding
 * code.Here we have taken "monkeycats" as refernce.
 */

/**
 *
 * @author piyush
 */


package traditionalciphers;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;






public class Sellingplan {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Text of Tag");
        String pt=(br.readLine()).toLowerCase();
        char ch[]=pt.toCharArray();
        int temp[]=new int[100];

      for(int i=0;i<ch.length;i++){
       if(ch[i]=='m')
               temp[i]=0;
       else
       if(ch[i]=='o')
               temp[i]=1;
       else
       if(ch[i]=='n')
               temp[i]=2;
       else
       if(ch[i]=='k')
               temp[i]=3;
       else
       if(ch[i]=='e')
               temp[i]=4;
       else
       if(ch[i]=='y')
               temp[i]=5;
       else
       if(ch[i]=='c')
               temp[i]=6;
       else
       if(ch[i]=='a')
               temp[i]=7;
       else
       if(ch[i]=='t')
               temp[i]=8;
       else

               temp[i]=9;


      }

        System.out.println("Corrosponding Price");
        for(int i=0;i<ch.length;i++)
             System.out.print(temp[i]);

    }

}
