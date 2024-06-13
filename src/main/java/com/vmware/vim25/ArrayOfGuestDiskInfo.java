package com.vmware.vim25;

import com.vmware.vim25.ArrayOfGuestDiskInfo;
import com.vmware.vim25.GuestDiskInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGuestDiskInfo", propOrder = {"guestDiskInfo"})
public class ArrayOfGuestDiskInfo {
  @XmlElement(name = "GuestDiskInfo")
  protected List<GuestDiskInfo> guestDiskInfo;
  
  public List<GuestDiskInfo> getGuestDiskInfo() {
    if (this.guestDiskInfo == null)
      this.guestDiskInfo = new ArrayList<>(); 
    return this.guestDiskInfo;
  }
}
