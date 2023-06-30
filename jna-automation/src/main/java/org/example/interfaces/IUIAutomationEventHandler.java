package org.example.interfaces;

import com.sun.jna.Function;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.COM.IUnknown;
import com.sun.jna.platform.win32.Guid;
import com.sun.jna.platform.win32.WinNT;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;

public interface IUIAutomationEventHandler extends IUnknown {

    Guid.IID IID = new Guid.IID(
            "{146C3C17-F12E-4E22-8C27-F894B9B79C69}");

    int handleAutomationEvent(PointerByReference sender, IntByReference event);


}
