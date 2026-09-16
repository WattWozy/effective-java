package systemDesign.loadbalancer;

public class Demo {

    public static void main(String[] args){


        AppInstance firstInstance = new AppInstance("Instance A");
        AppInstance secondInstance = new AppInstance("Instance B");
        AppInstance thirdInstance = new AppInstance("Instance C");


        //round robin, no instance failure expected
        Balancer basicLB = new Balancer();
        basicLB.addInstance(firstInstance);
        basicLB.addInstance(secondInstance);
        basicLB.addInstance(thirdInstance);

        basicLB.send("hello");
        basicLB.send("howdy?");
        basicLB.send("wassup?");

        //health priority, instance failure expected
        TolerantBalancer tlb = new TolerantBalancer();
        tlb.addInstance(firstInstance);
        tlb.addInstance(secondInstance);
        tlb.addInstance(thirdInstance);

        for(int i=0; i<50; i++){
            tlb.send("hello");
            tlb.send("howdy?");
            tlb.send("wassup?");
        }

    }

}