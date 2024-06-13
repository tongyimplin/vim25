package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.KeyAnyValue;
import com.vmware.vim25.LinkLayerDiscoveryProtocolInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkLayerDiscoveryProtocolInfo", propOrder = {"chassisId", "portId", "timeToLive", "parameter"})
public class LinkLayerDiscoveryProtocolInfo extends DynamicData {
  @XmlElement(required = true)
  protected String chassisId;
  
  @XmlElement(required = true)
  protected String portId;
  
  protected int timeToLive;
  
  protected List<KeyAnyValue> parameter;
  
  public String getChassisId() {
    return this.chassisId;
  }
  
  public void setChassisId(String paramString) {
    this.chassisId = paramString;
  }
  
  public String getPortId() {
    return this.portId;
  }
  
  public void setPortId(String paramString) {
    this.portId = paramString;
  }
  
  public int getTimeToLive() {
    return this.timeToLive;
  }
  
  public void setTimeToLive(int paramInt) {
    this.timeToLive = paramInt;
  }
  
  public List<KeyAnyValue> getParameter() {
    if (this.parameter == null)
      this.parameter = new ArrayList<>(); 
    return this.parameter;
  }
}
