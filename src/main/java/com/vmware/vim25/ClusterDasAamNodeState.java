package com.vmware.vim25;

import com.vmware.vim25.ClusterDasAamNodeState;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDasAamNodeState", propOrder = {"host", "name", "configState", "runtimeState"})
public class ClusterDasAamNodeState extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String configState;
  
  @XmlElement(required = true)
  protected String runtimeState;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getConfigState() {
    return this.configState;
  }
  
  public void setConfigState(String paramString) {
    this.configState = paramString;
  }
  
  public String getRuntimeState() {
    return this.runtimeState;
  }
  
  public void setRuntimeState(String paramString) {
    this.runtimeState = paramString;
  }
}
