public class Main {
    public static void main(String[] args) {
        Goodmorning people=new Goodmorning();
        Vsfriends peopleOne=new Vsfriends();
        VsEmoployer peopleTwo=new VsEmoployer();
        VsParents peopleThree=new VsParents();
        people.sayGoodMorning();
        peopleOne.sayGoodMorning();;
        peopleTwo.sayGoodMorning();
        peopleThree.sayGoodMorning();
    }
}
class Goodmorning
{
    public void sayGoodMorning()
    {
        System.out.println("Goodmorning");
    }
}
class VsParents extends Goodmorning
{
    public void sayGoodMorning()
    {
        System.out.println("Goodmorning dad/mom");
    }
}
class Vsfriends extends Goodmorning
{
    public void sayGoodMorning()
    {
        System.out.println("Hi GoodMorning");
    }
}
class VsEmoployer extends Goodmorning
{
    public void sayGoodMorning()
    {
        System.out.println(" GoodMorning sir");
    }
}