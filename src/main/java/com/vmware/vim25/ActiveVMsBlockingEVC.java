package com.vmware.vim25;

import com.vmware.vim25.ActiveVMsBlockingEVC;
import com.vmware.vim25.EVCConfigFault;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActiveVMsBlockingEVC", propOrder = {"evcMode", "host", "hostName"})
public class ActiveVMsBlockingEVC extends EVCConfigFault {
  protected String evcMode;
  
  protected List<ManagedObjectReference> host;
  
  protected List<String> hostName;
  
  public String getEvcMode() {
    return this.evcMode;
  }
  
  public void setEvcMode(String paramString) {
    this.evcMode = paramString;
  }
  
  public List<ManagedObjectReference> getHost() {
    if (this.host == null)
      this.host = new ArrayList<>(); 
    return this.host;
  }
  
  public List<String> getHostName() {
    if (this.hostName == null)
      this.hostName = new ArrayList<>(); 
    return this.hostName;
  }
}
