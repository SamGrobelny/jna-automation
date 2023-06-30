package org.example.interfaces;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Collections;
import java.util.List;

public class TreeScope extends Structure {
    public static class ByReference
            extends TreeScope
            implements Structure.ByReference {
    }

    public int value;

    public int getValue() {
        return this.value;
    }

    public TreeScope(){

    }

    public TreeScope(final Pointer pointer) {
        super(pointer);
        this.read();
    }

    public static final int NONE = 0;

    public static final int ELEMENT  = 1;

    public static final int CHILDREN = 2;

    public static final int DESCENDANT = 4;

    public static final int PARENT = 8;

    public static final int SUBTREE = 7;

    public static final int ANCESTOR = 16;

    @Override
    protected List<String> getFieldOrder(){
        return Collections.singletonList("value");
    }
}
