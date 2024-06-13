package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VMwareVspanPort;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareVspanPort", propOrder = {"portKey", "uplinkPortName", "wildcardPortConnecteeType", "vlans", "ipAddress"})
public class VMwareVspanPort extends DynamicData {
  protected List<String> portKey;
  
  protected List<String> uplinkPortName;
  
  protected List<String> wildcardPortConnecteeType;
  
  @XmlElement(type = Integer.class)
  protected List<Integer> vlans;
  
  protected List<String> ipAddress;
  
  public List<String> getPortKey() {
    if (this.portKey == null)
      this.portKey = new ArrayList<>(); 
    return this.portKey;
  }
  
  public List<String> getUplinkPortName() {
    if (this.uplinkPortName == null)
      this.uplinkPortName = new ArrayList<>(); 
    return this.uplinkPortName;
  }
  
  public List<String> getWildcardPortConnecteeType() {
    if (this.wildcardPortConnecteeType == null)
      this.wildcardPortConnecteeType = new ArrayList<>(); 
    return this.wildcardPortConnecteeType;
  }
  
  public List<Integer> getVlans() {
    if (this.vlans == null)
      this.vlans = new ArrayList<>(); 
    return this.vlans;
  }
  
  public List<String> getIpAddress() {
    if (this.ipAddress == null)
      this.ipAddress = new ArrayList<>(); 
    return this.ipAddress;
  }
}
