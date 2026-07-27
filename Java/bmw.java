class bmw{
    String model;
    int year;
    String color;
    String fuelType;
    int mileage;    
    String gearType;
    void displayDetails(){
        System.out.println("Car Model: "+model);
        System.out.println("Year: "+year);
        System.out.println("Color: "+color);
        System.out.println("Fuel Type: "+fuelType);
        System.out.println("Mileage: "+mileage+" km/l");
        System.out.println("Gear Type: "+gearType);
        System.out.println();
    }
}
class visionBMWAlpina extends bmw{
    visionBMWAlpina(String model,int year,String color,String fuelType,int mileage,String gearType){
        this.model=model;
        this.year=year;
        this.color=color;
        this.fuelType=fuelType;
        this.mileage=mileage;
        this.gearType=gearType;
    }
}
class NeueKlasseBMW extends bmw{
    NeueKlasseBMW(String model,int year,String color,String fuelType,int mileage,String gearType){
        this.model=model;
        this.year=year;
        this.color=color;
        this.fuelType=fuelType;
        this.mileage=mileage;
        this.gearType=gearType;
    }
}
class LWb extends bmw{
    LWb(String model,int year,String color,String fuelType,int mileage,String gearType){
        this.model=model;
        this.year=year;
        this.color=color;
        this.fuelType=fuelType;
        this.mileage=mileage;
        this.gearType=gearType;
    }
}
class bmwDemo{
    public static void main(String args[]){
        visionBMWAlpina v1=new visionBMWAlpina("Vision BMW Alpina",2023,"Black","Petrol",15,"Automatic");
        v1.displayDetails();
        NeueKlasseBMW n1=new NeueKlasseBMW("Neue Klasse BMW",2023,"White","Diesel",20,"Manual");
        n1.displayDetails();
        LWb l1=new LWb("LWb",2023,"Red","Hybrid",25,"Automatic");
        l1.displayDetails();
    }
}