package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.UsbScanCodeSpecKeyEvent;
import com.vmware.vim25.UsbScanCodeSpecModifierType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsbScanCodeSpecKeyEvent", propOrder = {"usbHidCode", "modifiers"})
public class UsbScanCodeSpecKeyEvent extends DynamicData {
  protected int usbHidCode;
  
  protected UsbScanCodeSpecModifierType modifiers;
  
  public int getUsbHidCode() {
    return this.usbHidCode;
  }
  
  public void setUsbHidCode(int paramInt) {
    this.usbHidCode = paramInt;
  }
  
  public UsbScanCodeSpecModifierType getModifiers() {
    return this.modifiers;
  }
  
  public void setModifiers(UsbScanCodeSpecModifierType paramUsbScanCodeSpecModifierType) {
    this.modifiers = paramUsbScanCodeSpecModifierType;
  }
}
