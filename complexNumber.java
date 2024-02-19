class complexNumber{
    
    double real;
    double img;
    void addComplexNo(complexNumber c1 , complexNumber c2)
    {
        complexNumber c3=new complexNumber();
        c3.real=c1.real + c2.real;
        c3.img =c1.img + c2.img;
        System.out.println("Sum of two complex no.="+c3.real+"+("+c3.img+")i");
    }
    void multiComplexNo(complexNumber c1 , complexNumber c2)
    {
        complexNumber c3=new complexNumber();
        c3.real=(c1.real * c2.real) - (c1.img * c2.img); 
        c3.img=(c1.real * c2.img) + (c1.img * c2.real);
        System.out.println("Product of two complex no.="+c3.real+"+("+c3.img+")i");
    
    }
}