# deletion
import java.io.*;
import java.util.*;
public class Deletdigits
{
  public static void main(String args[]) throws IOException
  {
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number");
    String x=br.readLine();
    int len=x.length();
    System.out.println("Enter how many digits to be deleted");
    Integer y=Integer.parseInt(br.readLine());
    String str=x.substring((len-y),len);
    String str1=x.substring(0,(len-y));
    Integer z=Integer.parseInt(str1);
    Integer r=z-1;
    System.out.println(r);
    }
    }
