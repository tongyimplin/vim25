package com.vmware.vim25;

import com.vmware.vim25.ClusterCryptoConfigInfo;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterCryptoConfigInfo", propOrder = {"cryptoMode"})
public class ClusterCryptoConfigInfo extends DynamicData {
  protected String cryptoMode;
  
  public String getCryptoMode() {
    return this.cryptoMode;
  }
  
  public void setCryptoMode(String paramString) {
    this.cryptoMode = paramString;
  }
}
