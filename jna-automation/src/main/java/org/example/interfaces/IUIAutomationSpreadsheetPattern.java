package org.example.interfaces;

import com.sun.jna.platform.win32.COM.IUnknown;
import com.sun.jna.platform.win32.Guid;
import com.sun.jna.ptr.PointerByReference;

public interface IUIAutomationSpreadsheetPattern extends IUnknown {
    Guid.IID IID = new Guid.IID("{7517A7C8-FAAE-4DE9-9F08-29B91E8595C1}");

    int getItemByNameA(PointerByReference name, PointerByReference retVal);
}
