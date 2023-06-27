package SingletonPettern;

public class SingleMain {
    
    public static void main(String[] args) {
        SinglePattern sn;

        sn = SinglePattern.getInstance();
        
        sn.TestFun();
    }
}
