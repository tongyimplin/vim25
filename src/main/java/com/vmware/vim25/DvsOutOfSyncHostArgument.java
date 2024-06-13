package com.vmware.vim25;

import com.vmware.vim25.DvsOutOfSyncHostArgument;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostEventArgument;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsOutOfSyncHostArgument", propOrder = {"outOfSyncHost", "configParamters"})
public class DvsOutOfSyncHostArgument extends DynamicData {
  @XmlElement(required = true)
  protected HostEventArgument outOfSyncHost;
  
  @XmlElement(required = true)
  protected List<String> configParamters;
  
  public HostEventArgument getOutOfSyncHost() {
    return this.outOfSyncHost;
  }
  
  public void setOutOfSyncHost(HostEventArgument paramHostEventArgument) {
    this.outOfSyncHost = paramHostEventArgument;
  }
  
  public List<String> getConfigParamters() {
    if (this.configParamters == null)
      this.configParamters = new ArrayList<>(); 
    return this.configParamters;
  }
}
