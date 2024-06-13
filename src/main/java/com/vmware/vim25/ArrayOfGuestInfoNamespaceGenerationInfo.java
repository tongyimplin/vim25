package com.vmware.vim25;

import com.vmware.vim25.ArrayOfGuestInfoNamespaceGenerationInfo;
import com.vmware.vim25.GuestInfoNamespaceGenerationInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGuestInfoNamespaceGenerationInfo", propOrder = {"guestInfoNamespaceGenerationInfo"})
public class ArrayOfGuestInfoNamespaceGenerationInfo {
  @XmlElement(name = "GuestInfoNamespaceGenerationInfo")
  protected List<GuestInfoNamespaceGenerationInfo> guestInfoNamespaceGenerationInfo;
  
  public List<GuestInfoNamespaceGenerationInfo> getGuestInfoNamespaceGenerationInfo() {
    if (this.guestInfoNamespaceGenerationInfo == null)
      this.guestInfoNamespaceGenerationInfo = new ArrayList<>(); 
    return this.guestInfoNamespaceGenerationInfo;
  }
}
