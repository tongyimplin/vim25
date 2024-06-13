package com.vmware.vim25;

import com.vmware.vim25.ArrayOfGuestStackInfo;
import com.vmware.vim25.GuestStackInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGuestStackInfo", propOrder = {"guestStackInfo"})
public class ArrayOfGuestStackInfo {
  @XmlElement(name = "GuestStackInfo")
  protected List<GuestStackInfo> guestStackInfo;
  
  public List<GuestStackInfo> getGuestStackInfo() {
    if (this.guestStackInfo == null)
      this.guestStackInfo = new ArrayList<>(); 
    return this.guestStackInfo;
  }
}
