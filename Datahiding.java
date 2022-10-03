import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ZohoUsers user1=new ZohoUsers("nagulan15520@gmail.com","Nagulan",875668,"asdfg",9842915520L,"19-06-2002",987654321,"YTRE2344","O-");
        System.out.println("Enter the MailID");
        String mailId=input.nextLine();
        System.out.println("Enter the password");
        String password=input.nextLine();
        user1.getDetails(mailId,password);

    }
}
class ZohoUsers
{   private final String mailId;
    private final String userName;
   private final int idCardNumber;
    private final String password;
   private final long phoneNumber;
   private final String dateOfBirth;
   private final int bankAccountNumber;
   private final String ifscCode;
   private final String bloodGroup;
   public ZohoUsers(String mailId,String userName,int idCardNumber,String password,long phoneNumber,String dateOfBirth,int bankAccountNumber,String ifscCode,String bloodGroup)
   {
       this.mailId=mailId;
       this.userName=userName;
       this.idCardNumber=idCardNumber;
       this.password=password;
       this.phoneNumber=phoneNumber;
       this.dateOfBirth=dateOfBirth;
       this.bankAccountNumber=bankAccountNumber;
       this.ifscCode=ifscCode;
       this.bloodGroup=bloodGroup;
   }
   public void getDetails(String mailId,String password)
   {
       if(this.mailId.equals(mailId)&&this.password.equals(password))
       {
           System.out.println("Name:"+userName);
           System.out.println("ID Card Number:"+idCardNumber);
           System.out.println("MailID:"+mailId);
           System.out.println("Phone Number:"+phoneNumber);
           System.out.println("DOB:"+dateOfBirth);
           System.out.println("Bank Account Number:"+bankAccountNumber);
           System.out.println("IFSC Code:"+ifscCode);
           System.out.println("Blood Group:"+bloodGroup);

       }
       else
       {
           System.out.println("Invalid Details");
       }
   }

}