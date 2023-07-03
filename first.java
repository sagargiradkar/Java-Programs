import java.util.Scanner; 
class Complex {
	int real, imaginary;
	int mul,r;
	float n1,n2;
	float d;
	float div1,div2;
	int b1,b2;
	Complex()
	{
	}
	//Taking input from object
	Complex(int i, int r)
	{
		real =i;    
		imaginary =r;  
	}
	//Display Complex Number
	void display()
	{
		System.out.println("Number is :"+real+" + "+imaginary+" i ");
	}
	//Perform addition of two number
	 void Sum(Complex a1, Complex a2)
	{
		 real=a1.real+a2.real;
		imaginary=a1.imaginary+a2.imaginary;
	}
	 //display addition of two complex number
	 void dis()
	 {
			System.out.println("The Sum of two complex number is :"+real+" + "+imaginary+" i ");
	 }
	 //perfom substraction on two complex number
	 void sub(Complex a1, Complex a2)
		{
			real=a1.real-a2.real;
			imaginary=a1.imaginary-a2.imaginary;
		}
	 //print substraction of two complex number 
	 void disp() 
	 {
		 System.out.println("The Substraction of two complex number is :"+real+" + "+imaginary+" i ");
	 }
	 //multiplication of two complex number
	 void mult(Complex a1, Complex a2)
	 	{
		  mul=(a1.real*a2.real)+((-1)*a1.imaginary*a2.imaginary);
		  r=(a1.real*a2.imaginary)+(a1.imaginary*a2.real);	 
		}
	 //Display multiplication of two complex number
	 void dismult() 
	 {
			System.out.println("The multipliccation of two complex number is :"+mul+" + "+r+" i ");	
	 }
	 //perform division of two complex number
	 void division(Complex a1, Complex a2)
		{
		 d=(a2.real*a2.real)+(a2.imaginary*a2.imaginary);
		 n1=(a1.real*a2.real)+(a1.imaginary*a2.imaginary);
		 n2=(a1.imaginary*a2.real)-(a1.real*a2.imaginary);
		 if(d!=0) {
		 div1=(n1/d);
		 div2=(n2/d);
		 System.out.println("The Division of two complex number is :"+div1+" + "+div2+" i ");
		 }
		 else {
			 System.out.println("Division not possible because we cant devide any number by zero");
		 }
		}
	 //display division of two complex number
	
	 }
public class first {
	public static void main(String[] args)
	{
		//entering for choice
		int choice;
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("Arithmatic Operation On Comlex Number");
		System.out.println("*********Main Menu************");
		System.out.println("1.Addition of Complex Numebr");
		System.out.println("2.Substraction Of Complex Number");
		System.out.println("3.Multiplication Of Complex Number");
		System.out.println("4.Division Of Complex Number");
		System.out.println("5.Exit");
		System.out.print("Enter Your Choice:");
		choice=sc.nextInt();
		//used of switch case
		switch(choice) {
		case 1 :
			//creation of a object of class Complex
			System.out.print("Enter real part :");
			int x = sc.nextInt();
			System.out.print("Enter imaginary part :");
			int y =sc.nextInt();
		Complex b1 = new Complex(x,y);
		//calling to method
		b1.display();
		//creation of a object of class Complex
		System.out.print("Enter real part :");
		x = sc.nextInt();
		System.out.print("Enter imaginary part :");
		y =sc.nextInt();
		Complex b2 = new Complex(x,y);
		//calling to method
		b2.display();
		//creation of a object of class Complex
		Complex b3 = new Complex();
		b3.Sum(b1,b2);
		b3.dis();
		break;
		case 2 :
			//creation of a object of class Complex to take input 1st complex number
			System.out.print("Enter real part :");
			x = sc.nextInt();
			System.out.print("Enter imaginary part :");
			y =sc.nextInt();
			Complex c1 = new Complex(x,y);
			//creation of a object of class Complex  to take input 2nd complex number
			System.out.print("Enter real part :");
			x = sc.nextInt();
			System.out.print("Enter imaginary part :");
			y=sc.nextInt();
			Complex c2 = new Complex(x,y);
			//creation of a object of class Complex to display complex number
			Complex b4 = new Complex();
			//calling to method
			b4.sub(c1,c2);
			//calling to method
			b4.disp();
			break;
		case 3 :
			//creation of a object of class Complex
			System.out.print("Enter real part :");
			x= sc.nextInt();
			System.out.print("Enter imaginary part :");
			y =sc.nextInt();
			Complex d1 = new Complex(x,y);
			//creation of a object of class Complex
			System.out.print("Enter real part :");
			x = sc.nextInt();
			System.out.print("Enter imaginary part :");
			y =sc.nextInt();
			Complex d2 = new Complex(x,y);
			//creation of a object of class Complex
			Complex obj =new Complex();
			//calling to method
			obj.mult(d1, d2);
			//calling to method
			obj.dismult();
			break;
		case 4 :
			//creation of a object of class Complex
			System.out.print("Enter real part :");
			 x = sc.nextInt();
			System.out.print("Enter imaginary part :");
			y =sc.nextInt();
			Complex e1 = new Complex(x,y);
			//creation of a object of class Complex
			System.out.print("Enter real part :");
			x = sc.nextInt();
			System.out.print("Enter imaginary part :");
			 y =sc.nextInt();
			Complex e2 = new Complex(x,y);
			//creation of a object of class Complex
			Complex obj1=new Complex();
			//calling to method
			obj1.division(e1, e2);
			//calling to method
			
			break;
		case 5: System.out.println("Exit Thank-You");
				break;
		default: System.out.println("You Entered wrong choice");
		break;
		}
		}while(choice!=5);
		
	}
}
