package com.vmware.vim25;

import com.vmware.vim25.GuestProcessInfo;
import com.vmware.vim25.ListProcessesInGuestResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "ListProcessesInGuestResponse")
public class ListProcessesInGuestResponse {
  protected List<GuestProcessInfo> returnval;
  
  public List<GuestProcessInfo> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
