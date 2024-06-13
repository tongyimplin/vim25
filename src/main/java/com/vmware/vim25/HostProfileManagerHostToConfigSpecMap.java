package com.vmware.vim25;

import com.vmware.vim25.AnswerFileCreateSpec;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostProfileManagerHostToConfigSpecMap;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostProfileManagerHostToConfigSpecMap", propOrder = {"host", "configSpec"})
public class HostProfileManagerHostToConfigSpecMap extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  @XmlElement(required = true)
  protected AnswerFileCreateSpec configSpec;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public AnswerFileCreateSpec getConfigSpec() {
    return this.configSpec;
  }
  
  public void setConfigSpec(AnswerFileCreateSpec paramAnswerFileCreateSpec) {
    this.configSpec = paramAnswerFileCreateSpec;
  }
}
