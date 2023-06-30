package org.example.interfaces;

import com.sun.jna.platform.win32.COM.IUnknown;
import com.sun.jna.platform.win32.Guid;
import com.sun.jna.ptr.PointerByReference;

public interface IUIAutomationCacheRequest extends IUnknown {
    Guid.IID IID = new Guid.IID("B32A92B5-BC25-4078-9C08-D7EE95C48E03");


    int addPattern(int inVal);


    int addProperty(int inVal);


    int clone(PointerByReference retVal);


    int getTreeScope(PointerByReference inVal);


    int setTreeScope(PointerByReference retVal);


    int getTreeFilter(PointerByReference inVal);


    int setTreeFilter(PointerByReference retVal);


    int getAutomationElementMode(PointerByReference mode);


    int setAutomationElementMode(PointerByReference mode);
}
