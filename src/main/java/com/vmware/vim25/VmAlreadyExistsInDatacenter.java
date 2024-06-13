package com.vmware.vim25;

import com.vmware.vim25.InvalidFolder;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VmAlreadyExistsInDatacenter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmAlreadyExistsInDatacenter", propOrder = {"host", "hostname", "vm"})
public class VmAlreadyExistsInDatacenter extends InvalidFolder {
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  @XmlElement(required = true)
  protected String hostname;
  
  @XmlElement(required = true)
  protected List<ManagedObjectReference> vm;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public String getHostname() {
    return this.hostname;
  }
  
  public void setHostname(String paramString) {
    this.hostname = paramString;
  }
  
  public List<ManagedObjectReference> getVm() {
    if (this.vm == null)
      this.vm = new ArrayList<>(); 
    return this.vm;
  }
}
