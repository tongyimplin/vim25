package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.KeyProviderId;
import com.vmware.vim25.KmipServerInfo;
import com.vmware.vim25.KmipServerSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KmipServerSpec", propOrder = {"clusterId", "info", "password"})
public class KmipServerSpec extends DynamicData {
  @XmlElement(required = true)
  protected KeyProviderId clusterId;
  
  @XmlElement(required = true)
  protected KmipServerInfo info;
  
  protected String password;
  
  public KeyProviderId getClusterId() {
    return this.clusterId;
  }
  
  public void setClusterId(KeyProviderId paramKeyProviderId) {
    this.clusterId = paramKeyProviderId;
  }
  
  public KmipServerInfo getInfo() {
    return this.info;
  }
  
  public void setInfo(KmipServerInfo paramKmipServerInfo) {
    this.info = paramKmipServerInfo;
  }
  
  public String getPassword() {
    return this.password;
  }
  
  public void setPassword(String paramString) {
    this.password = paramString;
  }
}
