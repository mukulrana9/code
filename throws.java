import java.io.IOException;
class Testthrows
    {
      void m()throws IOException
    {
          throw new IOException("device error");
       }
     void n()throws IOException
{
  m();
}
  void p()
{
try{
   n();
}



catch(Exception e)
{

System.out.println("exceptionhandle");
}
}




public static void main(String args[])
{

Testthrows obj=new Testthrows();
obj.p();
System.out.println("normal flow");
}
}