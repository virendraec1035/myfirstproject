package Scientific;
import static java.lang.Math.cbrt;
import static java.lang.Math.sqrt;
import java.util.*;

public class SCIENTIFIC_CALCULATOR 
{
public static void main(String args[])
{
    int choice;
    int i,fact=1;
    float pi=(float) 3.14;
    float h,b,p,n,Perimeter,x,y,l,F,C,s,r,sum,sub,Square,Sphare,Volume,Cube,Cuboid,SqRoot,Cone,CubRoot,mul,div,sqrt = 0,AreaT,AreaR,AreaS,Modulus;
    Scanner sc=new Scanner(System.in);
    System.out.println("WELCOME TO OUR SCIENTIFIC CALCULATOR\n");
    System.out.println("Choose 1 for Addition");
    System.out.println("Choose 2 for Substraction");
    System.out.println("Choose 3 for Multiplication");
    System.out.println("Choose 4 for Division");
    System.out.println("Choose 5 for Square");
    System.out.println("Choose 6 for Cube");
    System.out.println("Choose 7 for SquareRoot");
    System.out.println("Choose 8 for CubeRoot");
    System.out.println("Choose 9 for Perimeter of triangle");
    System.out.println("Choose 10 for Area Of Triangle");
    System.out.println("Choose 11 for Perimeter of Rectangle");
    System.out.println("Choose 12 for Area of Rectangle");
    System.out.println("Choose 13 for Perimeter of Square");
    System.out.println("Choose 14 for Area of Square");
    System.out.println("Choose 15 for Hyposteneus when Base and Perpendicular are Known");
    System.out.println("Choose 16  for Perpendicular when Hyptenous and Base are Known");
    System.out.println("Choose 17 for Base when perpendicular and Hypotenous is known");
    System.out.println("Choose 18 for Curved Surface Area of Cube");
    System.out.println("Choose 19 for Total surface Area of Cube");
    System.out.println("Choose 20 for Volume of Cube");
    System.out.println("Choose 21 for Curved Surface Area for Cuboid");
    System.out.println("Choose 22 for Total Surface Area of Cuboid");
    System.out.println("Choose 23 for Volume of cuboid");
    System.out.println("choose 24 for Surface area of Sphere");
    System.out.println("Choose 25 for Volume of Sphere ");
    System.out.println("Choose 26 for Surface area of HemiSphere");
    System.out.println("Choose 27 for Surface area of cone");
    System.out.println("Choose 28 for Volume of Cone");
    System.out.println("Choose 29 for Slant hight for Cone");
    System.out.println("Choose 30 to Conver Degree Celceus to Forenheight");
    System.out.println("Choose 31 to Convert Forenhight to Degree Celcius");
    System.out.println("Choose 32 for factorial of a Number");
    System.out.println("Choose 33 for exit\n");
    choice=sc.nextInt();
   switch(choice)
   {
       case 1:
           System.out.println("Please Enter the Value of x");
           x=sc.nextFloat();
           System.out.println("Enter the Value of y");
           y=sc.nextFloat();
           sum=x+y;
           System.out.println("Addition of Two Number is:"+" "+sum);
           break;
           
       case 2:
           System.out.println("Please Enter the Value of x");
           x=sc.nextFloat();
           System.out.println("Enter the Value of y");
           y=sc.nextFloat();
           sub=x-y;
           System.out.println("Substraction of Two Number is:"+" "+sub);
           break;
        
       case 3:
           System.out.println("Please Enter the Value of x");
           x=sc.nextFloat();
           System.out.println("Enter the Value of y");
           y=sc.nextFloat();
           mul=x*y;
           System.out.println("Multiplication of Two Number is:"+" "+mul);
           break;
           
       case 4:
           System.out.println("Please Enter the Value of x");
           x=sc.nextFloat();
           System.out.println("Enter the Value of y");
           y=sc.nextFloat();
          div=x/y;
           System.out.println("Division of Two Number is:"+" "+div);
           break;
           
       case 5:
           System.out.println("Enter the No.for which you want to Calculate Square");
           n=sc.nextFloat();
           Square=n*n;
           System.out.println("Square of that no. is :"+ " "+Square);
           break;
           
       case 6:
           System.out.println("Enter the No.for which want to Cube");
           n=sc.nextFloat();
           Cube=n*n*n;
           System.out.println("Cube pf that no. is:"+" "+Cube);
           break;
           
       case 7:
           System.out.println("Enter the No. for Square Root");
           n=sc.nextFloat();
           SqRoot=(float) sqrt(n);
           System.out.println("SquareRoot of that no. is:"+" "+SqRoot);
           break;
           
       case 8:
           System.out.println("Enter the no. for Cube Root");
           n=sc.nextFloat();
           CubRoot=(float) cbrt(n);
           System.out.println("CubeRoot Of that no.is:"+" "+CubRoot);
           break;
      
       case 9:
           System.out.println("Please Enter the side 1");
           l=sc.nextFloat();
           System.out.println("Please Enter the side 2");
           b=sc.nextFloat();
           System.out.println("Please Enter the Side 3");
           h=sc.nextFloat();
           Perimeter=l+b+h;
           System.out.println("Perimeter of Triangle is **Sum of all Sides**:"+" "+Perimeter);
           break;           
           
       case 10:
           System.out.println("Please Enter the base of triangle");
           b=sc.nextFloat();
           System.out.println("Please Enter the hight of triangle");
           h=sc.nextFloat();
           AreaT=(b*h)/2;
           System.out.println("Area Of Traingle is:"+AreaT);
           break;
       case 11:
           System.out.println("Enter the length of rectangle");
           l=sc.nextFloat();
           System.out.println("Enter the width of Rectangle");
           b=sc.nextFloat();
           Perimeter=(2*(l+b));
           System.out.println("Perimeter of Rectangle is:"+Perimeter);
           break;
       case 12:
           System.out.println("Enter the length of Rectangle");
           l=sc.nextFloat();
           System.out.println("Eneter the width of Rectangle");
           b=sc.nextFloat();
           AreaR=l*b;
           System.out.println("Area Of Rectangle is:"+" "+AreaR);
           break;
          
       case 13:
           System.out.println("Enter the Side of Square");
           s=sc.nextFloat();
           Perimeter=4*s;
           System.out.println("Perimeter of Square is:"+" "+Perimeter);
           break;
           
       case 14:
           System.out.println("Enter the side of Square");
           s=sc.nextFloat();
           AreaS=s*s;
           System.out.println("Area Of Square is:"+" "+AreaS);
           break;
           
       case 15:
           System.out.println("Enter the Base length of Right Angled Triangle");
           b=sc.nextFloat();
           System.out.println("Enter the Perpendicular length of Right Angled Triangle");
           p=sc.nextFloat();
           h=(int) sqrt((p*p)+(b*b));
           System.out.println("Hypotaneous is "+" "+h);
           break;
        
       case 16:
           System.out.println("Enter the length of  Hypotaneuos of Triangle");
           h=sc.nextFloat();
           System.out.println("Enter the length of Base of Traiangle ");
           b=sc.nextFloat();
           p=(int) sqrt((h*h)-(b*b));
           System.out.println("Perpendicular is:"+" "+p);
           break;
       
       case 17:
           System.out.println("Enter the length of  Hypotaneuos of Triangle");
           h=sc.nextFloat();
           System.out.println("Enter the length of Perpendicular of Traiangle ");
           p=sc.nextFloat();
           b=(float)sqrt((h*h)-(p*p));
           System.out.println("Base of triangle is:"+" "+b);
           break;
           
       case 18:
           System.out.println("Enter the side of cube");
           n=sc.nextFloat();
           Cube=6*n*n;
           System.out.println("Curved Surface area of Cube Is:"+" "+Cube);
           break;
           
       case 19:
           System.out.println("Enter the Side of Cube");
           n=sc.nextFloat();
           Cube=6*n*n;
           System.out.println("Total surface area of Cube is:"+" "+Cube);
           break;
           
       case 20:
           System.out.println("Enter the Side of Cube");
           n=sc.nextFloat();
           Volume=n*n*n;
           System.out.println("Volume of Cube is:"+" "+Volume);
           break;
           
       case 21:
           System.out.println("Enter the length of cuboid");
           l=sc.nextFloat();
           System.out.println("Enter the width of cuboid");
           b=sc.nextFloat();
           System.out.println("Enter the hight of cuboid");
           h=sc.nextFloat();
           Cuboid=(2*(l+b)*h);
           System.out.println("Curved Surfece Area Of Cuboid is:"+" "+Cuboid);
           break;
           
       case 22:
           System.out.println("Enter the length of cuboid");
           l=sc.nextFloat();
           System.out.println("Enter the width of cuboid");
           b=sc.nextFloat();
           System.out.println("Enter the hight of cuboid");
           h=sc.nextFloat();
           Cuboid=(2*(l*b)+(b*h)+(l*h));
           System.out.println("Curved Surfece Area Of Cuboid is:"+" "+Cuboid);
           break;
           
       case 23:
           System.out.println("Enter the length of Cuboid");
           l=sc.nextFloat();
           System.out.println("Enter the width of Cuboid");
           b=sc.nextFloat();
           System.out.println("Enter the Hight of Cuboid");
           h=sc.nextFloat();
           Cuboid=l*b*h;
           System.out.println("the Volume of Cuboid is:"+" "+Cuboid);
           break;
           
       case 24:
           System.out.println("Enter the radius of Sphare");
           r=sc.nextFloat();
           Sphare=4*pi*r*r;
           System.out.println("TSA/CSA of Sphare is:"+" "+Sphare);
           break;
           
       case 25:
           System.out.println("Enter the Radius of Sphare");
           r=sc.nextFloat();
           Sphare=(4*(pi*(r*r*r)))/3;
           System.out.println("Volume of Sphare is:"+" "+Sphare);
           break;
           
       case 26:
           System.out.println("Enter the Radius of Hemisphare");
           r=sc.nextFloat();
           Sphare=3*pi*r*r;
           System.out.println("TSA of HemiSphare is:"+" "+Sphare);
           break;
           
       case 27:
           System.out.println("Enter the base Radius of Cone");
           r=sc.nextFloat();
           System.out.println("Enter the Slant hight of Cone");
           l=sc.nextFloat();
           Cone=pi*r*l;
           System.out.println("TSA of Cone is:"+" "+ Cone);
           break;
           
       case 28:
           System.out.println("Enter the Base Radius of Cone");
           r=sc.nextFloat();
           System.out.println("Enter the Hight of Circular Cone");
           h=sc.nextFloat();
           Cone=(pi*r*r*h)/3;
           System.out.println("Volume of Cone is:"+" "+Cone);
           break;
           
       case 29:
           System.out.println("Enter the base Radius of Cone");
           r=sc.nextFloat();
           System.out.println("Enter the hight of Cone");
           h=sc.nextFloat();
           l=(float)sqrt ((r*r)+(h*h));
           System.out.println("Slant hight of Cone is:"+" "+l);
           break;
           
       case 30:
           System.out.println("Enter the Degree Celceus Value");
           C=sc.nextFloat();
           F=9*(C+32)/5;
           System.out.println("Forhenhight Value is:"+" "+F);System.out.println();
           break;
           
       case 31:
           System.out.println("Enter the Forenhight value ");
           F=sc.nextFloat();
           C=(float) ((F-32)/1.8);
           System.out.println("Degree Celcius value is:"+" "+C);
           break;
           
       case 32:
           System.out.println("Enter the value of n");
           n=sc.nextFloat();
           for(i=1;i<=n;i++)
           {
               fact=fact*i;
           }
           System.out.println("Factorial of that no. is :"+" "+fact);
           break;
        
       case 33:
           
            System.out.println("Please Enter a valid Input");
            System.exit(0);
            
       }
   }
}
   
          