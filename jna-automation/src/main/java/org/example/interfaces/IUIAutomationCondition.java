package org.example.interfaces;

import com.sun.jna.platform.win32.COM.IUnknown;
import com.sun.jna.platform.win32.Guid;

public interface IUIAutomationCondition extends IUnknown {
    Guid.IID IID = new Guid.IID("352FFBA8-0973-437C-A61F-F64CAFD81DF9");
}
