package casestudy3;

import java.util.HashMap;
import java.util.Scanner;

class Product
{ private int id ,amount;
  private int name;  
  //getter method for name  
  public int getName(){  
  return name;  
  }  
  public int getId(){  
    return id;  
    }  
  public int getAmount(){  
    return amount;  
        }  
  //setter method for name  
  public void setName(int name){  
  this.name=name;  }
  public void setId(int id){  
    this.id=id; 
  }
  public void setAmount(int amount){  
    this.amount=amount; 
  }

}

public class Cas extends Product {
  void addproduct()
  {
    Scanner ec=new Scanner(System.in);
    System.out.println("enter product id");
    int id=ec.nextInt();
    setId(id);
    System.out.println("enter product name");
    int na=ec.nextInt();
    setName(na);
    System.out.println("enter product amount");
    int am=ec.nextInt();
    setAmount(am);

  }
  public String toString() {
		return "id"+getId()+"name"+getName()+"amount"+getAmount();
	}

  
    public static void main(String[] args) {

        HashMap hs= new HashMap();
        System.out.println("Enter  1. Add Product \n  2. Update Product \n 3. Delete Product \n 4. Get Product \n 5. Getall Product \n ");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int a=1;
        while(i>0)
        {   
            switch (i) {
             case 1:
               System.out.println("Monday");
               Cas s=new Cas();
               s.addproduct();
               System.out.println("your product iid"+a);
               hs.put(1, s);
               a++;
               System.out.println("Monday");

               
               //continue;
               break;
             case 2:
             System.out.println("To update enter id of product");
             int t=sc.nextInt();
             Cas e=new Cas();
               e.addproduct();
               System.out.println("your product iid"+a);
               hs.put(t, e);
             
               System.out.println("Tuesday");
               break;
             case 3:
             System.out.println("Enter id to remove product");
             int t1=sc.nextInt();
             hs.remove(t1);
              System.out.println("Wednesday");
               break;
             case 4:
             System.out.println("To get detail enter id of product");
             int t2=sc.nextInt();
             System.out.println(hs.get(t2));
             
               System.out.println("Thursday");
               break;
             case 5:
               System.out.println("Friday");
               break;
             default:
               System.out.println("ENTER WRITE KEY");
               break; 
            }
            System.out.println("Enter 0. Go out \n 1. Add Product \n  2. Update Product \n 3. Delete Product \n 4. Get Product \n 5. Getall Product \n "); 
            i=sc.nextInt();
        }
    
    }
    
}
