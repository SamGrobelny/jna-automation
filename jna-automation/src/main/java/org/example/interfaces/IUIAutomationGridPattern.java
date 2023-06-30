package org.example.interfaces;

import com.sun.jna.platform.win32.Guid;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;

public interface IUIAutomationGridPattern {
    Guid.IID IID = new Guid.IID("{414C3CDC-856B-4F5B-8538-3131C6302550}");

    int getItem(int row, int column, PointerByReference item);
    int getCurrentRowCount(IntByReference retVal);
    int getCurrentColumnCount(IntByReference retVal);
}
