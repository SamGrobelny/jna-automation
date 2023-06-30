package org.example.interfaces;

import com.sun.jna.platform.win32.COM.IUnknown;
import com.sun.jna.platform.win32.Guid;
import com.sun.jna.ptr.IntByReference;

public interface IUIAutomationExpandCollapsePattern extends IUnknown {
    Guid.IID IID = new Guid.IID(
            "{619BE086-1F4E-4EE4-BAFA-210128738730}");

    int expand();
    int collapse();
    int getCurrentExpandCollapseState(IntByReference retVal);
}
