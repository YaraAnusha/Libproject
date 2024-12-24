package anusha;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
class A
{
	static Scanner Sc=new Scanner(System.in);
	private String password;
	private String username;
	static final String def = "\u001b[0;1m";
    	static final String blink = "\u001b[5m";
    	static final String red =  "\u001b[31;1m";
    	static final String green = "\u001b[32;1m";
    	static final String yellow = "\u001b[33;1m";
    	static final String blue = "\u001b[34;1m";
    	static final String purpe = "\u001b[35;1m";
    	static final String skblue = "\u001b[36;1m";
    	static final String bgred =  "\u001b[101;1m";
    	static final String bggreen = "\u001b[102;1m";
    	static final String bgyellow = "\u001b[103;1m";
    	static final String bgblue = "\u001b[104;1m";
   	static final String bgpurpe = "\u001b[105;1m";
    	static final String bgskblue = "\u001b[106;1m";
	void setpassword(String password)
	{
		this.password=password;
	}
	void setusername(String username)
	{
		this.username=username;
	}
	String getpassword()
	{
		return password;
	}
	String getusername()
	{
		return username;
	}
}
abstract class I1
{
	abstract int CSE();
	abstract int Civil();
	abstract int IT();
	abstract int EEE();

}
class Books extends B
{
	static Scanner sc = new Scanner(System.in);
	static int c=0;
	static Books obj = new Books();
	static Login obj2 =  new Login();
	int amount=0;
	int rent=0;
	
	static String bname[] = new String[10];
	static int bprice[] = new int[10];
	int opt;
	void number()
	{
		System.out.print(green);
        	System.out.println("Enter your mobile number:");
        	System.out.print(def);
        	String num = sc.next();
		if (num.length() == 10 && num.matches("[6789]\\d{9}")) 
		{
            		otp();
        	} 
		else
		{
			System.out.print(red);
			System.out.println("Not a Valid  Mobile Number");
			System.out.print(def);
			number();
		}
	}
	void otp()
	{
		Random rand = new Random();
		int m=9999-1000+1;
		int otp=1000+rand.nextInt(m);
		System.out.print(blue);
		System.out.println(" OTP is : "+otp);
		System.out.print(def);
		System.out.print(green);
		System.out.println("Enter your otp");
		System.out.print(def);
		int Otp =sc.nextInt();
		if(Otp==otp)
		{
			System.out.print(green);
			System.out.println("Login  Successfull");
			System.out.print(def);

		}
		else
		{
			System.out.print(red);
			System.out.println("Invalid Otp");
			System.out.print(def);
			otp();
		}
	}
	void Payment()
	{
		System.out.print(yellow);
		System.out.println("1.Want to continue Payment ");
		System.out.println("2. Go back");
		System.out.print(def);
		int p= sc.nextInt();
		if(p==1)
		{
			System.out.print(green);
			System.out.println("Choose payment options:");
			System.out.print(def);
			System.out.print(red);
			System.out.println("1.Phonepe");
			System.out.print(def);
			int pc = sc.nextInt();
			switch (pc)
			{
			
			case 1:
			{
				System.out.print(green);
				System.out.println("Welcome to Phonepe");
				System.out.print(def);
				number();
				phonepe();
				break;
			}
			
			default:
			{
				System.out.print(red);
				System.out.println("Invalid Input");
				System.out.print(def);
				Payment();
				break;
			}
			}
		}
		else
		{
			checkout();
		}
	}
	void cashback()
	{
		Random rand = new Random();
		int m=rand.nextInt(6);
		switch (m)
		{
		case 0:
			System.out.println("Better Luck Next Time!!");
			break;
		case 1:
		{
			System.out.println("Won Amazon Coupon Worth 50rs");
			break;
		}
		case 2:
		{
			System.out.println("Won Zepto Coupon Worth 50rs");
			break;
		}
		case 3:
		{
			System.out.println("Won 5% off on Myntra");
			break;
		}
		case 4:
		{
			System.out.println("Won Gold Lenscart MemberShip");
			break;
		}
		case 5:
		{
			System.out.println("Won 10rs Cashback");
			break;
		}
		}
	}
	
	void phonepe()
	{
		System.out.print(green);
		System.out.println("Total Amount : "+ amount);
		System.out.println("Want to continue your payment (y/n)");
		System.out.print(def);
		char cc = sc.next().charAt(0);
		if(cc=='y')
		{
			System.out.print(skblue);
			System.out.println("Enter your 6 digit UPI-ID ");
			System.out.print(def);
			int pin = sc.nextInt();
			String l = String.valueOf(pin);
			if(l.length() == 6)
			{
				cashback();
				System.out.print(green);
				System.out.println("Payment Successfull");
				System.out.println("Thanks for Visiting!!");
				System.out.print(def);
			}
			else
			{
				System.out.print(red);
				System.out.println("Invalid Pin");
				System.out.print(def);
			}
		}
		else
		{
			System.out.print(purpe);
			System.out.println("Want to Go back (y/n)");
			System.out.print(def);
			char c1 = sc.next().charAt(0);
			if(c1=='y')
			{
				obj2.catselect(obj2.cat());
			}
			else
			{
				System.out.print(green);
				System.out.println("Thanks for Visiting!!");
				System.out.print(def);
				System.exit(0);
			}
		}
	}

	void rebook() {
		System.out.print(yellow);
		System.out.println("Select: 1. Select another book 2. Want to CheckOut");
		System.out.print(def);
		int ans = sc.nextInt();
		switch (ans) {
		case 1: {
			obj2.catselect(obj2.cat());
			break;
		}
		case 2: {
			System.out.print(green);
			System.out.println("Checking out..");
			System.out.print(def);
			checkout();
			break;
		}
		default: {
			System.out.print(red);
			System.out.println("Invalid Selection ");
			System.out.print(def);
			rebook();
			break;
		}
		}
	}
	void addBook(String name, int price) {
		System.out.print(skblue);
		System.out.println("Do you want to select this Book?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		System.out.print(def);
		int cb = sc.nextInt();

		switch (cb) {
		case 1: {
			int cc = 0;
			for (int i = 0; i < obj.c; i++) {
				if (obj.bname[i].equals(name)) {
					cc++;
				}
			}
			if (cc == 0) {
				System.out.print(green);
				System.out.println("The book you have selected is " + name);
				System.out.println("Price of the book = " + price);
				System.out.print(def);
				obj.bname[obj.c] = name;
				obj.bprice[obj.c] = price;
				obj.c++;
				rebook();
			} else {
				System.out.print(red);
				System.out.println("Book already exists");
				System.out.print(def);
				System.out.print(skblue);
				System.out.println("Do you want to add another one?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				System.out.print(def);
				int as = sc.nextInt();
				switch (as) {
				case 1: {
					System.out.print(green);
					System.out.println("The book you have selected is " + name);
					System.out.println("Price of the book = " + price);
					System.out.print(def);
					obj.bname[obj.c] = name;
					obj.bprice[obj.c] = price;
					obj.c++;
					rebook();
					return;
				}
				case 2: {
					obj2.catselect(obj2.cat());
					return;
				}
				default: {
					System.out.print(red);
					System.out.println("Invalid Selection");
					System.out.print(def);
					addBook(name, price);
					return;
				}
				}
			}
			return;
		}
		case 2: {
			obj2.catselect(obj2.cat());
			return;
		}
		default: {
			System.out.print(red);
			System.out.println("Invalid Selection");
			System.out.print(def);
			addBook(name, price);
			return;
		}
		}
	}
	void cseselection(int Z) {
		switch (Z) {
		case 1:
			addBook("Introduction to Algorithms", 800);
			break;
		case 2:
			addBook("Computer Networks", 780);
			break;
		case 3:
			addBook("Database System", 900);
			break;
		case 4:
			addBook("Machine Learning", 990);
			break;
		case 5:
			addBook("Deep Learning", 1200);
			break;
		case 6:
			addBook("Java", 890);
			break;
		case 7:
			addBook("The C Programming Language", 700);
			break;
		case 8:
			addBook("C++ Programming", 900);
			break;
		case 9:
			addBook("Foundations of Computer Science", 480);
			break;
		case 10:
			addBook("Microprocessors With Application", 1200);
			break;
		case 11:
			System.out.println("Going back To Main Menu!!");
			obj2.catselect(obj2.cat());
			break;
		default:
			System.out.print(red);
			System.out.println("Oops!! Enter a valid input....");
			System.out.print(def);
			cseselection(obj.CSE());
			break;
		}
	}
	void cvselection(int Z) {
		switch (Z) {
		case 1:
			addBook("Structural Analysis", 850);
			break;
		case 2:
			addBook("Strength of Materials", 650);
			break;
		case 3:
			addBook("Surveying Vol. 1", 600);
			break;
		case 4:
			addBook("Building Materials", 580);
			break;
		case 5:
			addBook("Concrete Technology", 820);
			break;
		case 6:
			addBook("Theory of Structures", 700);
			break;
		case 7:
			addBook("Water Supply Engineering", 800);
			break;
		case 8:
			addBook("Highway Engineering", 850);
			break;
		case 9:
			addBook("Design of Concrete Structures", 930);
			break;
		case 10:
			addBook("Irrigation Engineering and Hydraulic Structures", 920);
			break;
		case 11:
			System.out.println("Going back To Main Menu!!");
			obj2.catselect(obj2.cat());
			break;
		default:
			System.out.print(red);
			System.out.println("Oops!! Enter a valid input....");
			System.out.print(def);
			cvselection(obj.Civil());
			break;
		}
	}
	void itselection(int Z) {
		switch (Z) {
		case 1:
			addBook("Computer Networks", 780);
			break;
		case 2:
			addBook("Database Management Systems", 800);
			break;
		case 3:
			addBook("Digital Logic and Computer Design", 750);
			break;
		case 4:
			addBook("Computer System Architecture", 800);
			break;
		case 5:
			addBook("Web Technologies", 890);
			break;
		case 6:
			addBook("Software Engineering", 860);
			break;
		case 7:
			addBook("Data Communication and Networking", 850);
			break;
		case 8:
			addBook("Artificial Intelligence", 780);
			break;
		case 9:
			addBook("The Data Warehouse Toolkit", 850);
			break;
		case 10:
			addBook("Learning SQL", 780);
			break;
		case 11:
			System.out.println("Going back To Main Menu!!");
			obj2.catselect(obj2.cat());
			break;
		default:
			System.out.print(red);
			System.out.println("Oops!! Enter a valid input....");
			System.out.print(def);
			itselection(obj.IT());
			break;
		}
	}
	void eeeselection(int Z) {
		switch (Z) {
		case 1:
			addBook("Control System Fundamentals By William S. Levine", 499);
			break;
		case 2:
			addBook("Comprehensive Dictionary of Electrical Engineering By Philip A. LaPlante", 480);
			break;
		case 3:
			addBook("Semi Conductor Devices and Circuits By Jerry C. Whitaker", 450);
			break;
		case 4:
			addBook("Industrial Control By E.A. Parr", 499);
			break;
		case 5:
			addBook("Magnetic Core Selection for Transformers and Inductors By William T. Mclyman", 450);
			break;
		case 6:
			addBook("Protection Techniques in Electrical Energy Systems By A. Wiszniewski", 399);
			break;
		case 7:
			addBook("Power Distribution Network Design for VLSI By Qing K. Zhu", 480);
			break;
		case 8:
			addBook("Protective Relaying: Theory and Applications By Walter A. Elmore", 490);
			break;
		case 9:
			addBook("DC Machines and Transformers By K.N. Srinivas", 450);
			break;
		case 10:
			addBook("A Fundamental of Hybrid and Electric Vehicles By KC. Jain; Amit R. Patil", 499);
			break;
		case 11:
			System.out.println("Going back To Main Menu!!");
			obj2.catselect(obj2.cat());
			break;
		default:
			System.out.print(red);
			System.out.println("Oops!! Enter a valid input....");
			System.out.print(def);
			eeeselection(obj.EEE());
			break;
		}
	}
	
	public static boolean isValidDate(String dateStr, String dateFormat) 
	{
        	SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        	sdf.setLenient(false);
        	try 
		{
            		sdf.parse(dateStr);
            		return true;
        	} catch (ParseException e) 
		{
            		return false;
        	}
    	}

	void checkout() 
	{
    	if (obj.bprice[0] != 0)
	 {
        System.out.print(green);
        System.out.println("Select:");
        System.out.println("1. Want to Buy the Books selected ");
        System.out.println("2. Want to Rent the Books selected");
        System.out.print(def);
        int choice = sc.nextInt();
        if (choice == 1) 
	{
            System.out.print(skblue);
            System.out.println("You have selected the following books:");
            System.out.print(def);
            for (int i = 0; i < obj.c; i++) 
		{
                if (obj.bname[i] != null) 
			{
                    System.out.print(yellow);
                    System.out.println((i + 1) + ". " + obj.bname[i] + " - " + obj.bprice[i]);
                    System.out.print(def);
                    amount += obj.bprice[i];
                	}
            	}
            System.out.print(green);
            System.out.println("Total amount: " + amount);
            System.out.print(def);
            Payment();
        } 
	else if (choice == 2) 
	{
            LocalDate today = LocalDate.now();
            System.out.print(green);
            System.out.println("Enter the date when you want to return (yyyy-MM-dd):");
            System.out.print(def);
            String dateInput = sc.next();
            if (isValidDate(dateInput, "yyyy-MM-dd"))
		 {
                LocalDate returnDate = LocalDate.parse(dateInput);
                long daysKept = ChronoUnit.DAYS.between(today, returnDate);
                if (daysKept < 0) 
			{
                    System.out.print(red);
                    System.out.println("Return date cannot be in the past.");
                    System.out.print(def);
                    checkout();
                    return;
                }
                amount = 0;
                for (int i = 0; i < obj.c; i++) 
		{
                    if (obj.bname[i] != null) 
			{
                        rent = (obj.bprice[i] * 2 / 100); 
                        System.out.print(blue);
                        System.out.println((i + 1) + ". " + obj.bname[i] + " - " + rent);
                        System.out.print(def);
                        amount += rent * daysKept; 
                    }
                }
                System.out.print(green);
                System.out.println("Total amount to be paid for returning the books: " + amount);
                System.out.print(def);
            } 
	else 
	{
                System.out.print(red);
                System.out.println("Invalid date");
                System.out.print(def);
                checkout();
            }
        } 
	else 
	{
            System.out.print(red);
            System.out.println("Invalid choice ");
            System.out.print(def);
            checkout();
        }
    } 
else 
{
        System.out.print(yellow);
        System.out.println("No Books are selected!!!");
        System.out.println("Select: 1. Want to shop 2. Want to exit");
        System.out.print(def);
        int fs = sc.nextInt();
        if (fs == 1) 
	{
            obj2.catselect(obj2.cat());
        } 
	else if (fs == 2) 
	{
            System.exit(0);
        } 
	else 
	{
            checkout();
        }
    }
}
}
class retrunbooks extends B
{
	static int c=0;
	static String bname[] = new String[10];
	static int bprice[] = new int[10];
	static Books objb = new Books();
	static retrunbooks obj = new retrunbooks();
	int opt;
	void number()
	{
		System.out.print(green);
		System.out.println("Enter your mobile number");
		System.out.print(def);
		long num = sc.nextLong();
		String len = String.valueOf(num);
		if(len.length()==10&&len.charAt(0)>='6')
		{
			otp();
		}
		else
		{
			System.out.print(red);
			System.out.println("Not a Valid  Mobile Number");
			System.out.print(def);
			number();
		}
	}
	void otp()
	{
		Random rand = new Random();
		int m=9999-1000+1;
		int otp=1000+rand.nextInt(m);
		System.out.print(blue);
		System.out.println(" OTP is : "+otp);
		System.out.print(def);
		System.out.print(yellow);
		System.out.println("Enter your otp");
		System.out.print(def);
		int Otp =sc.nextInt();
		if(Otp==otp)
		{
			System.out.println(green);
			System.out.println("Login  Successfull");
			System.out.println(def);

		}
		else
		{
			System.out.println(red);
			System.out.println("Invalid Otp");
			System.out.println(def);
			otp();
		}
	}
	void Payment()
	{
		System.out.println(green);
		System.out.println("1.Want to continue Payment ");
		System.out.println("2. Go back");
		System.out.println(def);
		int p= sc.nextInt();
		if(p==1)
		{
			System.out.println("Choose your payment options:");
			System.out.println("1.Phonepe");
			int pc = sc.nextInt();
			switch (pc)
			{
			
			case 1:
			{
				System.out.println("Welcome to Phonepe");
				number();
				phonepe();
				break;
			}
			
			
			default:
			{
				System.out.println("Invalid Input");
				Payment();
				break;
			}
			}
		}
		else
		{
			returncatselect(returncat());
		}
	}
	void cashback()
	{
		Random rand = new Random();
		int m=rand.nextInt(6);
		switch (m)
		{
		case 0:
			System.out.println("Better Luck Next Time!!");
			break;
		case 1:
		{
			System.out.println("Won Amazon Coupon Worth 50rs");
			break;
		}
		case 2:
		{
			System.out.println("Won Zepto Coupon Worth 50rs");
			break;
		}
		case 3:
		{
			System.out.println("Won 5% off on Myntra");
			break;
		}
		case 4:
		{
			System.out.println("Won Gold Lenscart MemberShip");
			break;
		}
		case 5:
		{
			System.out.println("Won 10rs Cashback");
			break;
		}
		}
	}
	
	void phonepe()
	{
		System.out.println("Total Amount : "+ (-1*amount));
		System.out.println("Want to continue your payment (y/n)");
		char cc = sc.next().charAt(0);
		if(cc=='y')
		{
			System.out.println("Enter your 6 digit UPI-ID ");
			int pin = sc.nextInt();
			String l = String.valueOf(pin);
			if(l.length() == 6)
			{
				cashback();
				System.out.println("Payment Successfull");
				System.out.println("Thanks for Visiting!!");
			}
			else
			{
				System.out.println("Invalid Pin");
				phonepe();
			}
		}
		else
		{
			System.out.println("Want to Go back (y/n)");
			char c1 = sc.next().charAt(0);
			if(c1=='y')
			{
				returncatselect(returncat());
			}
			else
			{
				System.out.println("Thanks for Visiting!!");
				System.exit(0);
			}
		}
	}
	
	int returncat()
	{
		System.out.println("select the category of Books to return ");
		System.out.println("please select your category ");
		System.out.println("1.CSE       2.Civil     3.IT        4.EEE   5.EXIT");
		return sc.nextInt();
	}
	void returncatselect(int x)
	{
		switch(x)
		{
		case 1:
			cseselection(objb.CSE());
			break;
		case 2:
			cvselection(objb.Civil());
			break;
		case  3:
			itselection(objb.IT());
			break;
		case 4:
			eeeselection(obj.EEE());
			break;
		
        	case 5:
        		System.exit(0);
        		break;
        	default:
            		System.out.println("wrong Input");
            		returncatselect(returncat());
		}

	}

	static Login obj2 =  new Login();
	int amount=0;
	int rent=0;
	
	void rebook() {
		System.out.println(green);
		System.out.println("Select: 1. Select another book 2. Want to CheckOut");
		System.out.println(def);
		int ans = sc.nextInt();
		switch (ans) {
		case 1: {
			returncatselect(returncat());
			return;
		}
		case 2: {
			System.out.println("Checking out..");
			returncheckout();
			return;
		}
		default: {
			System.out.println("Invalid Selection ");
			rebook();
			return;
		}
		}
	}
	void addBook(String name, int price) {
		System.out.println(green);
		System.out.println("Do you want to select this Book?");
		System.out.println(def);
		System.out.println("1. Yes");
		System.out.println("2. No");
		int cb = sc.nextInt();

		switch (cb) {
		case 1: {
			int cc = 0;
			for (int i = 0; i < obj.c; i++) {
				if (obj.bname[i].equals(name)) {
					cc++;
				}
			}
			if (cc == 0) {
				System.out.println(purpe);
				System.out.println("The book you have selected is " + name);
				System.out.println("Price of the book = " + price);
				System.out.println(def);
				obj.bname[obj.c] = name;
				obj.bprice[obj.c] = price;
				obj.c++;
				rebook();
			} else {
				System.out.println(red);
				System.out.println("Book already exists.");
				System.out.println("Do you want to add another one?");
				System.out.println(def);
				System.out.println("1. Yes");
				System.out.println("2. No");
				int as = sc.nextInt();
				switch (as) {
				case 1: {
					System.out.println(yellow);
					System.out.println("The book you have selected is " + name);
					System.out.println("Price of the book = " + price);
					System.out.println(def);
					obj.bname[obj.c] = name;
					obj.bprice[obj.c] = price;
					obj.c++;
					rebook();
					return;
				}
				case 2: {
					returncatselect(returncat());
					return;
				}
				default: {
					System.out.println(red);
					System.out.println("Invalid Selection");
					System.out.println(def);
					addBook(name, price);
					return;
				}
				}
			}
			return;
		}
		case 2: {
			returncatselect(returncat());
			return;
		}
		default: {
			System.out.println(red);
			System.out.println("Invalid Selection");
			System.out.println(def);
			addBook(name, price);
			return;
		}
		}
	}

	void cseselection(int Z) {
		switch (Z) {
		case 1:
			addBook("Introduction to Algorithms", 800);
			break;
		case 2:
			addBook("Computer Networks", 780);
			break;
		case 3:
			addBook("Database System", 900);
			break;
		case 4:
			addBook("Machine Learning", 990);
			break;
		case 5:
			addBook("Deep Learning", 1200);
			break;
		case 6:
			addBook("Java", 890);
			break;
		case 7:
			addBook("The C Programming Language", 700);
			break;
		case 8:
			addBook("C++ Programming", 900);
			break;
		case 9:
			addBook("Foundations of Computer Science", 480);
			break;
		case 10:
			addBook("Microprocessors With Application", 1200);
			break;
		case 11:
			System.out.println("Going back To Main Menu!!");
			returncatselect(returncat());
			break;
		default:
			System.out.println("Oops!! Enter a valid input....");
			cseselection(obj.CSE());
			break;
		}
	}
	void cvselection(int Z) {
		switch (Z) {
		case 1:
			addBook("Structural Analysis", 850);
			break;
		case 2:
			addBook("Strength of Materials", 650);
			break;
		case 3:
			addBook("Surveying Vol. 1", 600);
			break;
		case 4:
			addBook("Building Materials", 580);
			break;
		case 5:
			addBook("Concrete Technology", 820);
			break;
		case 6:
			addBook("Theory of Structures", 700);
			break;
		case 7:
			addBook("Water Supply Engineering", 800);
			break;
		case 8:
			addBook("Highway Engineering", 850);
			break;
		case 9:
			addBook("Design of Concrete Structures", 930);
			break;
		case 10:
			addBook("Irrigation Engineering and Hydraulic Structures", 920);
			break;
		case 11:
			System.out.println("Going back To Main Menu!!");
			returncatselect(returncat());
			break;
		default:
			System.out.println("Oops!! Enter a valid input....");
			cvselection(obj.Civil());
			break;
		}
	}
	void itselection(int Z) {
		switch (Z) {
		case 1:
			addBook("Computer Networks", 780);
			break;
		case 2:
			addBook("Database Management Systems", 800);
			break;
		case 3:
			addBook("Digital Logic and Computer Design", 750);
			break;
		case 4:
			addBook("Computer System Architecture", 800);
			break;
		case 5:
			addBook("Web Technologies", 890);
			break;
		case 6:
			addBook("Software Engineering", 860);
			break;
		case 7:
			addBook("Data Communication and Networking", 850);
			break;
		case 8:
			addBook("Artificial Intelligence", 780);
			break;
		case 9:
			addBook("The Data Warehouse Toolkit", 850);
			break;
		case 10:
			addBook("Learning SQL", 780);
			break;
		case 11:
			System.out.println("Going back To Main Menu!!");
			returncatselect(returncat());
			break;
		default:
			System.out.println("Oops!! Enter a valid input....");
			itselection(obj.IT());
			break;
		}
	}
	void eeeselection(int Z) {
		switch (Z) {
		case 1:
			addBook("Control System Fundamentals By William S. Levine", 499);
			break;
		case 2:
			addBook("Comprehensive Dictionary of Electrical Engineering By Philip A. LaPlante", 480);
			break;
		case 3:
			addBook("Semi Conductor Devices and Circuits By Jerry C. Whitaker", 450);
			break;
		case 4:
			addBook("Industrial Control By E.A. Parr", 499);
			break;
		case 5:
			addBook("Magnetic Core Selection for Transformers and Inductors By William T. Mclyman", 450);
			break;
		case 6:
			addBook("Protection Techniques in Electrical Energy Systems By A. Wiszniewski", 399);
			break;
		case 7:
			addBook("Power Distribution Network Design for VLSI By Qing K. Zhu", 480);
			break;
		case 8:
			addBook("Protective Relaying: Theory and Applications By Walter A. Elmore", 490);
			break;
		case 9:
			addBook("DC Machines and Transformers By K.N. Srinivas", 450);
			break;
		case 10:
			addBook("A Fundamental of Hybrid and Electric Vehicles By KC. Jain; Amit R. Patil", 499);
			break;
		case 11:
			System.out.println("Going back To Main Menu!!");
			returncatselect(returncat());
			break;
		default:
			System.out.println("Oops!! Enter a valid input....");
			eeeselection(obj.EEE());
			break;
		}
	}
	boolean isValidDate(String dateStr, String dateFormat)
	{
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		sdf.setLenient(false);
		try
		{

			sdf.parse(dateStr);
			return true;
		}
		catch (ParseException e)
		{
			return false;
		}
	}

	void returncheckout() 
	{
    	if (obj.bprice[0] != 0) 
	{
        LocalDate today = LocalDate.now();
        System.out.print("Enter the date when you took the books (yyyy-MM-dd): ");
        String dateInput = new Scanner(System.in).nextLine(); 
        
        if (isValidDate(dateInput, "yyyy-MM-dd"))
	 { 
            LocalDate takenDate = LocalDate.parse(dateInput); 
            long daysKept = ChronoUnit.DAYS.between(takenDate, today);
 
            if (daysKept > 0) { 
                amount = 0; 
                for (int i = 0; i < obj.c; i++) { rent = (obj.bprice[i] * 2 / 100); 
                    System.out.println((i + 1) + ". " + obj.bname[i] + " - " + rent); 
                    amount += rent * daysKept;
                }
                System.out.println("Total amount to be paid for returning the books: " + amount); 
                Payment();
            } else {
                System.out.println("Invalid return date. Please ensure the return date is after the date you took the books.");
                returncheckout(); 
            }
        } else {
            System.out.println("Invalid date format. Please try again.");
            returncheckout(); 
        }
    } 
else 
{
        System.out.println("No Books are selected!!!");
        System.out.println("Select: 1. Want to shop 2. Want to exit");
        int fs = sc.nextInt();
        if (fs == 1) 
	{
            obj2.catselect(obj2.cat());
        } 
	else if (fs == 2) 
	{
            System.exit(0);
         } 
	else
	 {
            returncheckout();
        }
    }
}

}
class B extends I1
{
	static Scanner sc = new Scanner(System.in);
	static final String def = "\u001b[0;1m";
    	static final String blink = "\u001b[5m";
    	static final String red =  "\u001b[31;1m";
    	static final String green = "\u001b[32;1m";
    	static final String yellow = "\u001b[33;1m";
    	static final String blue = "\u001b[34;1m";
    	static final String purpe = "\u001b[35;1m";
    	static final String skblue = "\u001b[36;1m";
    	static final String bgred =  "\u001b[101;1m";
    	static final String bggreen = "\u001b[102;1m";
    	static final String bgyellow = "\u001b[103;1m";
    	static final String bgblue = "\u001b[104;1m";
   	static final String bgpurpe = "\u001b[105;1m";
    	static final String bgskblue = "\u001b[106;1m";

	int CSE()
	{
		System.out.println(purpe);
		System.out.println("                                   ******** Welcome To CSE Department ******** ");
		System.out.println(def);
		System.out.println();
		System.out.println(red);
		System.out.println("S.NO	        Books name                                Authors		  Edition		 Price");
		System.out.println(def);
		System.out.println("1               Introduction to Algorithms               Thomas H. Cormen           4th Edition              800");
		System.out.println("2               Computer Networks                        Andrew S.Tanenbaum         5th Edition              780");
		System.out.println("3               Database System                          Abraham Silberschatz       6th Edition              900");
		System.out.println("4               Machine Learning                         Tom M. Mitchell            1st Edition              990");
		System.out.println("5               Deep Learning                            Yoshua Bengio              1st Edition              1200");
		System.out.println("6               Java                                     Joshua Bloch               3rd Edition              890");
		System.out.println("7               The C Programming Language               Brian W. Kernighan         2nd Edition              700");
		System.out.println("8               C++ Programming                          Barbara Johanston          6th Edition              900");
		System.out.println("9               Foundations of Computer Science          Alfred V                   2nd Edition              480");
		System.out.println("10              Microprocessors With Application         Ahson                      1st Edition              200");
		System.out.println("11.             Go Back To Menu!");
		System.out.println();
		System.out.println("Want to checkout");
		System.out.println(green);
		System.out.println("Select the Book You Want ");
		System.out.println(def);
		return  sc.nextInt();
	}
	int Civil() {
		System.out.println(purpe);
		System.out.println("                                    ******** Welcome To CIVIL Department ******** ");
		System.out.println(def);
		System.out.println();
		System.out.println(red);
		System.out.println("S.No            Books name                                          Authors                 Edition                 Price");
		System.out.println(def);
		System.out.println("1.              Structural Analysis                                 R.C. Hibbeler           10th Edition            850");
		System.out.println("2.              Strength of Materials                               S. Ramamrutham          7th Edition             650");
		System.out.println("3.              Surveying Vol. 1                                    Ashok Kumar Jain        17th Edition            600");
		System.out.println("4.              Building Materials                                  S.K. Duggal             4th Edition             580");
		System.out.println("5.              Concrete Technology                                 M.S. Shetty             6th Edition             820");
		System.out.println("6.              Theory of Structures                                S. Ramamrutham          9th Edition             700");
		System.out.println("7.              Water Supply Engineering                            S.K. Garg               7th Edition             800");
		System.out.println("8.              Highway Engineering                                 S.K. Khanna             1st Edition             850");
		System.out.println("9.              Design of Concrete Structures                       Arthur H. Nilson        4th Edition             930");
		System.out.println("10.             Irrigation Engineering and Hydraulic Structures     S.K. Garg               3rd Edition             920");
		System.out.println("11.         Go Back To Menu!");
		System.out.println();
		System.out.println("Want to checkout");
		System.out.println(green);
		System.out.println("Select the Book You Want ");
		System.out.println(def);
		return  sc.nextInt();
	}
	int IT() {
		System.out.println(purpe);
		System.out.println("                                    ******** Welcome To IT Department ******** ");
		System.out.println(def);
		System.out.println();
		System.out.println(red);
		System.out.println("S.No                Book name                               Authors                     Edition                     Price");
		System.out.println(def);
		System.out.println("1.                  Computer NetworksDavid                  J. Wetherall                5th Edition                 780");
		System.out.println("2.                  Database Management Systems             Johannes Gehrke             3rd Edition                 800");
		System.out.println("3.                  Digital Logic and Computer Design       M. Morris Mano              4th Edition                 750");
		System.out.println("4.                  Computer System Architecture            M. Morris Mano              3rd Edition                 800");
		System.out.println("5.                  Web Technologies                        Jeffrey C. Jackson          2nd Edition                 890");
		System.out.println("6.                  Software Engineering                    Joanne M. Atlee             4th Edition                 860");
		System.out.println("7.                  Data Communication and Networking       Behrouz A. Forouzan         5th Edition                 850");
		System.out.println("8.                  Artificial Intelligence                 Melanie Mitchell            1st Edition                 780");
		System.out.println("9.                  The Data Warehouse Toolkit              Margy Ross                  3rd Edition                 850");
		System.out.println("10.                 Learning SQLA                           lan Beaulieu                3rd Edition                 780");
		System.out.println("11.                 Go Back To Menu!");
		System.out.println();
		System.out.println("Want to checkout");
		System.out.println(green);
		System.out.println("Select the Book You Want ");
		System.out.println(def);
		return  sc.nextInt();
	}
	int EEE()
	{
		System.out.println(purpe);
		System.out.println("                                   ******** Welcome To the Electrical Engineering Department ******** ");
		System.out.println(def);
		System.out.println();
		System.out.println(red);
		System.out.println("S.No   Name of the Book                                             Author                          Edition                   Price");
		System.out.println(def);
		System.out.println("1.     Control System Fundamentals                                  William S. Levine               3rd   Edition             Rs. 499/-");
		System.out.println("2.     Comprehensive Dictionary of Electrical Engineering           Philip A. LaPlante              2nd   Edition             Rs. 480/-");
		System.out.println("3.     Semi Conductor Devices and Circuits                          Jerry C. Whitaker               1st   Edition             Rs. 450/-");
		System.out.println("4.     Industrial Control                                           E.A. Parr                       4th   Edition             Rs. 499/-");
		System.out.println("5.     Magnetic Core Selection for Transformers and Inductors       William T. Mclyman              6th   Edition             Rs. 450/-");
		System.out.println("6.     Protection Techniques in Electrical Energy Systems A.        Wiszniewski                     5th   Edition             Rs. 399/-");
		System.out.println("7.     Power Distribution Network Design for VLSI                   Qing K. Zhu                     3rd   Edition             Rs. 480/-");
		System.out.println("8.     Protective Relaying: Theory and Applications                 Walter A. Elmore                4th   Edition             Rs. 490/-");
		System.out.println("9.     DC Machines and Transformers                                 K.N. Srinivas                   2nd   Edition             Rs. 450/-");
		System.out.println("10.    A Fundamental of Hybrid and Electric Vehicles                KC. Jain; Amit R. Patil         1st   Edition             Rs. 499/-");
		System.out.println("11.    Go Back To Menu!");
		System.out.println();
		System.out.println("Want to checkout");
		System.out.println(green);
		System.out.println("Select the Book You Want ");
		System.out.println(def);
		return  sc.nextInt();
	}
	
}
class  Login extends A
{
	static Scanner sc = new Scanner(System.in);
	A obj=new A();
	String use,pass;
	void number()
	{
		System.out.println("Enter your mobile number");
		long num = sc.nextLong();
		String len = String.valueOf(num);
		if(len.length()==10&&len.charAt(0)>='6')
		{
			otp();
		}
		else
		{
			System.out.println("Not a Valid  Mobile Number");
			number();
		}
	}
	void Login1()
	{
		obj.setusername("Admin");
		obj.setpassword("Admin@123");

		use = obj.getusername();
		pass = obj.getpassword();
	}
boolean isValidUsername(String username) {
    // Check length
    if (username.length() < 5 || username.length() > 15) {
        return false;
    }
    
    // Check for alphanumeric characters
    if (!username.matches("^[a-zA-Z0-9]*$")) {
        return false;
    }
    
    return true; // Username is valid
}
boolean isValidPassword(String password) {
  
    if (password.length() < 8) {
        return false;
    }

  
    if (!password.matches(".*[A-Z].*")) {
        return false;
    }

 
    if (!password.matches(".*[a-z].*")) {
        return false;
    }

  
    if (!password.matches(".*\\d.*")) {
        return false;
    }

    
    if (!password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {
        return false;
    }

    return true; 
}
	void Signup()
	{
		String username;
        while (true) {
            System.out.println(green);
            System.out.println("Set your username (5-15 characters, alphanumeric only):");
            System.out.println(def);
            username = sc.next();

            if (isValidUsername(username)) {
                obj.setusername(username);
                break; // Exit the loop if the username is valid
            } else {
                System.out.println(red);
                System.out.println("Username does not meet the requirements. Please try again.");
                System.out.print(def);
            }
        }
		

	String password; 
    	while (true) 
	{
        System.out.println(green);
        System.out.println("Set your password (at least 8 characters, including uppercase, lowercase, digit, and special character):");
        System.out.println(def);
        password = sc.next(); 

        if (isValidPassword(password))
	 {
            obj.setpassword(password);
            break; 
        } 
	else
	 {
            System.out.println(red);
            System.out.println("Password does not meet the requirements. Please try again.");
            System.out.print(def);
        }
    }
		use = obj.getusername();
		pass = obj.getpassword();
		System.out.println(blue);
		System.out.println("Login successful");
		System.out.println(def);

	}
	void otp()
	{
		Random rand = new Random();
		int m=9999-1000+1;
		int otp=1000+rand.nextInt(m);
		System.out.println(" OTP is : "+otp);
		System.out.println("Enter your otp");
		int Otp =sc.nextInt();
		if(Otp==otp)
		{
			Signup();
		}
		else
		{
			System.out.println("Invalid Otp");
			otp();
		}
	}
	int select ()
	{
		System.out.println(green);
		System.out.println("!Enter valid input!");
		System.out.println(def);
		System.out.println("1 for sign in");
		System.out.println("2 for sign up");
		return sc.nextInt();
	}
	int  result(int z)
	{
		switch(z)
		{
		case 1:
			Login1();
			break;
		case 2:
			number();
			break;
		default:
			System.out.println(red);
			System.out.println("Sorry!invalid input please select valid input");
			System.out.println(def);
			result(select());
			break;
		}
		return 1;
	}
	int cat()
	{
		
		System.out.println(green);
		System.out.println("please select your category");
		System.out.println(def);
		System.out.println(blue);
		System.out.println("1.CSE       2.Civil     3.IT        4.EEE     5.Exit");
		System.out.println(def);
		return sc.nextInt();
	}
	void catselect(int x)
	{
		Books objb = new Books();
		switch(x)
		{
		case 1:
			objb.cseselection(objb.CSE());
			break;
		case 2:
			objb.cvselection(objb.Civil());
			break;
		case  3:
			objb.itselection(objb.IT());
			break;
		case  4:
			objb.eeeselection(objb.EEE());
			break;
		
		case 5:
			objb.checkout();
			break;
        case 6:
            System.exit(0);
            break;
        default:
            System.out.println("Wrong input");
            catselect(cat());
		}
	}
	int recheck(String newusername, String newpassword )
	{
		if (newusername.equals(use)) {
			if (newpassword.equals(pass))
			{
				System.out.println(green);
				System.out.println("select:");
				System.out.println(def);
				System.out.println(yellow);
				System.out.println("1.Want to Buy/rent  books");
				System.out.println("2.Want to  return books");
				System.out.println(def);
				int s = Sc.nextInt();
				if(s==1)
				{
					catselect(cat());
				}
				else if(s==2)
				{
					retrunbooks objr =  new retrunbooks();
					objr.returncatselect(objr.returncat());
				}
				else
				{
					System.out.println("Invalid choice");
					recheck(newusername, newpassword);
				}
			}
			else
			{
				System.out.println("Wrong Password ");
				System.out.println("Enter Password");
				recheck(newusername, sc.next());
			}
		}
		else
		{
			System.out.println("Wrong username");
			System.out.println("select :");
			System.out.println("1.Sign in");
			System.out.println("2.Sign up");
			int  x = sc.nextInt();
			if(x==1)
			{
				System.out.println("Enter Username");
				String s= sc.next();
				System.out.println("Enter Password");
				String s1 = sc.next();
				recheck(s,s1);
			}
			else if(x==2)
			{
				int v = result(2);
				if (v==1) {
					if(recheck(newusername, newpassword)==1)
					{
						System.out.println("Account Created !!!");
						catselect(cat());
					}
				}
			}
			else
			{
				System.out.println("Invalid choice");
				recheck(newusername, newpassword);
			}
		}
		return 1;
	}
}
class lib extends Login
{
	public static void main(String[]args)
	{
		lib obj=new lib();
		System.out.println();
		System.out.println(blink);
		System.out.println(bgskblue);
		System.out.println(blue);
		System.out.println("                                   **************************************************               			");
		System.out.println("                                   ******                                      ******                     	");
		System.out.println("                                   ******          Welcome to library          ******                         ");
		System.out.println("                                   ******                                      ******                         ");
		System.out.println("                                   **************************************************                         ");
		System.out.println(def);
		System.out.println();
		obj.result(obj.select());
		System.out.println();
		System.out.println(purpe);
		System.out.println("Enter your username");
		System.out.println(def);
		String newusername = Sc.next();
		System.out.println(purpe);
		System.out.println("Enter your Password");
		System.out.println(def);
		String newpassword = Sc.next();
		System.out.println(def);
		obj.recheck(newusername, newpassword);

	}
}
