package org.example.interfaces;

import com.sun.jna.platform.win32.COM.IUnknown;
import com.sun.jna.platform.win32.Guid;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;

public interface IUIAutomationStylesPattern extends IUnknown {
    Guid.IID IID = new Guid.IID("{85B5F0A2-BD79-484A-AD2B-388C9838D5FB}");

    int getCurrentStyleId(IntByReference retVal);
    int getCurrentStyleName(PointerByReference retVal);
}
