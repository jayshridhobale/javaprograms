package AbstractClass;

public class AirIndia extends FlightService{

   double[] cost={3000,5000,9000};
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
