package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDhcpServiceSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDhcpServiceSpec", propOrder = {"virtualSwitch", "defaultLeaseDuration", "leaseBeginIp", "leaseEndIp", "maxLeaseDuration", "unlimitedLease", "ipSubnetAddr", "ipSubnetMask"})
public class HostDhcpServiceSpec extends DynamicData {
  @XmlElement(required = true)
  protected String virtualSwitch;
  
  protected int defaultLeaseDuration;
  
  @XmlElement(required = true)
  protected String leaseBeginIp;
  
  @XmlElement(required = true)
  protected String leaseEndIp;
  
  protected int maxLeaseDuration;
  
  protected boolean unlimitedLease;
  
  @XmlElement(required = true)
  protected String ipSubnetAddr;
  
  @XmlElement(required = true)
  protected String ipSubnetMask;
  
  public String getVirtualSwitch() {
    return this.virtualSwitch;
  }
  
  public void setVirtualSwitch(String paramString) {
    this.virtualSwitch = paramString;
  }
  
  public int getDefaultLeaseDuration() {
    return this.defaultLeaseDuration;
  }
  
  public void setDefaultLeaseDuration(int paramInt) {
    this.defaultLeaseDuration = paramInt;
  }
  
  public String getLeaseBeginIp() {
    return this.leaseBeginIp;
  }
  
  public void setLeaseBeginIp(String paramString) {
    this.leaseBeginIp = paramString;
  }
  
  public String getLeaseEndIp() {
    return this.leaseEndIp;
  }
  
  public void setLeaseEndIp(String paramString) {
    this.leaseEndIp = paramString;
  }
  
  public int getMaxLeaseDuration() {
    return this.maxLeaseDuration;
  }
  
  public void setMaxLeaseDuration(int paramInt) {
    this.maxLeaseDuration = paramInt;
  }
  
  public boolean isUnlimitedLease() {
    return this.unlimitedLease;
  }
  
  public void setUnlimitedLease(boolean paramBoolean) {
    this.unlimitedLease = paramBoolean;
  }
  
  public String getIpSubnetAddr() {
    return this.ipSubnetAddr;
  }
  
  public void setIpSubnetAddr(String paramString) {
    this.ipSubnetAddr = paramString;
  }
  
  public String getIpSubnetMask() {
    return this.ipSubnetMask;
  }
  
  public void setIpSubnetMask(String paramString) {
    this.ipSubnetMask = paramString;
  }
}
