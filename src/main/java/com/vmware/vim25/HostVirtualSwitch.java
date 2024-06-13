package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVirtualSwitch;
import com.vmware.vim25.HostVirtualSwitchSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVirtualSwitch", propOrder = {"name", "key", "numPorts", "numPortsAvailable", "mtu", "portgroup", "pnic", "spec"})
public class HostVirtualSwitch extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String key;
  
  protected int numPorts;
  
  protected int numPortsAvailable;
  
  protected Integer mtu;
  
  protected List<String> portgroup;
  
  protected List<String> pnic;
  
  @XmlElement(required = true)
  protected HostVirtualSwitchSpec spec;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public int getNumPorts() {
    return this.numPorts;
  }
  
  public void setNumPorts(int paramInt) {
    this.numPorts = paramInt;
  }
  
  public int getNumPortsAvailable() {
    return this.numPortsAvailable;
  }
  
  public void setNumPortsAvailable(int paramInt) {
    this.numPortsAvailable = paramInt;
  }
  
  public Integer getMtu() {
    return this.mtu;
  }
  
  public void setMtu(Integer paramInteger) {
    this.mtu = paramInteger;
  }
  
  public List<String> getPortgroup() {
    if (this.portgroup == null)
      this.portgroup = new ArrayList<>(); 
    return this.portgroup;
  }
  
  public List<String> getPnic() {
    if (this.pnic == null)
      this.pnic = new ArrayList<>(); 
    return this.pnic;
  }
  
  public HostVirtualSwitchSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostVirtualSwitchSpec paramHostVirtualSwitchSpec) {
    this.spec = paramHostVirtualSwitchSpec;
  }
}
