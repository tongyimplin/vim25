package com.vmware.vim25;

import com.vmware.vim25.ArrayOfGuestRegKeyRecordSpec;
import com.vmware.vim25.GuestRegKeyRecordSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGuestRegKeyRecordSpec", propOrder = {"guestRegKeyRecordSpec"})
public class ArrayOfGuestRegKeyRecordSpec {
  @XmlElement(name = "GuestRegKeyRecordSpec")
  protected List<GuestRegKeyRecordSpec> guestRegKeyRecordSpec;
  
  public List<GuestRegKeyRecordSpec> getGuestRegKeyRecordSpec() {
    if (this.guestRegKeyRecordSpec == null)
      this.guestRegKeyRecordSpec = new ArrayList<>(); 
    return this.guestRegKeyRecordSpec;
  }
}
