package com.vmware.vim25;

import com.vmware.vim25.ArrayOfGuestProcessInfo;
import com.vmware.vim25.GuestProcessInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGuestProcessInfo", propOrder = {"guestProcessInfo"})
public class ArrayOfGuestProcessInfo {
  @XmlElement(name = "GuestProcessInfo")
  protected List<GuestProcessInfo> guestProcessInfo;
  
  public List<GuestProcessInfo> getGuestProcessInfo() {
    if (this.guestProcessInfo == null)
      this.guestProcessInfo = new ArrayList<>(); 
    return this.guestProcessInfo;
  }
}
