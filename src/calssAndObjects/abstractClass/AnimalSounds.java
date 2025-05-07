package calssAndObjects.abstractClass;

abstract class  SoundAbs{
    abstract   void SoundAnimals(String s);
    void animalVoice (){
        System.out.println("...................");
    }
}

class  dogAbsSound extends  SoundAbs{
    void SoundAnimals(String s){
        System.out.println("Dog sound name is "+ s);
    }
}

class  catAbsSound extends SoundAbs{
    void SoundAnimals(String s){
        System.out.println("Cat sound name is "+ s);
    }
}

public class AnimalSounds {
    public static void main(String[] args) {

        SoundAbs obj = new dogAbsSound();
        obj.SoundAnimals("BARK");
        obj.animalVoice();

        SoundAbs obj1 = new catAbsSound();
        obj1.SoundAnimals("Meows");
        obj1.animalVoice();

    }
}
