class Computer
{
    public void playMusic()
    {
        System.out.println("Music Playing!!");
    }
    public String getMeAPen(int cost)
    {
        if(cost>=10)
          return "Here is your Pen!!" ;
        
        return "Give me some more money!!";
    }
}

public class method
{
    public static void main (String a[])
    {
        Computer obj = new Computer();
        obj.playMusic();
        String s = obj.getMeAPen(18);
        System.out.println(s);
    }
}