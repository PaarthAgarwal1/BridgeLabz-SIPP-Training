import java.util.*;

class Stage{
    String stageName;
    Stage next;
    Stage(String s){
        this.stageName=s;
        this.next=null;
    }
}
class Package{
    Stage head;
    void addStage(String stage){
        if(head==null){
            head=new Stage(stage);
        }else{
            Stage temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new Stage(stage);
        }
    }
    void addCheckPoint(String after,String checkPoint){
        Stage temp=head;
        while(temp!=null&&!temp.stageName.equals(after)){
            temp=temp.next;
        }
        if(temp!=null){
            Stage newCheckPoint=new Stage(checkPoint);
            newCheckPoint.next=temp.next;
            temp.next=newCheckPoint;
        }
    }
    void forwardTracking(){
        Stage temp=head;
        while (temp!=null) {
            System.out.print(temp.stageName);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
    boolean isDeliverd(){
        Stage temp=head;
        while (temp!=null){
            if(temp.stageName.equalsIgnoreCase("deliverd")){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
}
public class package_tracker {
    public static void main(String args[]){
        Package p1=new Package();
        p1.addStage("Packed");
        p1.addStage("Shipped");
        p1.addCheckPoint("Packed","Reached WareHouse");
        p1.addStage("In transit");
        p1.addStage("Deliverd");
        p1.forwardTracking();
        if(p1.isDeliverd()){
            System.out.println("Package delivered successfully");
        }else {
            System.out.println("Package Lost!!");
        }

    }

}





