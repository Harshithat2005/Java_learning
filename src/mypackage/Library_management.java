package mypackage;

import java.util.Scanner;

class Member{
	int memid;
	String memname;
	Member(int memid,String memname){
		this.memid=memid;
		this.memname=memname;
	}

void display_details() {
	System.out.println("Member ID:"+memid);
	System.out.println("Member Name"+memname);
	}
}

class PremiumMember extends Member{
	String membershiptype;
	PremiumMember(int memid,String memname,String membershiptype){
		super(memid,memname);
		this.membershiptype=membershiptype;
		
	}
	void display_details() {
		super.display_details();
		System.out.println("Membership Type:"+membershiptype);
	}
}
public class Library_management {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter member id: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter member name: ");
		String name=sc.nextLine();
		System.out.println("Enter the membership type:");
		String type=sc.nextLine();
		PremiumMember p= new PremiumMember(id,name,type);
		System.out.println("\n Member details: ");
		p.display_details();
		sc.close();
		
		
	}

}
