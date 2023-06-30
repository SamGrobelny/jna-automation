package org.example.interfaces;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.COM.IUnknown;
import com.sun.jna.platform.win32.Guid;
import com.sun.jna.platform.win32.Variant;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;

public interface IUIAutomationElement extends IUnknown {


    Guid.IID IID = new Guid.IID("{D22108AA-8AC5-49A5-837B-37BBB3D7591E}");


    int setFocus();


    int getCurrentName (PointerByReference sr);


    int getCurrentClassName (PointerByReference sr);


    int findAll (TreeScope scope, Pointer condition, PointerByReference sr);


    int findFirst (TreeScope scope, Pointer condition, PointerByReference sr);

    int findAllBuildCache(int scope,
                          Pointer condition,
                          Pointer cr,
                          PointerByReference sr);

    int findFirstBuildCache(int scope,
                            Pointer condition,
                            Pointer cr,
                            PointerByReference sr);

    int buildUpdatedCache (Pointer cacheRequest,
                           PointerByReference updatedElement);

    int getClickablePoint(WinDef.POINT.ByReference clickable,
                          WinDef.BOOLByReference gotClickable);

    int getCurrentIsPassword(IntByReference value);

    int getCurrentAriaRole (PointerByReference sr);

    int getCurrentPattern(Integer patternId, PointerByReference pbr);

    int getCurrentPropertyValue(int propertyId,
                                Variant.VARIANT.ByReference value);

    int getCurrentControlType(IntByReference ipr);

    int getCurrentProviderDescription(PointerByReference sr);

    int getCurrentFrameworkId (PointerByReference retVal);

    int getCurrentItemStatus (PointerByReference retVal);

    int getCurrentOrientation (IntByReference retVal);

    int getCurrentAcceleratorKey (PointerByReference retVal);

    int getCurrentProcessId (IntByReference retVal);

    int getCurrentBoundingRectangle (WinDef.RECT retVal);

    int getCurrentLocalizedControlType (PointerByReference retVal);

    int getCurrentIsOffscreen (WinDef.BOOLByReference retVal);

    int getCurrentIsEnabled (WinDef.BOOLByReference retVal);

    int getCurrentIsControlElement (WinDef.BOOLByReference retVal);

    int getCurrentIsContentElement (WinDef.BOOLByReference retVal);

    int getCurrentRuntimeId(PointerByReference runtimeId);

    int getCurrentAutomationId(PointerByReference retVal);

    int getCurrentCulture (IntByReference retVal);

    int getCachedName(PointerByReference retVal);
}
