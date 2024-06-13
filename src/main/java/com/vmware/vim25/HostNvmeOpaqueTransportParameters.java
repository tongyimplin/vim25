package com.vmware.vim25;

import com.vmware.vim25.HostNvmeOpaqueTransportParameters;
import com.vmware.vim25.HostNvmeTransportParameters;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNvmeOpaqueTransportParameters", propOrder = {"trtype", "traddr", "adrfam", "trsvcid", "tsas"})
public class HostNvmeOpaqueTransportParameters extends HostNvmeTransportParameters {
  @XmlElement(required = true)
  protected String trtype;
  
  @XmlElement(required = true)
  protected String traddr;
  
  @XmlElement(required = true)
  protected String adrfam;
  
  @XmlElement(required = true)
  protected String trsvcid;
  
  @XmlElement(required = true)
  protected byte[] tsas;
  
  public String getTrtype() {
    return this.trtype;
  }
  
  public void setTrtype(String paramString) {
    this.trtype = paramString;
  }
  
  public String getTraddr() {
    return this.traddr;
  }
  
  public void setTraddr(String paramString) {
    this.traddr = paramString;
  }
  
  public String getAdrfam() {
    return this.adrfam;
  }
  
  public void setAdrfam(String paramString) {
    this.adrfam = paramString;
  }
  
  public String getTrsvcid() {
    return this.trsvcid;
  }
  
  public void setTrsvcid(String paramString) {
    this.trsvcid = paramString;
  }
  
  public byte[] getTsas() {
    return this.tsas;
  }
  
  public void setTsas(byte[] paramArrayOfbyte) {
    this.tsas = paramArrayOfbyte;
  }
}
