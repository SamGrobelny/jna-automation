package org.example.interfaces;

import com.sun.jna.platform.win32.Guid;
import com.sun.jna.platform.win32.WinDef;


public interface IUIAutomation2 extends IUIAutomation {

    Guid.IID IID = new Guid.IID("{34723AFF-0C9D-49D0-9896-7AB52DF8CD8A}");


    int getAutoSetFocus(Integer AutoSetFocus);


    int setAutoSetFocus(Integer AutoSetFocus);


    int getConnectionTimeout(WinDef.DWORD timeout);


    int setConnectionTimeout(WinDef.DWORD timeout);


    int getTransactionTimeout(WinDef.DWORD timeout);


    int setTransactionTimeout(WinDef.DWORD timeout);
}
