package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostSslThumbprintInfo;
import com.vmware.vim25.HostSslThumbprintInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostSslThumbprintInfo", propOrder = {"hostSslThumbprintInfo"})
public class ArrayOfHostSslThumbprintInfo {
  @XmlElement(name = "HostSslThumbprintInfo")
  protected List<HostSslThumbprintInfo> hostSslThumbprintInfo;
  
  public List<HostSslThumbprintInfo> getHostSslThumbprintInfo() {
    if (this.hostSslThumbprintInfo == null)
      this.hostSslThumbprintInfo = new ArrayList<>(); 
    return this.hostSslThumbprintInfo;
  }
}
