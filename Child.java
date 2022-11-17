class GrandParent{
    String grandFatherName;
    String grandMotherName;
    GrandParent(String grandFatherName,String grandMotherName){
        System.out.println("the name of grandparents are: "+grandFatherName+" and "+grandMotherName);
    }
}
class Parent{

    String fatherName;
    String motherName;
    Parent(String fatherName,String motherName,String grandFatherName,String grandMotherName ){
        this(grandFatherName,grandMotherName);
        this.fatherName=fatherName;
        this.motherName=motherName;
        System.out.println("father name is "+fatherName);
        System.out.println("mother name is "+motherName);
    }
    Parent(){

    }

    public Parent(String fatherName, String motherName) {
        System.out.println("father name is "+fatherName);
        System.out.println("mother name is "+motherName);
    }
}

public class Child extends Parent {
    Child(String fatherName, String motherName, String grandFatherName, String grandMotherName) {
        super();

        System.out.println("father is "+fatherName);
        System.out.println("mother is "+motherName);
        System.out.println("grandfather is "+grandFatherName);
        System.out.println("grand mother is "+grandMotherName);
    }

    public static void main(String[] args) {
        Child c = new Child("vijay","hema","digvijay","rekha");
        System.out.println("***********************************");
        Parent p=new Parent("Vijay","Hema");
        System.out.println("***********************************");
        GrandParent g=new GrandParent("digvijay","rekha");

    }
}