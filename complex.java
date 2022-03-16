public class Complex{
public double real;
public double imag;
public String output = " ";

public Complex(double real, double imag){
this.real += real;
this.imag += imag;
}

public Complex(){
real = 0;
imag = 0;
}

public double getreal(){
return real;
}
public void setreal(double real){
this.real = real;
}

public double getimag(){
return imag;
}

public void setimag(double imag){
this.imag = imag;
}

public void add(Complex num){
this.real = real + num.real;
this.imag = imag + num.imag;
}

public void subtract(Complex num){
this.real = real - num.real;
this.imag = imag - num.imag;
}


public static void main(String[] args){
Complex c1 = new Complex(4.0 , 8.5);
Complex c2 = new Complex(8.0 , 4.5);
c1.add(c2);
System.out.println("The sum is = " + c1.getreal() + "+" + c1.getimag() + "i.");
c1.subtract(c2);
c1.subtract(c2);
System.out.println("The subtraction is = " + c1.getreal() + "+" + c1.getimag() + "i.");
}
}