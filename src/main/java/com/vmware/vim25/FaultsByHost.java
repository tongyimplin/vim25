package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FaultsByHost;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultsByHost", propOrder = {"host", "faults"})
public class FaultsByHost extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  protected List<LocalizedMethodFault> faults;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public List<LocalizedMethodFault> getFaults() {
    if (this.faults == null)
      this.faults = new ArrayList<>(); 
    return this.faults;
  }
}
