package com.vmware.vim25;

import com.vmware.vim25.ArrayOfUsbScanCodeSpecKeyEvent;
import com.vmware.vim25.UsbScanCodeSpecKeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUsbScanCodeSpecKeyEvent", propOrder = {"usbScanCodeSpecKeyEvent"})
public class ArrayOfUsbScanCodeSpecKeyEvent {
  @XmlElement(name = "UsbScanCodeSpecKeyEvent")
  protected List<UsbScanCodeSpecKeyEvent> usbScanCodeSpecKeyEvent;
  
  public List<UsbScanCodeSpecKeyEvent> getUsbScanCodeSpecKeyEvent() {
    if (this.usbScanCodeSpecKeyEvent == null)
      this.usbScanCodeSpecKeyEvent = new ArrayList<>(); 
    return this.usbScanCodeSpecKeyEvent;
  }
}
