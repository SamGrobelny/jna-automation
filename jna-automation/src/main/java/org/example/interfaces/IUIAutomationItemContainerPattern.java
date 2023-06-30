package org.example.interfaces;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.COM.IUnknown;
import com.sun.jna.platform.win32.Guid;
import com.sun.jna.platform.win32.Variant;
import com.sun.jna.ptr.PointerByReference;

public interface IUIAutomationItemContainerPattern extends IUnknown {
    Guid.IID IID = new Guid.IID(
            "{C690FDB2-27A8-423C-812D-429773C9084E}");

    int findItemByProperty(Pointer startAfter, int propertyId, Variant.VARIANT.ByValue value, PointerByReference found);
}
