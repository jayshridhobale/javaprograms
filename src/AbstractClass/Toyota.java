package AbstractClass;

public class Toyota extends Car{

    double cost[] = {3000, 4000};
    void bookService(int model, int serviceType) {
        boolean status = false;
        for (int i=0; i<models.length; i++) {
            if (model==i) {
                for (int j=0; j<services.length; j++) {
                    if (serviceType==j) {
                        System.out.println("Is is a Free Service:");
                        break;
                    }
                    else {
                        double paidService = cost[i];
                        System.out.println("Paid Service:" + paidService);
                        break;
                    }
                }
            }
            status=true;
        }
        if (status==false) {
            System.out.println("Invalid Choice");
        }
    }
}
