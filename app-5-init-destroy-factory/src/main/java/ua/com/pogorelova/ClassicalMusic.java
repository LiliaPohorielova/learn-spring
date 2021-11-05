package ua.com.pogorelova;

public class ClassicalMusic implements Music {
    //запрещаем создавать объект через new
    //подписываем контракт на использование только фабричного метода
    private ClassicalMusic(){

    }

    public static ClassicalMusic getClassicalMusic() {
        System.out.println("new ClassicalMusic");
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Betkhoven";
    }

    public void doMyInit() {
        System.out.println("Initializing of Bean");
    }

    public void doMyDestroy() {
        System.out.println("Destroying of Bean");
    }
}
