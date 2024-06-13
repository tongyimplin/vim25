package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineGuestQuiesceSpec;
import com.vmware.vim25.VirtualMachineWindowsQuiesceSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineGuestQuiesceSpec", propOrder = {"timeout"})
@XmlSeeAlso({VirtualMachineWindowsQuiesceSpec.class})
public class VirtualMachineGuestQuiesceSpec extends DynamicData {
  protected Integer timeout;
  
  public Integer getTimeout() {
    return this.timeout;
  }
  
  public void setTimeout(Integer paramInteger) {
    this.timeout = paramInteger;
  }
}
