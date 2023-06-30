package org.example.interfaces;

import com.sun.jna.platform.win32.COM.IUnknown;
import com.sun.jna.platform.win32.Guid;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;

public interface IUIAutomationTablePattern extends IUnknown {
    Guid.IID IID = new Guid.IID("{620E691C-EA96-4710-A850-754B24CE2417}");

    int getCurrentRowHeaders(PointerByReference retVal);
    int getCurrentColumnHeaders(PointerByReference retVal);
    int getCurrentRowOrColumnMajor(IntByReference retVal);
}
