package Interface;

public class Software extends FrontEnd implements BackEnd,Database{     //class after database,backend
    @Override
    public void devlopServerApplication(String language) {
        System.out.println("Devlopimg server Application Through : "+language);
    }

    @Override
    public void createDatabase(String vender) {
        System.out.println("Create databse using : "+vender);
    }
}
