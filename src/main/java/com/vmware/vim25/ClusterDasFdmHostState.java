package com.vmware.vim25;

import com.vmware.vim25.ClusterDasFdmHostState;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDasFdmHostState", propOrder = {"state", "stateReporter"})
public class ClusterDasFdmHostState extends DynamicData {
  @XmlElement(required = true)
  protected String state;
  
  protected ManagedObjectReference stateReporter;
  
  public String getState() {
    return this.state;
  }
  
  public void setState(String paramString) {
    this.state = paramString;
  }
  
  public ManagedObjectReference getStateReporter() {
    return this.stateReporter;
  }
  
  public void setStateReporter(ManagedObjectReference paramManagedObjectReference) {
    this.stateReporter = paramManagedObjectReference;
  }
}
