package LW_03;
class Owner{
    private String ownerName;
    private String phoneNo;
    public Owner(String ownerName,String phoneNo){
        this.ownerName = ownerName;
        this.phoneNo = phoneNo;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
    public String getPhoneNo(){
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }

}
class Bicycle{
    private Owner owner;
    public Bicycle(Owner owner){
        this.owner = owner;
    }
    public Owner getOwner(){
        return owner;
    }
    public void setOwner(Owner owner){
        this.owner = owner;
    }
}

public class Q_03 {
    public static void main(String[] args) {
        Owner owner = new Owner("Vidya","0778362679");
        Bicycle bicycle = new Bicycle(owner);
        System.out.println(bicycle.getOwner().getOwnerName());
        System.out.println(bicycle.getOwner().getPhoneNo());
    }
}
