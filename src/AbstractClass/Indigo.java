package AbstractClass;

public class Indigo extends FlightService{
    double[] cost={2500,4000,8000};
    @Override
    void BookTiket(int qty, int route) {
        boolean status =false;
        for(int i=0;i<routes.length;i++){
            if(route==i){
                double total=cost[i]*qty;
                System.out.println("Total Amout is: "+total);
                status=true;
            }
        }
        if (status=false){
            System.out.println("Invalid Choice: ");
        }
    }
}
