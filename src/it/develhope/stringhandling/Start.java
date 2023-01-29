package it.develhope.stringhandling;
public class Start
{
    public static void main(String args[])
    {
        String string1="United Kingdom ";
        String string2="Germany";
        string1.indexOf(" ");
        String sub1 = string1.substring(0,string1.indexOf(' '));
        String sub2 = string1.substring(6,14);
        System.out.println(sub1.toUpperCase()+" "+
                string2.toUpperCase()+
                sub2.toUpperCase());

    }
}

     
