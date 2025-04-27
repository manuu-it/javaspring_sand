package models;

interface Walkable {
    void walk();
}

class Human implements Walkable {
    @Override
    public void walk() {
        System.out.println("人間が二足歩行で歩きます");
    }
}

class Robot implements Walkable {
    @Override
    public void walk() {
        System.out.println("ロボットがタイヤで移動します");
    }
}

public class prac_IF2 {
    public static void main(String[] args) {
    	Walkable walker1 = new Human(); // インターフェース型の変数で Human のインスタンスを参照
        Walkable walker2 = new Robot(); // インターフェース型の変数で Robot のインスタンスを参照

        walker1.walk(); // "人間が二足歩行で歩きます" と出力 (Humanクラスの walk() が実行される)
        walker2.walk(); // "ロボットがタイヤで移動します" と出力 (Robotクラスの walk() が実行される)
    }
    
    
    
    //インスタンス時の型定義の例（継承元のIF、クラスであれば問題ない）
    interface MyInterface {}
    class ParentClass implements MyInterface {}
    class ChildClass extends ParentClass {}
    MyInterface obj = new ChildClass(); // OK (ChildClass は ParentClass を継承しており、ParentClass は MyInterface を実装しているため)
}


