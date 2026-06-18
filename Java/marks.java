class marks{
    double physics;
    double maths;
    double chemistry;
    marks(double phy,double math,double chem)
    {
        physics=phy;
        maths=math;
        chemistry=chem;
    }
    double total(){
        return physics+maths+chemistry;
    }
}
class studentmarks{
    public static void main(String args[]) {
            marks.std1=new marks(60,71,70);
            marks.std2=new marks(68,66,70);
    }
}
