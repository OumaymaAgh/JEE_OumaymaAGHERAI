package ext;

import dao.Idao;

public class DaoImpl2 implements Idao{

    @Override
    public double getData() {
        System.out.println("Version Capturs");
        double temp=1000 ;
        return temp ;
    }
}
