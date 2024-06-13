package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostOpaqueNetworkInfo;
import com.vmware.vim25.OpaqueNetworkCapability;
import com.vmware.vim25.OptionValue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostOpaqueNetworkInfo", propOrder = {"opaqueNetworkId", "opaqueNetworkName", "opaqueNetworkType", "pnicZone", "capability", "extraConfig"})
public class HostOpaqueNetworkInfo extends DynamicData {
  @XmlElement(required = true)
  protected String opaqueNetworkId;
  
  @XmlElement(required = true)
  protected String opaqueNetworkName;
  
  @XmlElement(required = true)
  protected String opaqueNetworkType;
  
  protected List<String> pnicZone;
  
  protected OpaqueNetworkCapability capability;
  
  protected List<OptionValue> extraConfig;
  
  public String getOpaqueNetworkId() {
    return this.opaqueNetworkId;
  }
  
  public void setOpaqueNetworkId(String paramString) {
    this.opaqueNetworkId = paramString;
  }
  
  public String getOpaqueNetworkName() {
    return this.opaqueNetworkName;
  }
  
  public void setOpaqueNetworkName(String paramString) {
    this.opaqueNetworkName = paramString;
  }
  
  public String getOpaqueNetworkType() {
    return this.opaqueNetworkType;
  }
  
  public void setOpaqueNetworkType(String paramString) {
    this.opaqueNetworkType = paramString;
  }
  
  public List<String> getPnicZone() {
    if (this.pnicZone == null)
      this.pnicZone = new ArrayList<>(); 
    return this.pnicZone;
  }
  
  public OpaqueNetworkCapability getCapability() {
    return this.capability;
  }
  
  public void setCapability(OpaqueNetworkCapability paramOpaqueNetworkCapability) {
    this.capability = paramOpaqueNetworkCapability;
  }
  
  public List<OptionValue> getExtraConfig() {
    if (this.extraConfig == null)
      this.extraConfig = new ArrayList<>(); 
    return this.extraConfig;
  }
}
