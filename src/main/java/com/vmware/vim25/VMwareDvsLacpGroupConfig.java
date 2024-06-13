package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VMwareDvsLacpGroupConfig;
import com.vmware.vim25.VMwareDvsLagIpfixConfig;
import com.vmware.vim25.VMwareDvsLagVlanConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareDvsLacpGroupConfig", propOrder = {"key", "name", "mode", "uplinkNum", "loadbalanceAlgorithm", "vlan", "ipfix", "uplinkName", "uplinkPortKey"})
public class VMwareDvsLacpGroupConfig extends DynamicData {
  protected String key;
  
  protected String name;
  
  protected String mode;
  
  protected Integer uplinkNum;
  
  protected String loadbalanceAlgorithm;
  
  protected VMwareDvsLagVlanConfig vlan;
  
  protected VMwareDvsLagIpfixConfig ipfix;
  
  protected List<String> uplinkName;
  
  protected List<String> uplinkPortKey;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getMode() {
    return this.mode;
  }
  
  public void setMode(String paramString) {
    this.mode = paramString;
  }
  
  public Integer getUplinkNum() {
    return this.uplinkNum;
  }
  
  public void setUplinkNum(Integer paramInteger) {
    this.uplinkNum = paramInteger;
  }
  
  public String getLoadbalanceAlgorithm() {
    return this.loadbalanceAlgorithm;
  }
  
  public void setLoadbalanceAlgorithm(String paramString) {
    this.loadbalanceAlgorithm = paramString;
  }
  
  public VMwareDvsLagVlanConfig getVlan() {
    return this.vlan;
  }
  
  public void setVlan(VMwareDvsLagVlanConfig paramVMwareDvsLagVlanConfig) {
    this.vlan = paramVMwareDvsLagVlanConfig;
  }
  
  public VMwareDvsLagIpfixConfig getIpfix() {
    return this.ipfix;
  }
  
  public void setIpfix(VMwareDvsLagIpfixConfig paramVMwareDvsLagIpfixConfig) {
    this.ipfix = paramVMwareDvsLagIpfixConfig;
  }
  
  public List<String> getUplinkName() {
    if (this.uplinkName == null)
      this.uplinkName = new ArrayList<>(); 
    return this.uplinkName;
  }
  
  public List<String> getUplinkPortKey() {
    if (this.uplinkPortKey == null)
      this.uplinkPortKey = new ArrayList<>(); 
    return this.uplinkPortKey;
  }
}
