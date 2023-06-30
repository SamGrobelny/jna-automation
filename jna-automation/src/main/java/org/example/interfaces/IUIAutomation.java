package org.example.interfaces;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.COM.IUnknown;
import com.sun.jna.platform.win32.Guid;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.Variant;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;

public interface IUIAutomation extends IUnknown {

    Guid.IID IID = new Guid.IID("{30CBE57D-D9D0-452A-AB13-7AC5AC4825EE}");

    Guid.GUID CLSID = new Guid.GUID("{FF48DBA4-60EF-4201-AA87-54103EEF594E}");

    int getRootElement(PointerByReference root);


    int getElementFromHandle(WinDef.HWND hwnd, PointerByReference element);


    int createAndCondition(Pointer condition1, Pointer condition2,
                           PointerByReference condition);


    int createPropertyCondition(int propertyId,
                                Variant.VARIANT.ByValue value,
                                PointerByReference condition);


    int createOrCondition(Pointer condition1, Pointer condition2,
                          PointerByReference condition);


    int createTrueCondition(PointerByReference condition);


    int createFalseCondition(PointerByReference condition);


    int compareElements(Pointer element1,
                        Pointer element2,
                        IntByReference same);


    int createNotCondition(Pointer condition, PointerByReference retval);


    int getPatternProgrammaticName(int patternId, PointerByReference retval);


    int getFocusedElement(PointerByReference element);


    int createTreeWalker(PointerByReference condition,
                         PointerByReference walker);


    int getControlViewWalker(PointerByReference walker);


    int addAutomationEventHandler(IntByReference eventId,
                                  TreeScope scope,
                                  Pointer element,
                                  PointerByReference cacheRequest,
                                  PointerByReference handler);


    int removeAutomationEventHandler(IntByReference eventId,
                                     PointerByReference element,
                                     PointerByReference handler);


    int elementFromPoint(WinDef.POINT pt, PointerByReference element);


    int createCacheRequest(PointerByReference request);


    int pollForPotentialSupportedProperties(Pointer element,
                                            PointerByReference ids,
                                            PointerByReference names);


    int pollForPotentialSupportedPatterns(Pointer element,
                                          PointerByReference ids,
                                          PointerByReference names);
}
