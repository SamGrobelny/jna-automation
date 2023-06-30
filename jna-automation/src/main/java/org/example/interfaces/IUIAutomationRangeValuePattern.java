package org.example.interfaces;

import com.sun.jna.platform.win32.COM.IUnknown;
import com.sun.jna.platform.win32.Guid;
import com.sun.jna.ptr.DoubleByReference;
import com.sun.jna.ptr.IntByReference;

public interface IUIAutomationRangeValuePattern extends IUnknown {
    Guid.IID IID = new Guid.IID(
            "{59213F4F-7346-49E5-B120-80555987A148}");


    int setValue(Double val);


    int getValue(DoubleByReference retVal);


    int getIsReadOnly(IntByReference retVal);

//    TODO
}
