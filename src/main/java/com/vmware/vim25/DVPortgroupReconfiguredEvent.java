package com.vmware.vim25;

import com.vmware.vim25.ChangesInfoEventArgument;
import com.vmware.vim25.DVPortgroupConfigSpec;
import com.vmware.vim25.DVPortgroupEvent;
import com.vmware.vim25.DVPortgroupReconfiguredEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVPortgroupReconfiguredEvent", propOrder = {"configSpec", "configChanges"})
public class DVPortgroupReconfiguredEvent extends DVPortgroupEvent {
  @XmlElement(required = true)
  protected DVPortgroupConfigSpec configSpec;
  
  protected ChangesInfoEventArgument configChanges;
  
  public DVPortgroupConfigSpec getConfigSpec() {
    return this.configSpec;
  }
  
  public void setConfigSpec(DVPortgroupConfigSpec paramDVPortgroupConfigSpec) {
    this.configSpec = paramDVPortgroupConfigSpec;
  }
  
  public ChangesInfoEventArgument getConfigChanges() {
    return this.configChanges;
  }
  
  public void setConfigChanges(ChangesInfoEventArgument paramChangesInfoEventArgument) {
    this.configChanges = paramChangesInfoEventArgument;
  }
}
