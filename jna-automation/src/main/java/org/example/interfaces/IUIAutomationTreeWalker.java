package org.example.interfaces;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.COM.IUnknown;
import com.sun.jna.platform.win32.Guid;
import com.sun.jna.ptr.PointerByReference;

public interface IUIAutomationTreeWalker extends IUnknown {
    Guid.IID IID = new Guid.IID(
            "{4042C624-389C-4AFC-A630-9DF854A541FC}");

    int getParentElement(Pointer element, PointerByReference parent);

    int getFirstChildElement(Pointer element, PointerByReference first);

    int getLastChildElement(Pointer element, PointerByReference last);

    int getNextSiblingElement(Pointer element, PointerByReference next);

    int getPreviousSiblingElement(Pointer element, PointerByReference previous);

    int getCondition(PointerByReference condition);
}
