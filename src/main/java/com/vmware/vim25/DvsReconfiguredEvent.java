package com.vmware.vim25;

import com.vmware.vim25.ChangesInfoEventArgument;
import com.vmware.vim25.DVSConfigSpec;
import com.vmware.vim25.DvsEvent;
import com.vmware.vim25.DvsReconfiguredEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsReconfiguredEvent", propOrder = {"configSpec", "configChanges"})
public class DvsReconfiguredEvent extends DvsEvent {
  @XmlElement(required = true)
  protected DVSConfigSpec configSpec;
  
  protected ChangesInfoEventArgument configChanges;
  
  public DVSConfigSpec getConfigSpec() {
    return this.configSpec;
  }
  
  public void setConfigSpec(DVSConfigSpec paramDVSConfigSpec) {
    this.configSpec = paramDVSConfigSpec;
  }
  
  public ChangesInfoEventArgument getConfigChanges() {
    return this.configChanges;
  }
  
  public void setConfigChanges(ChangesInfoEventArgument paramChangesInfoEventArgument) {
    this.configChanges = paramChangesInfoEventArgument;
  }
}
