package SingletonPettern;

public class SinglePattern {
    private static SinglePattern patternObj;

    private SinglePattern() {
    }
    
    public static SinglePattern getInstance() {
        if (patternObj == null) {
            patternObj = new SinglePattern();
        }
        return patternObj;
    }

    public void TestFun() {
        System.out.println("This is SingleTone Patten");
    }
}
