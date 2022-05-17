package ru.ncallie;
public class ClassicalMusic implements Music{
    private ClassicalMusic() {
    }
    @Override
    public String getSong() {
        return "Mozart – \"Eine kleine Nachtmusik\"";
    }
    public static Music getClassicalMusic() {
        return new ClassicalMusic();
    }
}
