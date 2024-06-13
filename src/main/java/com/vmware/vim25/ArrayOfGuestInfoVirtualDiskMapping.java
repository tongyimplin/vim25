package com.vmware.vim25;

import com.vmware.vim25.ArrayOfGuestInfoVirtualDiskMapping;
import com.vmware.vim25.GuestInfoVirtualDiskMapping;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGuestInfoVirtualDiskMapping", propOrder = {"guestInfoVirtualDiskMapping"})
public class ArrayOfGuestInfoVirtualDiskMapping {
  @XmlElement(name = "GuestInfoVirtualDiskMapping")
  protected List<GuestInfoVirtualDiskMapping> guestInfoVirtualDiskMapping;
  
  public List<GuestInfoVirtualDiskMapping> getGuestInfoVirtualDiskMapping() {
    if (this.guestInfoVirtualDiskMapping == null)
      this.guestInfoVirtualDiskMapping = new ArrayList<>(); 
    return this.guestInfoVirtualDiskMapping;
  }
}
