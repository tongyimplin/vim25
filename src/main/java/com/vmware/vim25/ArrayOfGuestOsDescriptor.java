package com.vmware.vim25;

import com.vmware.vim25.ArrayOfGuestOsDescriptor;
import com.vmware.vim25.GuestOsDescriptor;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGuestOsDescriptor", propOrder = {"guestOsDescriptor"})
public class ArrayOfGuestOsDescriptor {
  @XmlElement(name = "GuestOsDescriptor")
  protected List<GuestOsDescriptor> guestOsDescriptor;
  
  public List<GuestOsDescriptor> getGuestOsDescriptor() {
    if (this.guestOsDescriptor == null)
      this.guestOsDescriptor = new ArrayList<>(); 
    return this.guestOsDescriptor;
  }
}
