package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostSnmpConfigSpec;
import com.vmware.vim25.HostSnmpDestination;
import com.vmware.vim25.KeyValue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSnmpConfigSpec", propOrder = {"enabled", "port", "readOnlyCommunities", "trapTargets", "option"})
public class HostSnmpConfigSpec extends DynamicData {
  protected Boolean enabled;
  
  protected Integer port;
  
  protected List<String> readOnlyCommunities;
  
  protected List<HostSnmpDestination> trapTargets;
  
  protected List<KeyValue> option;
  
  public Boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(Boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
  
  public Integer getPort() {
    return this.port;
  }
  
  public void setPort(Integer paramInteger) {
    this.port = paramInteger;
  }
  
  public List<String> getReadOnlyCommunities() {
    if (this.readOnlyCommunities == null)
      this.readOnlyCommunities = new ArrayList<>(); 
    return this.readOnlyCommunities;
  }
  
  public List<HostSnmpDestination> getTrapTargets() {
    if (this.trapTargets == null)
      this.trapTargets = new ArrayList<>(); 
    return this.trapTargets;
  }
  
  public List<KeyValue> getOption() {
    if (this.option == null)
      this.option = new ArrayList<>(); 
    return this.option;
  }
}
