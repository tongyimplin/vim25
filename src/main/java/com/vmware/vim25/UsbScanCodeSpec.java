package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.UsbScanCodeSpec;
import com.vmware.vim25.UsbScanCodeSpecKeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsbScanCodeSpec", propOrder = {"keyEvents"})
public class UsbScanCodeSpec extends DynamicData {
  @XmlElement(required = true)
  protected List<UsbScanCodeSpecKeyEvent> keyEvents;
  
  public List<UsbScanCodeSpecKeyEvent> getKeyEvents() {
    if (this.keyEvents == null)
      this.keyEvents = new ArrayList<>(); 
    return this.keyEvents;
  }
}
