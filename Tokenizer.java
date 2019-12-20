import java.util.*;
class StringTokenizerDemo
{
    public static void main(String args[])
    {
        String str="he is gentle man";
        StringTokenizer st=new StringTokenizer(str," ");
        System.out.println("The tokens are: ");
        while(st.hasMoreTokens())
        {
            String one=st.nextToken();
            System.out.println(one);
        }
    }
}