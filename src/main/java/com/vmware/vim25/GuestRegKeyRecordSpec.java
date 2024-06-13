package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.GuestRegKeyRecordSpec;
import com.vmware.vim25.GuestRegKeySpec;
import com.vmware.vim25.LocalizedMethodFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestRegKeyRecordSpec", propOrder = {"key", "fault"})
public class GuestRegKeyRecordSpec extends DynamicData {
  @XmlElement(required = true)
  protected GuestRegKeySpec key;
  
  protected LocalizedMethodFault fault;
  
  public GuestRegKeySpec getKey() {
    return this.key;
  }
  
  public void setKey(GuestRegKeySpec paramGuestRegKeySpec) {
    this.key = paramGuestRegKeySpec;
  }
  
  public LocalizedMethodFault getFault() {
    return this.fault;
  }
  
  public void setFault(LocalizedMethodFault paramLocalizedMethodFault) {
    this.fault = paramLocalizedMethodFault;
  }
}
