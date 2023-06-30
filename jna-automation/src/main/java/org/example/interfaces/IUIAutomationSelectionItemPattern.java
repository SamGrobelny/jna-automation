package org.example.interfaces;

import com.sun.jna.platform.win32.COM.IUnknown;
import com.sun.jna.platform.win32.Guid;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;

public interface IUIAutomationSelectionItemPattern extends IUnknown {
    Guid.IID IID = new Guid.IID("{A8EFA66A-0FDA-421A-9194-38021F3578EA}");

    int select();
    int getCurrentIsSelected(IntByReference ibr);
    int addToSelection();
    int removeFromSelection();
    int getCurrentSelectionContainer(PointerByReference pbr);
}
