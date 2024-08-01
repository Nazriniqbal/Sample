package encapsulation;

public class SampleEncapsulation1 {

	public static void main(String[] args) {
		
		SampleEncapsulation obj=new SampleEncapsulation();
		obj.setMailId("abc@gmail.com");
		obj.setAccNo(123456);
		obj.setAccBalnc(654321);
		
		System.out.println("mail id :"+obj.getMailId());
		System.out.println("account number :"+obj.getAccNo());
		System.out.println("account balance :"+obj.getAccBalnc());
		
		

	}

}
