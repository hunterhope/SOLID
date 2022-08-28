package org.hunterhope.javasolid.lsp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class Father {

    void add(int x, int y) {
        System.out.println(x + y);
    }

    void foo(HashSet set) {
        System.out.println(set);
    }

    Map bar() {
        return null;
    }

    abstract void sub(int x, int y);
}

class Sun2 {

    Father father = new Father() {
        @Override
        void sub(int x, int y) {
        }
    };

    Father getFather() {
        return father;
    }
    void ad2(int x, int y){
        father.add(x, y);
    }
    void sub(int x, int y) {
        System.out.println(x - y);
    }
}

class Son extends Father {

    void foo(Set set) {//使用 overloading
        System.out.println(set);
    }

    @Override
    void sub(int x, int y) {
        System.out.println(x - y);
    }

    @Override
    HashMap bar() {
        return null;
    }
}

public class LSP {

    public static void main(String[] args) {

    }
}
