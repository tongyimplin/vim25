package com.vmware.vim25;

import com.vmware.vim25.BatchResult;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchResult", propOrder = {"result", "hostKey", "ds", "fault"})
public class BatchResult extends DynamicData {
  @XmlElement(required = true)
  protected String result;
  
  @XmlElement(required = true)
  protected String hostKey;
  
  protected ManagedObjectReference ds;
  
  protected LocalizedMethodFault fault;
  
  public String getResult() {
    return this.result;
  }
  
  public void setResult(String paramString) {
    this.result = paramString;
  }
  
  public String getHostKey() {
    return this.hostKey;
  }
  
  public void setHostKey(String paramString) {
    this.hostKey = paramString;
  }
  
  public ManagedObjectReference getDs() {
    return this.ds;
  }
  
  public void setDs(ManagedObjectReference paramManagedObjectReference) {
    this.ds = paramManagedObjectReference;
  }
  
  public LocalizedMethodFault getFault() {
    return this.fault;
  }
  
  public void setFault(LocalizedMethodFault paramLocalizedMethodFault) {
    this.fault = paramLocalizedMethodFault;
  }
}
