package JavaCore.Level5.Lesson12.ReinforceTheSingletonPattern;

public class Sun implements Planet{
    private static Sun instance;

    private Sun(){}

    public static Sun getInstance(){
        if(instance == null){
            instance = new Sun();
        }
        return instance;
    }
}
