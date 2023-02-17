package basic;

import java.math.BigInteger;
import java.util.concurrent.ThreadLocalRandom;


public class basic {
    public static double random_number() {
        int min=0;
        int max=101;
        double num = Math.floor(Math.random() *(max - min + 1) + min);
        return num;
    };
    
    public static void main(String[] args){
        int num = random_number() > random_number()? 10 : 8;
        System.out.println(num+" and "+ThreadLocalRandom.current().nextInt());
        BigInteger reallyBig = new BigInteger("1234567890123456890");
        BigInteger notSoBig = new BigInteger("2743561234");
        reallyBig = reallyBig.add(notSoBig);
        System.out.println(reallyBig);
        classesI objetoI = new classesI("Tony",12,true);
        objetoI.name = "Gay";
        System.out.println(objetoI.apelido);
        System.out.println(objetoI.quadratic(7));
        objetoI.setPasword("senhaforte123");
        System.out.println(objetoI.getPassword());
    }
}
