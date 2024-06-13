package com.vmware.vim25;

import com.vmware.vim25.HostConfigFailed;
import com.vmware.vim25.HostConfigFault;
import com.vmware.vim25.LocalizedMethodFault;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostConfigFailed", propOrder = {"failure"})
public class HostConfigFailed extends HostConfigFault {
  @XmlElement(required = true)
  protected List<LocalizedMethodFault> failure;
  
  public List<LocalizedMethodFault> getFailure() {
    if (this.failure == null)
      this.failure = new ArrayList<>(); 
    return this.failure;
  }
}
