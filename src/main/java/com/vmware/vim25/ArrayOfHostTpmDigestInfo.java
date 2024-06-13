package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostTpmDigestInfo;
import com.vmware.vim25.HostTpmDigestInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostTpmDigestInfo", propOrder = {"hostTpmDigestInfo"})
public class ArrayOfHostTpmDigestInfo {
  @XmlElement(name = "HostTpmDigestInfo")
  protected List<HostTpmDigestInfo> hostTpmDigestInfo;
  
  public List<HostTpmDigestInfo> getHostTpmDigestInfo() {
    if (this.hostTpmDigestInfo == null)
      this.hostTpmDigestInfo = new ArrayList<>(); 
    return this.hostTpmDigestInfo;
  }
}
