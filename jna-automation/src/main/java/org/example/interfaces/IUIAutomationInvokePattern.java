package org.example.interfaces;

import com.sun.jna.platform.win32.COM.IUnknown;
import com.sun.jna.platform.win32.Guid;

public interface IUIAutomationInvokePattern extends IUnknown {
    Guid.IID IID = new Guid.IID(
            "{FB377FBE-8EA6-46D5-9C73-6499642D3059}");

    int invoke();
}
