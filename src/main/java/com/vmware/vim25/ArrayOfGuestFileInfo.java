package com.vmware.vim25;

import com.vmware.vim25.ArrayOfGuestFileInfo;
import com.vmware.vim25.GuestFileInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGuestFileInfo", propOrder = {"guestFileInfo"})
public class ArrayOfGuestFileInfo {
  @XmlElement(name = "GuestFileInfo")
  protected List<GuestFileInfo> guestFileInfo;
  
  public List<GuestFileInfo> getGuestFileInfo() {
    if (this.guestFileInfo == null)
      this.guestFileInfo = new ArrayList<>(); 
    return this.guestFileInfo;
  }
}
