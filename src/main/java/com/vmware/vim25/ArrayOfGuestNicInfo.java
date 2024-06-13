package com.vmware.vim25;

import com.vmware.vim25.ArrayOfGuestNicInfo;
import com.vmware.vim25.GuestNicInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGuestNicInfo", propOrder = {"guestNicInfo"})
public class ArrayOfGuestNicInfo {
  @XmlElement(name = "GuestNicInfo")
  protected List<GuestNicInfo> guestNicInfo;
  
  public List<GuestNicInfo> getGuestNicInfo() {
    if (this.guestNicInfo == null)
      this.guestNicInfo = new ArrayList<>(); 
    return this.guestNicInfo;
  }
}
