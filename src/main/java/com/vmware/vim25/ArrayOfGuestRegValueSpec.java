package com.vmware.vim25;

import com.vmware.vim25.ArrayOfGuestRegValueSpec;
import com.vmware.vim25.GuestRegValueSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGuestRegValueSpec", propOrder = {"guestRegValueSpec"})
public class ArrayOfGuestRegValueSpec {
  @XmlElement(name = "GuestRegValueSpec")
  protected List<GuestRegValueSpec> guestRegValueSpec;
  
  public List<GuestRegValueSpec> getGuestRegValueSpec() {
    if (this.guestRegValueSpec == null)
      this.guestRegValueSpec = new ArrayList<>(); 
    return this.guestRegValueSpec;
  }
}
