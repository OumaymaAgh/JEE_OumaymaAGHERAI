package presentation;

import dao.Idao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws Exception{
         /*
        l'injection de dépendances par
        instanciation dynamique
        */
        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassName =scanner.nextLine();
        Class cDao = Class.forName(daoClassName) ;
        Idao dao = (Idao) cDao.newInstance() ;

        String metierClassName = scanner.nextLine() ;
        Class cMetier = Class.forName(metierClassName) ;
        IMetier metier = (IMetier) cMetier.newInstance() ;

        Method method = cMetier.getMethod("setDao",Idao.class) ;
        method.invoke(metier,dao) ; // execution de metier.setDao(dao)
        System.out.println(metier.calcul());


    }
}
