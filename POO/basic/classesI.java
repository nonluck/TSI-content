package basic;

public class classesI {
    String name;
    String apelido;
    int age;
    boolean alive;
    private String password;
    public void setPasword(String x){
        password = x;
    }

    public String getPassword(){
        return password;
    }

    public  classesI(String x, int y, boolean z){
        apelido = x;
        age = y;
        alive = z;
    }
    void mensagem(int i){
        switch (i){
            case 1:
                System.out.println("it's prime");
                break;
            case 0:
                System.out.println("it's pair");
            }
            
        };
    public int quadratic(int num){
        if (num%2 == 0){
            mensagem(0);
        }else{
            mensagem(1);
        }
        return num * num;
    };
}
