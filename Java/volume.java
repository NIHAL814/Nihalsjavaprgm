class box{
    double w,h,d;
    void volume(){
        System.out.println("Volume of box:");
        System.out.println(w*h*d);
    }
}
class demobox{
    public static void main(String[] args) {
        box b=new box();
        b.w=10;
        b.h=20;
        b.d=30;
        b.volume();
    }
}