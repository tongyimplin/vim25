package com.vmware.vim25;

import com.vmware.vim25.ArrayOfGuestAuthSubject;
import com.vmware.vim25.GuestAuthSubject;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGuestAuthSubject", propOrder = {"guestAuthSubject"})
public class ArrayOfGuestAuthSubject {
  @XmlElement(name = "GuestAuthSubject")
  protected List<GuestAuthSubject> guestAuthSubject;
  
  public List<GuestAuthSubject> getGuestAuthSubject() {
    if (this.guestAuthSubject == null)
      this.guestAuthSubject = new ArrayList<>(); 
    return this.guestAuthSubject;
  }
}
