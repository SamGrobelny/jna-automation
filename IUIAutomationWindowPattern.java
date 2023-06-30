package org.example.interfaces;

import com.sun.jna.platform.win32.COM.IUnknown;
import com.sun.jna.platform.win32.Guid;
import com.sun.jna.ptr.IntByReference;

public interface IUIAutomationWindowPattern extends IUnknown {
    Guid.IID IID = new Guid.IID("{0FAEF453-9208-43EF-BBB2-3B485177864F}");

    int close();

    int waitForInputIdle(Integer milliseconds, IntByReference success);

    int setWindowVisualState(Integer state);

    int getCurrentCanMaximize(IntByReference retVal);

    int getCurrentCanMinimize(IntByReference retVal);

    int getCurrentIsModal(IntByReference retVal);

    int getCurrentIsTopmost(IntByReference retVal);
}
