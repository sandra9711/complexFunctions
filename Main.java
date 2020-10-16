
class complex{
   int r;
   int i;
   public complex(){

   }
   public complex(int real,int imag){
     r=real;
     i=imag;

   }
   public complex add(complex z1,complex z2){
        complex c=new complex();
        c.r=z1.r+z2.r;
        c.i=z1.i+z2.i;
        return c;
   }
   public complex sub(complex z1,complex z2){
        complex c=new complex();
        c.r=z1.r-z2.r;
        c.i=z1.i-z2.i;
        return c;
   }
   public complex mul(complex z1,complex z2){
        complex c=new complex();
        c.r=(z1.r*z2.r)+(-1*(z1.i+z2.i));
        c.i=(z1.i*z2.r)+(z2.i*z1.r);
        return c;
   }
   public float mag(complex z){
    
     float m;
     m=(z.i*z.i)+(z.r*z.r);
     return m;
   }
   public complex conjugate(complex z){
       complex c=new complex();
       c.r=z.r;
       c.i=-1*(z.i);
       return c;
   }
   void prnt(){
      System.out.println(r+"+"+i+"i");
   }
}




class Main {
  public static void main(String[] args) {
     complex z1= new complex(2,3);
     complex z2= new complex(1,4);
     complex c1=new complex();
     z1.prnt();
     z2.prnt();
     c1=c1.add(z1,z2);
     System.out.print("Sum=");
     c1.prnt();
     c1=c1.sub(z1,z2);
     System.out.print("Diff=");
     c1.prnt();
     c1=c1.mul(z1,z2);
     System.out.print("Product=");
     c1.prnt();
     c1=c1.conjugate(z1);
     
     System.out.print("conjugate of z1=");
     c1.prnt();
     c1=c1.conjugate(z2);
     
     System.out.print("conjugate of z2=");
     c1.prnt();
     float m1;
     m1=z1.mag(z1);
     System.out.println("magnitude of z1="+m1);
     float m2;
     m2=z2.mag(z2);
     
     System.out.print("magnitude of z2="+m2);
     
  }
}