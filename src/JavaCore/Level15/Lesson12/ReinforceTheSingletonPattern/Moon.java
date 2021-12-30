package JavaCore.Level15.Lesson12.ReinforceTheSingletonPattern;

public class Moon implements Planet{
    private static Moon instance;

    private Moon(){}

    public static Moon getInstance(){
        if(instance == null){
            instance = new Moon();
        }
        return instance;
    }
}
