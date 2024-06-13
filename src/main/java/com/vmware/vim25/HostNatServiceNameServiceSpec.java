package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNatServiceNameServiceSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNatServiceNameServiceSpec", propOrder = {"dnsAutoDetect", "dnsPolicy", "dnsRetries", "dnsTimeout", "dnsNameServer", "nbdsTimeout", "nbnsRetries", "nbnsTimeout"})
public class HostNatServiceNameServiceSpec extends DynamicData {
  protected boolean dnsAutoDetect;
  
  @XmlElement(required = true)
  protected String dnsPolicy;
  
  protected int dnsRetries;
  
  protected int dnsTimeout;
  
  protected List<String> dnsNameServer;
  
  protected int nbdsTimeout;
  
  protected int nbnsRetries;
  
  protected int nbnsTimeout;
  
  public boolean isDnsAutoDetect() {
    return this.dnsAutoDetect;
  }
  
  public void setDnsAutoDetect(boolean paramBoolean) {
    this.dnsAutoDetect = paramBoolean;
  }
  
  public String getDnsPolicy() {
    return this.dnsPolicy;
  }
  
  public void setDnsPolicy(String paramString) {
    this.dnsPolicy = paramString;
  }
  
  public int getDnsRetries() {
    return this.dnsRetries;
  }
  
  public void setDnsRetries(int paramInt) {
    this.dnsRetries = paramInt;
  }
  
  public int getDnsTimeout() {
    return this.dnsTimeout;
  }
  
  public void setDnsTimeout(int paramInt) {
    this.dnsTimeout = paramInt;
  }
  
  public List<String> getDnsNameServer() {
    if (this.dnsNameServer == null)
      this.dnsNameServer = new ArrayList<>(); 
    return this.dnsNameServer;
  }
  
  public int getNbdsTimeout() {
    return this.nbdsTimeout;
  }
  
  public void setNbdsTimeout(int paramInt) {
    this.nbdsTimeout = paramInt;
  }
  
  public int getNbnsRetries() {
    return this.nbnsRetries;
  }
  
  public void setNbnsRetries(int paramInt) {
    this.nbnsRetries = paramInt;
  }
  
  public int getNbnsTimeout() {
    return this.nbnsTimeout;
  }
  
  public void setNbnsTimeout(int paramInt) {
    this.nbnsTimeout = paramInt;
  }
}
