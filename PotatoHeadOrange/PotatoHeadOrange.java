
/**
 * Program to demonstrate classes and objects PotatoHeadOrange
 *
 * @author Srikar
 * @version October 6, 2020
 */
public class PotatoHeadOrange
{
    private String hat;//declaring instance varibale of the PotatoHeadOrange class
    private String eyes;//instance variable define the attributes ofyour object
    private int age;
    private String hair;
    private int height;
    
    public PotatoHeadOrange(String hisHat, String hisEyes, int hisAge)//Constructor
    {
        //initialize instance variables
        hat = hisHat;
        eyes = hisEyes;
        age = hisAge;
        
    }
    //thos method does not return a value because of the word void in the method signature
    public static void objectFriends(){
        System.out.println("My objects are all friends!");
    }
    
    public static double addTheirAges(int age1, int age2, int age3)
    {
        double totalAge = (double)(age1 + age2 + age3)/3;
        return totalAge;
        
    }
    
    public PotatoHeadOrange(String hisHair, int hisHeight)
    {
        hair = hisHair;
        height = hisHeight;
    }
        
    
    public static void main(String[] args)
    {
        /**
         * PotatoHeadOrange islike the datatype, and Nick is the name of the 
         * variable/object. The new is a keyword used by Javea to creat the
         * new object Nick of the PotatoHeadOrange class datatpye. The 
         * attributes value I give my objects MUST correspond to the 
         * constructor parameters
         */
        
       PotatoHeadOrange nick = new PotatoHeadOrange("baseball", "Blue", 16);
       PotatoHeadOrange rocky = new PotatoHeadOrange("snapback", "brown", 16);
       PotatoHeadOrange eddy = new PotatoHeadOrange("helmet", "green", 17);
       
       PotatoHeadOrange jack = new PotatoHeadOrange("black", 66);
       
       System.out.println(nick.hat);
       System.out.println(rocky.age);
       System.out.println(jack.height);
    
          
       jack.height = 70;
       System.out.println(jack.height);
       
       System.out.println(addTheirAges(nick.age, rocky.age, eddy.age));
       
       System.out.printf("%.2f", addTheirAges(nick.age, rocky.age, eddy.age));
       
    }

}
