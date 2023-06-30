package org.example.interfaces;

import com.sun.jna.platform.win32.COM.IUnknown;
import com.sun.jna.platform.win32.Guid;
import com.sun.jna.ptr.IntByReference;

public interface IUIAutomationGridItemPattern extends IUnknown {
    Guid.IID IID = new Guid.IID("{78F8EF57-66C3-4E09-BD7C-E79B2004894D}");

    int getCurrentRow(IntByReference retVal);
    int getCurrentColumn(IntByReference retVal);
    int getRowSpan(IntByReference retVal);
    int getColumnSpan(IntByReference retVal);
}
