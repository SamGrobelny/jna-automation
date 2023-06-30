package org.example.interfaces;

import com.sun.jna.platform.win32.COM.IUnknown;
import com.sun.jna.platform.win32.Guid;
import com.sun.jna.ptr.PointerByReference;

public interface IUIAutomationTextPattern extends IUnknown {
    Guid.IID IID = new Guid.IID("{32EBA289-3583-42C9-9C59-3B6D9A1E9B6A}");

    int getSelection(PointerByReference result);
    int getVisibleRanges(PointerByReference ranges);
    int getDocumentRange(PointerByReference range);
}
