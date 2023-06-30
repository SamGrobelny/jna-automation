package org.example.interfaces;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.Guid;
import com.sun.jna.ptr.PointerByReference;

public interface IUIAutomation3 extends IUIAutomation2{

    Guid.IID IID = new Guid.IID("{73D768DA-9B51-4B89-936E-C209290973E7}");

}
