package org.example.interfaces;

import com.sun.jna.platform.win32.COM.IUnknown;
import com.sun.jna.platform.win32.Guid;

public interface IUIAutomationScrollItemPattern  extends IUnknown {
    Guid.IID IID = new Guid.IID(
            "{B488300F-D015-4F19-9C29-BB595E3645EF}");

    int scrollIntoView();
}
