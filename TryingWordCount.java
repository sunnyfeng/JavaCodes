public class TryingWordCount{
  public static void main(String[] args){
    String s = IO.readString();
    int minLength = IO.readInt();
    System.out.println(countWords(s, minLength));
  }

public static int countWords(String str,int minLength)
{
    int count = 0;int c=0;
    for (int i=0;i<str.length();i++)
    {
        if (str.charAt(i) != ' ')
        {
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
            c++;
            continue;
        }
        if(c>=minLength)
        {
             count++;
        }
        c=0;
    }
    if(c>=minLength)
    return count+1;
    else
    return count;
 }
}
