package com.vmware.vim25;

import com.vmware.vim25.GuestListFileInfo;
import com.vmware.vim25.ListFilesInGuestResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "ListFilesInGuestResponse")
public class ListFilesInGuestResponse {
  @XmlElement(required = true)
  protected GuestListFileInfo returnval;
  
  public GuestListFileInfo getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(GuestListFileInfo paramGuestListFileInfo) {
    this.returnval = paramGuestListFileInfo;
  }
}
