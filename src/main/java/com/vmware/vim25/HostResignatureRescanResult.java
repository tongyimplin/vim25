package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostResignatureRescanResult;
import com.vmware.vim25.HostVmfsRescanResult;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostResignatureRescanResult", propOrder = {"rescan", "result"})
public class HostResignatureRescanResult extends DynamicData {
  protected List<HostVmfsRescanResult> rescan;
  
  @XmlElement(required = true)
  protected ManagedObjectReference result;
  
  public List<HostVmfsRescanResult> getRescan() {
    if (this.rescan == null)
      this.rescan = new ArrayList<>(); 
    return this.rescan;
  }
  
  public ManagedObjectReference getResult() {
    return this.result;
  }
  
  public void setResult(ManagedObjectReference paramManagedObjectReference) {
    this.result = paramManagedObjectReference;
  }
}
