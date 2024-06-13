package com.vmware.vim25;

import com.vmware.vim25.HostDigestInfo;
import com.vmware.vim25.HostTpmDigestInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostTpmDigestInfo", propOrder = {"pcrNumber"})
public class HostTpmDigestInfo extends HostDigestInfo {
  protected int pcrNumber;
  
  public int getPcrNumber() {
    return this.pcrNumber;
  }
  
  public void setPcrNumber(int paramInt) {
    this.pcrNumber = paramInt;
  }
}
