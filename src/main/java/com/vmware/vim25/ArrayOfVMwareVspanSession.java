package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVMwareVspanSession;
import com.vmware.vim25.VMwareVspanSession;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVMwareVspanSession", propOrder = {"vMwareVspanSession"})
public class ArrayOfVMwareVspanSession {
  @XmlElement(name = "VMwareVspanSession")
  protected List<VMwareVspanSession> vMwareVspanSession;
  
  public List<VMwareVspanSession> getVMwareVspanSession() {
    if (this.vMwareVspanSession == null)
      this.vMwareVspanSession = new ArrayList<>(); 
    return this.vMwareVspanSession;
  }
}
