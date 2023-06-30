package org.example.interfaces;

import com.sun.jna.platform.win32.COM.IUnknown;
import com.sun.jna.platform.win32.Guid;
import com.sun.jna.ptr.PointerByReference;

public interface IUIAutomationTextRange extends IUnknown {
//    TODO
    Guid.IID IID = new Guid.IID("{A543CC6A-F4AE-494B-8239-C814481187A8}");

    int select();
    int getText(Integer maxLength, PointerByReference sr);
}
