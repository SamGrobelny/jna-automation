package org.example.interfaces;

import com.sun.jna.platform.win32.Guid;

public interface IUIAutomationBoolCondition extends IUIAutomationCondition{
    Guid.IID IID = new Guid.IID("1B4E1F2E-75EB-4D0B-8952-5A69988E2307");


    int getBooleanValue(Integer boolVal);
}
