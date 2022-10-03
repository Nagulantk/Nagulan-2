public class Main {
    public static void main(String[] args) {

        IPhoneOne oneUser=new IPhoneOne();
        IPhoneTwo twoUser=new IPhoneTwo();
        IPhoneThree threeUser=new IPhoneThree();
        oneUser.offCamera();
        oneUser.onCamera();
        oneUser.closeChess();
        oneUser.openChess();
        twoUser.offCamera();
        twoUser.onCamera();
        twoUser.closeChess();
        twoUser.openChess();
        twoUser.openNotes();
        twoUser.closeNotes();
        threeUser.offCamera();
        threeUser.onCamera();
        threeUser.closeChess();
        threeUser.openChess();
        threeUser.openNotes();
        threeUser.closeNotes();
        threeUser.openCalculator();
        threeUser.closeCalculator();
    }
}
class IPhoneOne
{
    public void onCamera()
    {
        System.out.println("Camera is turned on");
    }
    public void offCamera()
    {
        System.out.println("Camera is turned off");
    }
    public void openChess()
    {
        System.out.println("Chess game is opened");
    }
    public void closeChess()
    {
        System.out.println("Chess game is closed");
    }

}
class IPhoneTwo extends IPhoneOne{
    public void openNotes()
    {
        System.out.println("Notes is opened");
    }
    public void closeNotes()
    {
        System.out.println("Notes is closed");
    }
}
class IPhoneThree extends IPhoneTwo
{
    public void openCalculator()
    {
        System.out.println("Calculator is opened");
    }
    public void closeCalculator()
    {
        System.out.println("Calculator is closed");
    }
}