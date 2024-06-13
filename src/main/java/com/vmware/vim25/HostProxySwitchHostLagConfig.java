package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostProxySwitchHostLagConfig;
import com.vmware.vim25.KeyValue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostProxySwitchHostLagConfig", propOrder = {"lagKey", "lagName", "uplinkPort"})
public class HostProxySwitchHostLagConfig extends DynamicData {
  @XmlElement(required = true)
  protected String lagKey;
  
  protected String lagName;
  
  protected List<KeyValue> uplinkPort;
  
  public String getLagKey() {
    return this.lagKey;
  }
  
  public void setLagKey(String paramString) {
    this.lagKey = paramString;
  }
  
  public String getLagName() {
    return this.lagName;
  }
  
  public void setLagName(String paramString) {
    this.lagName = paramString;
  }
  
  public List<KeyValue> getUplinkPort() {
    if (this.uplinkPort == null)
      this.uplinkPort = new ArrayList<>(); 
    return this.uplinkPort;
  }
}
