package org.example.interfaces;

import com.sun.jna.platform.win32.COM.IUnknown;
import com.sun.jna.platform.win32.Guid;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;


public interface IUIAutomationElementArray extends IUnknown {

    Guid.IID IID = new Guid.IID(
            "{14314595-B4BC-4055-95F2-58F2E42C9855}");

    int getLength(IntByReference length); // 3
    int getElement(int index, PointerByReference element); // 4
}